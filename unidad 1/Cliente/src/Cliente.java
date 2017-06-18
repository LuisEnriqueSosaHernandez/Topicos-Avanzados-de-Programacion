
import java.io.DataInputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Cliente {

    static DataInputStream dis ;
    static String ip = "10.25.0.27";
    static int port = 9000;
    static Socket Cliente;

    public static void main(String[] args) {
        try {
            Cliente = new Socket(ip, port);
            dis = new DataInputStream(Cliente.getInputStream());
            JOptionPane.showMessageDialog(null, dis.readLine(),"Respuesta", JOptionPane.CANCEL_OPTION);
        } catch (IOException ex) {
            Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Error", "Fallido", JOptionPane.CANCEL_OPTION);
        }

    }

}
