package org.bolivia.game;
import java.awt.Color;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.concurrent.ExecutionException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingWorker;
/**
 * @web http://www.jc-mouse.net/
 * @author Mouse
 */
public class CheckWorker extends SwingWorker<Boolean, Void>{
    protected Socket sk;
    protected DataOutputStream dos;
    protected DataInputStream dis;
    private JLabel label;
    private JTextField credito;
    private JTextField apuesta;
    private JTextField bolsa;
    private JLabel boton;
    SwingWorker swingWorkerA;
    SwingWorker swingWorkerB;
    SwingWorker swingWorkerC;
    
    /**
     * Constructor de clase
     */
    CheckWorker(SwingWorker a, SwingWorker b, SwingWorker c, JLabel lb, JTextField cr, JTextField ap, JTextField bl, JLabel btn)
    {
        this.swingWorkerA=a;
        this.swingWorkerB=b;
        this.swingWorkerC=c;
        label = lb;
        credito = cr;
        apuesta = ap;
        bolsa = bl;
        boton = btn;
        
    }
    
    @Override
    protected Boolean doInBackground() throws Exception {
        
        int val1= (Integer) swingWorkerA.get(); 
        int val2= (Integer) swingWorkerB.get(); 
        int val3= (Integer) swingWorkerC.get();         
        if( val1==val2 && val2 == val3 )
        {            
            return true;//gana
        }        
        else
        {            
            return false;//pierde
        }        
    }
    
    @Override
    protected void done(){   
        try {
            //segun resultado de juego actualiza interfaz
            if( get() )
            {
                credito.setText( ""+(Integer.parseInt(credito.getText()) + Integer.parseInt(apuesta.getText())) );
                
                
                sk = new Socket(Juego.IP, 8080);
                dos = new DataOutputStream(sk.getOutputStream());
                dis = new DataInputStream(sk.getInputStream());
                dos.writeUTF(Juego.usr);
                dos.writeUTF(Juego.pass);
                 String respuesta="";
                respuesta = dis.readUTF();
                dos.writeUTF("-"+apuesta.getText());
           
            
               respuesta = dis.readUTF();
               
                
                bolsa.setText(respuesta);
                
                label.setForeground(Color.yellow);
                
                label.setText( "¡POKÉGANASTE!" );    
                dis.close();
            dos.close();
            sk.close();
            }
            else
            {
                credito.setText( ""+(Integer.parseInt(credito.getText()) - Integer.parseInt(apuesta.getText())) );
                sk = new Socket(Juego.IP, 8080);
                dos = new DataOutputStream(sk.getOutputStream());
                dis = new DataInputStream(sk.getInputStream());
                dos.writeUTF(Juego.usr);
                dos.writeUTF(Juego.pass);
                 String respuesta="";
                respuesta = dis.readUTF();
                dos.writeUTF(apuesta.getText());
           
               respuesta = dis.readUTF();
                bolsa.setText(respuesta);
                label.setForeground(Color.red);
                label.setText( "¡POKÉPERDISTE!" );  
                dis.close();
            dos.close();
            sk.close();
            }           
            boton.setEnabled(true);
        } catch (InterruptedException ex) {
            System.err.println("InterruptedException: " + ex.getMessage());
        } catch (ExecutionException ex) {
            System.err.println("ExecutionException: " + ex.getMessage());
        } catch (IOException ex) {
            Logger.getLogger(CheckWorker.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
