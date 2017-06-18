/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectodecarreras;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;
import java.net.ServerSocket;
import java.net.Socket;
//
import java.awt.BorderLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
/**
 *
 * @author Uriel
 */


public class Accion extends JFrame implements KeyListener,Runnable{
    
    
    DataOutputStream dos;
    DataInputStream dis;
    ServerSocket puerto;
    Socket canalComunicacion;
    Thread server;
    String envio;
    boolean b=false;
    JLabel inicio;
        
    
   
    
    public Accion() throws IOException{
     vista();
    }
    //public JLabel lbl1;
    //public JLabel lbl2;
 
    ImageIcon Auto,Vehiculo;
    JLabel imagen,animacion;
    String[] nombres = {"Auto1","Auto2"};
    int x=0;
    
    int y=0;
    int x2=0;
    public void vista() throws IOException{
        Thread server=new Thread(this);
        server.start();
            inicio=new JLabel("En espera");
            inicio.setBounds(0,520, 120, 20);
       // this.setSize(1000,600);
        this.setTitle("Arena");
        this.setBounds(0, 0, 1000, 600);
       
    
        JPanel panelMayor=new JPanel(new BorderLayout()); //panel mayor
        
        JPanel panelCentro=new JPanel(null);
        
        GridBagLayout gbl = new GridBagLayout();
        GridBagConstraints gbc = new GridBagConstraints();
       // panelCentro.setLayout(gbl);
        
       //
        Auto= new ImageIcon(Accion.class.getResource("Auto1.gif"));
        imagen = new JLabel(Auto);
        imagen.setBounds(0,0,285,164);
        addKeyListener(this);
        //for(int i=0;i<2;i++) {
        Vehiculo=new ImageIcon(Accion.class.getResource("Auto2.gif"));
        animacion = new JLabel(Vehiculo);
        animacion.setBounds(0,350,285,164);
        //aqui iba el keyListener
        //animacion.setBounds(0,350,285,164);
        //}
        //JLabel lbl3=new JLabel("Auto1");
        //lbl2=new JLabel();
        //lbl2.setIcon(new ImageIcon(getClass().getResource("Auto2.gif")));
        //JLabel lbl4=new JLabel("Auto2");
        
        gbc.anchor = GridBagConstraints.WEST;
        //gbc.gridy=0; //La parte de arriba sera la que obedecera el panel
        //gbc.gridx=1
        gbc.gridy=0;
        gbc.gridx=1;
        panelCentro.add(imagen,gbc);
        
        //panelCentro.add(lbl3,gbc);
        /*gbc.gridy=10;
        gbc.gridx=1;*/
        gbc.gridy=5;
        gbc.gridx=1;
        panelCentro.add(animacion,gbc);
        
        //panelCentro.add(lbl4,gbc);
       
       
        
        
        panelMayor.add(panelCentro,null);
        this.add(inicio);
        this.add(panelMayor);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
         
    }
    
   
    
    @Override
    public void keyTyped(KeyEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyPressed(KeyEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
   
    
    if(e.getKeyCode()==39&&b==true){
        try {
            x+=2;
            imagen.setBounds(x, y,285,164);
             dos.writeUTF("A");
            
        } catch (IOException ex) {
            Logger.getLogger(Accion.class.getName()).log(Level.SEVERE, null, ex);
        }
     
    }
   
    }

    @Override
    public void keyReleased(KeyEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void run() {
        try {
            ServerSocket puerto = new ServerSocket(7676);
            Socket canalComunicacion = puerto.accept();
             //System.out.println("Nueva conexión entrante: "+puerto);
             if(puerto!=null){
                 b=true;
                 inicio.setText("Juego iniciado");
             }
             dos = new DataOutputStream(canalComunicacion.getOutputStream());
            dis = new DataInputStream(canalComunicacion.getInputStream());
            while(true){
           String cadena = dis.readUTF();
            //System.out.println(cadena);
            if(cadena.equals("A")){
                x2+=2;
               animacion.setBounds(x2, 350,285,164);
            }
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
            } catch (IOException ex) {
            Logger.getLogger(Accion.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
 }
