import java.io.*;
import java.net.*;
import java.util.Scanner;
import java.util.logging.*;
public class ServidorHilo extends Thread {
    private Socket socket;
    private DataOutputStream dos;
    private DataInputStream dis;
   Scanner l=new Scanner(System.in);
    public  ServidorHilo(Socket socket) {
        this.socket = socket;
        
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
        String accion = "";
        try {
           accion= dis.readUTF();
         int cantidadusuario=Integer.parseInt(accion);
                
                
        if(cantidadusuario==0){
             String retorno;
             System.out.println("Ingresa la cantidad a donar prro");
        retorno=l.nextLine();
                dos.writeUTF(retorno);
        }
            
        } catch (IOException ex) {
            Logger.getLogger(ServidorHilo.class.getName()).log(Level.SEVERE, null, ex);
        }
        desconnectar();
    }
}