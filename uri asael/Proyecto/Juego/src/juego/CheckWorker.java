/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juego;

import java.awt.Color;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.util.concurrent.ExecutionException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingWorker;

public class CheckWorker
  extends SwingWorker<Boolean, Void>
{
  private JLabel label;
  private JTextField credito;
  private JTextField apuesta;
  private JLabel boton;
  SwingWorker swingWorkerA;
  SwingWorker swingWorkerB;
  SwingWorker swingWorkerC;
  protected Socket sk;
    protected DataOutputStream dos;
    protected DataInputStream dis;
  
  CheckWorker(SwingWorker a, SwingWorker b, SwingWorker c, JLabel lb, JTextField cr, JTextField ap, JLabel btn)
  {
    this.swingWorkerA = a;
    this.swingWorkerB = b;
    this.swingWorkerC = c;
    this.label = lb;
    this.credito = cr;
    this.apuesta = ap;
    this.boton = btn;
  }
  
  protected Boolean doInBackground()
    throws Exception
  {
    int val1 = ((Integer)this.swingWorkerA.get()).intValue();
    int val2 = ((Integer)this.swingWorkerB.get()).intValue();
    int val3 = ((Integer)this.swingWorkerC.get()).intValue();
    if ((val1 == val2) && (val2 == val3)) {
      return Boolean.valueOf(true);
    }
    return Boolean.valueOf(false);
  }
  
  protected void done()
  {
    try
    {
      if (((Boolean)get()).booleanValue())
      {
        this.credito.setText("" + (Integer.parseInt(this.credito.getText()) + Integer.parseInt(this.apuesta.getText())));
        this.label.setForeground(Color.yellow);
        this.label.setText("Ganaste!");
      }
      else
      {
        this.credito.setText("" + (Integer.parseInt(this.credito.getText()) - Integer.parseInt(this.apuesta.getText())));
        this.label.setForeground(Color.red);
        this.label.setText("Perdiste!");
          sk = new Socket("192.168.1.86", 8080);
            dos = new DataOutputStream(sk.getOutputStream());
            dis = new DataInputStream(sk.getInputStream());
            
            dos.writeUTF(this.credito.getText());
            if(this.credito.getText().equals("0")){
            String respuesta="";
            respuesta = dis.readUTF();
            this.credito.setText(respuesta);
            }
            dis.close();
            dos.close();
            sk.close();
      }
      this.boton.setEnabled(true);
    }
    catch (InterruptedException ex)
    {
      System.err.println("InterruptedException: " + ex.getMessage());
    }
    catch (ExecutionException ex)
    {
      System.err.println("ExecutionException: " + ex.getMessage());
    } catch (IOException ex) {
          Logger.getLogger(CheckWorker.class.getName()).log(Level.SEVERE, null, ex);
      }
  }
}

