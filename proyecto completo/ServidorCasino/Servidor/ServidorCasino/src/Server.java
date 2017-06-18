
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import javax.swing.JPanel;
import javax.swing.JTextField;

public class Server extends JFrame implements ActionListener, Runnable {

    Thread servidor;

    JButton btnPersonalizado;

    JPanel pnl;
    JLabel lblBolsa;
    JLabel lblGanancia;
    JLabel lblServidor;
    JLabel lblConexion;
    JLabel img;

    JLabel img2;
    JLabel img3;
    JLabel img4;
    ImageIcon dratini;
    ImageIcon chango;
    ImageIcon hitmontop;
    ImageIcon haunter;
    ImageIcon imgNormal;
    ImageIcon imgPasar;
    ImageIcon imgPulsado;
    ImageIcon imgNormal2;
    ImageIcon imgPasar2;
    JMenuItem salir;
    JMenu mnu;
    JMenuBar braMenu;
    static JTextField txtBolsa;
    JTextField txtFecha;
    static JTextField txtGanancia;
    Date date = new Date();
    DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

    public Server() {
        super("Casino Pokemón");
        setBounds(275, 80, 800, 600);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        salir= new JMenuItem("Exit");
         salir.setBackground(Color.decode("#3b5998"));
         salir.setForeground(Color.WHITE);
        //paso 2 crear los jmenu
        mnu = new JMenu("Menu");
        mnu.setBackground(Color.decode("#3b5998"));
        mnu.setForeground(Color.WHITE);
        //paso 3 crear jmenubar
        braMenu = new JMenuBar();
        //paso 4, agregar los comandos jmenuitem a los menus
        braMenu.setBackground(Color.decode("#3b5998"));
        braMenu.setForeground(Color.WHITE);
        

        mnu.add(salir);

        //paso 5,agregar los menus a la barra de menus
        braMenu.add(mnu);

        setJMenuBar(braMenu);
        chango = new ImageIcon(Server.class.getResource("/MisImagenes/chango.gif"));
        dratini = new ImageIcon(Server.class.getResource("/MisImagenes/dratini.gif"));
        hitmontop = new ImageIcon(Server.class.getResource("/MisImagenes/hitmontop.gif"));
        haunter = new ImageIcon(Server.class.getResource("/MisImagenes/haunter.gif"));
        imgNormal = new ImageIcon(Server.class.getResource("/MisImagenes/primera.png"));
        btnPersonalizado = new JButton("");
        btnPersonalizado.setBounds(300, 60, 146, 146);
        imgNormal = new ImageIcon(Server.class.getResource("/MisImagenes/primera.png"));
        imgPulsado = new ImageIcon(Server.class.getResource("/MisImagenes/tercera.png"));
        imgPasar = new ImageIcon(Server.class.getResource("/MisImagenes/segunda.png"));

        btnPersonalizado.setBorder(null);
        btnPersonalizado.setBorderPainted(false);
        btnPersonalizado.setContentAreaFilled(false);
        btnPersonalizado.setIcon(imgNormal);
        btnPersonalizado.setPressedIcon(imgPulsado);
        btnPersonalizado.setRolloverIcon(imgPasar);

        img = new javax.swing.JLabel(dratini);
        img.setBounds(10, 10, 100, 100);

        img2 = new javax.swing.JLabel(haunter);
        img2.setBounds(10, 110, 100, 100);

        img3 = new javax.swing.JLabel(hitmontop);
        img3.setBounds(10, 210, 100, 100);

        img4 = new javax.swing.JLabel(chango);
        img4.setBounds(10, 310, 100, 100);

        lblServidor = new JLabel();
        lblServidor.setBounds(310, 200, 160, 14);
        
        lblConexion = new JLabel();
        lblConexion.setBounds(150, 230, 500, 14);

        lblBolsa = new JLabel("Bolsa acomulada $");
        lblBolsa.setBounds(20, 460, 115, 14);

        txtBolsa = new JTextField("1000000");
       // txtBolsa.setEnabled(false);
        txtBolsa.setBounds(130, 457, 180, 20);

        txtBolsa.setColumns(10);

        lblGanancia = new JLabel("Ganancias $");
        lblGanancia.setBounds(500, 460, 70, 14);

        txtGanancia = new JTextField("0");
        //txtGanancia.setEnabled(false);
        txtGanancia.setBounds(573, 457, 185, 20);

        txtGanancia.setColumns(10);

        txtFecha = new JTextField();
        //txtFecha.setEnabled(false);
        txtFecha.setBounds(350, 457, 142, 20);
        txtFecha.setFont(new Font("Tahoma", Font.BOLD, 14));

        txtFecha.setColumns(10);

        txtFecha.setText("Fecha: " + dateFormat.format(date));

        pnl = new JPanel(null);
        pnl.add(img);
        pnl.add(img2);
        pnl.add(img3);
        pnl.add(img4);
        pnl.add(txtFecha);

        pnl.add(btnPersonalizado);
        pnl.add(txtGanancia);
        pnl.add(lblGanancia);
        pnl.add(txtBolsa);
        pnl.add(lblBolsa);
        pnl.add(lblConexion);
        pnl.add(lblServidor);
        pnl.setBackground(Color.LIGHT_GRAY);
        add(pnl);
        mnu.setCursor(new Cursor(HAND_CURSOR));
        salir.setCursor(new Cursor(HAND_CURSOR));
       btnPersonalizado.setCursor(new Cursor(HAND_CURSOR));
        btnPersonalizado.addActionListener(this);
        salir.addActionListener(this);
        setVisible(true);

    }

    public static void main(String[] args) {
        new Server();

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnPersonalizado) {
            servidor = new Thread(this);
            servidor.start();
            //JOptionPane.showMessageDialog(null,"Servidor Iniciado");

            imgNormal.setImage(imgPulsado.getImage());

            btnPersonalizado.setEnabled(false);

        }
        if (e.getSource() == salir) {
            //JOptionPane.showMessageDialog(null,"Servidor Iniciado");

           System.exit(0);

        }
    }

    @Override

    public void run() {
        ServerSocket ss;
        lblServidor.setText("Inicializando servidor... ");
       
        try {
            ss = new ServerSocket(8080);
             lblServidor.setText("Servidor Iniciado [OK]");
            int idSession = 0;
            while (true) {
                Socket socket;
                socket = ss.accept();
                lblConexion.setText("Nueva conexión entrante: " + socket);
                
                ((ServidorHilo) new ServidorHilo(socket, idSession)).start();
                idSession++;
            }
        } catch (IOException ex) {
            Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
