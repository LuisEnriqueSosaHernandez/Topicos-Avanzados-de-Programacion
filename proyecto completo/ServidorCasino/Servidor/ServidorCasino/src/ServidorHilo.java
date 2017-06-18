import java.io.*;
import java.net.*;
import java.util.logging.*;
import javax.swing.JOptionPane;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;
import org.xml.sax.SAXException;
import sun.font.EAttribute;
public class ServidorHilo extends Thread {
    private Socket socket;
    private DataOutputStream dos;
    private DataInputStream dis;
    private int idSessio;
      long BolsaAcomulada=0;
      long Ganancias=0;
       String accion = "";
       String usuario="";
       String password="";
       Registro r=new Registro();
       Correo c=new Correo();
    public  ServidorHilo(Socket socket, int id) {
        this.socket = socket;
        this.idSessio = id;
        try {
            dos = new DataOutputStream(socket.getOutputStream());
            dis = new DataInputStream(socket.getInputStream());
        } catch (IOException ex) {
            Logger.getLogger(ServidorHilo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public synchronized void desconnectar() {
        try {
            socket.close();
        } catch (IOException ex) {
            Logger.getLogger(ServidorHilo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    @Override
    public synchronized void run() {
        
        try {
            usuario=dis.readUTF();
            password=dis.readUTF();
            if(c.Esuncorreo(password)){
                String pass=c.Mandarcontrasena(usuario);
                c.mandarCorreo(password, pass);
                 dos.writeUTF("contraseña enviada al correo proporcionado"); 
            }else{
                if(r.UsuarioOcupado(usuario, password)){
                   dos.writeUTF("Usuario no disponible intenta con uno nuevo"); 
                }
         if(r.estaregistrado(usuario,password)){
             dos.writeUTF("a");
           accion= dis.readUTF();    
           Ganancias=Long.parseLong(Server.txtGanancia.getText())+Long.parseLong(accion);
           Server.txtGanancia.setText(""+Ganancias);
        BolsaAcomulada= Long.parseLong(Server.txtBolsa.getText())+Long.parseLong(accion);
        Server.txtBolsa.setText(""+BolsaAcomulada);
                dos.writeUTF(""+BolsaAcomulada);
                
         }else{
             dos.writeUTF("Nuevo Registro");
             r.Registro(usuario,password);
         }
            }
            
        } catch (IOException ex) {
            Logger.getLogger(ServidorHilo.class.getName()).log(Level.SEVERE, null, ex);
        }catch (NumberFormatException n){
            JOptionPane.showMessageDialog (null, "Un chistosito esta enviando letras"+n, "Formato incorrecto", JOptionPane.ERROR_MESSAGE);
        } catch (SAXException ex) {
            Logger.getLogger(ServidorHilo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParserConfigurationException ex) {
            Logger.getLogger(ServidorHilo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (TransformerException ex) {
            Logger.getLogger(ServidorHilo.class.getName()).log(Level.SEVERE, null, ex);
        }
        desconnectar();
    }
}