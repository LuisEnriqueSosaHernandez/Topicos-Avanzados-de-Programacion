
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javafx.scene.layout.BorderPane;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LESH
 */
public class ExamenFicticio {
  JButton eventos;
   JButton salida;
   JPanel panel;
   JFrame ventana;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ExamenFicticio ventana=new ExamenFicticio();
    }
    public ExamenFicticio(){
        ventana = new JFrame("Menú");
        panel=new JPanel();
        eventos=new JButton("Eventos");
        salida=new JButton("Salida");
        panel.add(eventos,BorderLayout.CENTER);
        panel.add(salida,BorderLayout.CENTER);
        ventana.add(panel);
        ventana.setResizable(false);
        ventana.setVisible(true);
        ventana.setSize(250,100);
        ventana.setLocationRelativeTo(null);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        salida.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
            
        });
         eventos.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                Eventos events=new Eventos();
                ventana.dispose();
            }
            
        });
    }
     
    
}
