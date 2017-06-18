/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carreragalgos2;

import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class VistaGalgodromo2 extends JFrame {
    public JTextField tfResultado12;
    public JTextField tfResultado22;
    public JTextField tfResultado32;
   
    public JTextField tfCarril12;
    public JTextField tfCarril22;
    public JTextField tfCarril32;
    
    public JLabel lbl12;
    public JLabel lbl22;
    public JLabel lbl32;
    
    public JPanel p;
    
    
    public VistaGalgodromo2(){
        tfResultado12 = new JTextField(10);
        tfResultado22 = new JTextField(10);
        tfResultado32 = new JTextField(10);
        
        tfCarril12 = new JTextField(10);
        tfCarril22 = new JTextField(10);
        tfCarril32 = new JTextField(10);
        
        lbl12 = new JLabel("Carril 1");
        lbl22 = new JLabel("Carril 2");
        lbl32 = new JLabel("Carril 3");
        
        p = new JPanel();
        
        vista2();
    }
    
    public void vista2(){
        this.setSize(450,150);
        this.setLocation(200, 200);
        this.setTitle("GALGODROMO NIVEL 2");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        getContentPane();
        p.setLayout(new GridLayout(3,6,10,10));
        
        p.add(tfResultado12);
        p.add(tfResultado22);
        p.add(tfResultado32);
        
        p.add(lbl12);
        p.add(lbl22);
        p.add(lbl32);
        
        p.add(tfCarril12);
        p.add(tfCarril22);
        p.add(tfCarril32);
        
        this.add(p);
        this.setVisible(true);
    }    
}