package org.bolivia.game;

import java.io.*;
import java.net.Socket;
import java.util.*;
import java.util.logging.*;
import javax.swing.JOptionPane;
class Persona extends Thread {
    protected Socket sk;
    protected DataOutputStream dos;
    protected DataInputStream dis;
    private int id;
    public Persona(int id) {
        this.id = id;
    }
    @Override
    public void run() {
        try {
            sk = new Socket("192.168.1.86", 8080);
            dos = new DataOutputStream(sk.getOutputStream());
            dis = new DataInputStream(sk.getInputStream());
            String nombre;
            nombre=JOptionPane.showInputDialog(JOptionPane.OK_OPTION,"LOLº");
            dos.writeUTF(nombre);
            String respuesta="";
            respuesta = dis.readUTF();
            JOptionPane.showMessageDialog(null, respuesta,"Respuesta", JOptionPane.CANCEL_OPTION);
            dis.close();
            dos.close();
            sk.close();
        } catch (IOException ex) {
            Logger.getLogger(Persona.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
public class Cliente {
    public static void main(String[] args) {
        ArrayList<Thread> clients = new ArrayList<Thread>();
        for (int i = 0; i <10 ; i++) {
            clients.add(new Persona(i));
            
        }
        for (Thread thread : clients) {
            thread.start();
        }
    }
}

