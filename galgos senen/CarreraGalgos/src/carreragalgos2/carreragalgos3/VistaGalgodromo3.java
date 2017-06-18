/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carreragalgos3;

import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class VistaGalgodromo3 extends JFrame {
    public JTextField tfResultado13;
    public JTextField tfResultado23;
    public JTextField tfResultado33;
    public JTextField tfResultado43;
   
    public JTextField tfCarril13;
    public JTextField tfCarril23;
    public JTextField tfCarril33;
    public JTextField tfCarril43;
    
    public JLabel lbl13;
    public JLabel lbl23;
    public JLabel lbl33;
    public JLabel lbl43;
    
    public JPanel p;
    
    
    public VistaGalgodromo3(){
        tfResultado13 = new JTextField(10);
        tfResultado23 = new JTextField(10);
        tfResultado33 = new JTextField(10);
        tfResultado43 = new JTextField(10);
        
        tfCarril13 = new JTextField(10);
        tfCarril23 = new JTextField(10);
        tfCarril33 = new JTextField(10);
        tfCarril43 = new JTextField(10);
        
        lbl13 = new JLabel("Carril 1");
        lbl23 = new JLabel("Carril 2");
        lbl33 = new JLabel("Carril 3");
        lbl43 = new JLabel("Carril 3");
        
        p = new JPanel();
        
        vista3();
    }
    
    public void vista3(){
        this.setSize(450,150);
        this.setLocation(200, 200);
        this.setTitle("GALGODROMO NIVEL 3");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        getContentPane();
        p.setLayout(new GridLayout(3,6,10,10));
        
        p.add(tfResultado13);
        p.add(tfResultado23);
        p.add(tfResultado33);
        p.add(tfResultado43);
        
        p.add(lbl13);
        p.add(lbl23);
        p.add(lbl33);
        p.add(lbl43);
        
        p.add(tfCarril13);
        p.add(tfCarril23);
        p.add(tfCarril33);
        p.add(tfCarril43);
        
        this.add(p);
        this.setVisible(true);
    }    
}
