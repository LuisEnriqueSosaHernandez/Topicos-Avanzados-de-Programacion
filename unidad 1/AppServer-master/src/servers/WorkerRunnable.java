/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servers;

import java.io.InputStream;
import java.io.OutputStream;
import java.io.DataInputStream;
import java.io.InputStreamReader;
import java.io.IOException;
import java.net.Socket;
import javax.swing.JOptionPane;

/**

 */
public class WorkerRunnable implements Runnable{

    protected Socket clientSocket = null;
    protected String serverText   = null;

    public WorkerRunnable(Socket clientSocket, String serverText) {
        this.clientSocket = clientSocket;
        this.serverText   = serverText;
    }

    public void run() {
        DataInputStream ds;
        InputStreamReader ir;
        try {
            InputStream input  = clientSocket.getInputStream();
            OutputStream output = clientSocket.getOutputStream();
            long time = System.currentTimeMillis();
            
            output.write(("HTTP/1.1 200 Respuesta del Servidor\n\nWorkerRunnable: " +                    
                    this.serverText + " - " +
                    time +
                    "").getBytes());
            output.close();
            input.close();
            JOptionPane.showMessageDialog(null, "Peticion procesada: " + time,"Peticion", JOptionPane.CANCEL_OPTION);
            System.out.println("Peticion procesada: " + time);
        } catch (IOException e) {
            //report exception somewhere.
            e.printStackTrace();
        }
    }
}

