
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.File;
import javafx.scene.layout.Border;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.filechooser.FileNameExtensionFilter;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author LESH
 */
public class Eventos extends JPanel {
    JButton teclado;
    JButton imagen;
    JButton menu;
    JPanel panel;
    JPanel panel2;
    JFrame ventana;
    JLabel image;
  
  
    public Eventos() {
        initcomponents();
    }
    public void initcomponents(){
        
        teclado = new JButton("Teclado");
        imagen = new JButton("Imagen");
        menu = new JButton("Menú");
        image = new JLabel();
        panel = new JPanel();
        panel.setBackground(Color.PINK);
        panel.add(image);
        panel2 = new JPanel();
        ventana = new JFrame();
        panel2.add(teclado);
        panel2.add(imagen);
        panel2.add(menu);
        ventana.add(panel2, BorderLayout.NORTH);
        ventana.add(panel);
        ventana.setResizable(false);
        ventana.setVisible(true);
        ventana.setSize(500, 500);
        ventana.setLocationRelativeTo(null);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        teclado.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                image.setIcon(null);
                image.setSize(0, 0);

            }

        });

        
        
        teclado.addKeyListener(new KeyListener() {
           
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {
                int key = e.getKeyCode();
                if (key == 65) {
                    try{
        Graphics g=getGraphics();
     g.drawLine(10, 10, 10, 10);
                    }catch(Exception er){
                        System.out.println(er.getMessage());
                    }
                       
                    
                    
                }
                System.out.println("Presionó Enter!" + key);
            }

            @Override
            public void keyReleased(KeyEvent e) {

            }

        });

        imagen.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                FileNameExtensionFilter filtro = new FileNameExtensionFilter("Formatos de Imagenes", "jpg", "jpeg", "png");
                JFileChooser archivo = new JFileChooser();
                archivo.addChoosableFileFilter(filtro);
                archivo.setDialogTitle("Abrir Imagen");
                File ruta = new File("");
                archivo.setCurrentDirectory(ruta);
                int ventana = archivo.showOpenDialog(null);
                if (ventana == JFileChooser.APPROVE_OPTION) {
                    File file = archivo.getSelectedFile();
                    String texto = String.valueOf(file);
                    ImageIcon imagen = new ImageIcon(texto);
                    image.setSize(400, 400);
                    Icon icono = new ImageIcon(imagen.getImage().getScaledInstance(image.getWidth(), image.getHeight(), Image.SCALE_DEFAULT));
                    image.setIcon(icono);
                }
            }

        });
    }
    
  
}
