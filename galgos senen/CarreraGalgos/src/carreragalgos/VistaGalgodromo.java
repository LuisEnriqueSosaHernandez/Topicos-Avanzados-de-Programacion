package carreragalgos;

import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class VistaGalgodromo extends JFrame {
    public JTextField tfResultado1;
    public JTextField tfResultado2;
   
    public JTextField tfCarril1;
    public JTextField tfCarril2;
    
    public JLabel lbl1;
    public JLabel lbl2;
    
    public JPanel p;
    
    
    public VistaGalgodromo(){
        tfResultado1 = new JTextField(10);
        tfResultado2 = new JTextField(10);
        
        tfCarril1 = new JTextField(10);
        tfCarril2 = new JTextField(10);
        
        lbl1 = new JLabel("Carril 1");
        lbl2 = new JLabel("Carril 2");
        
        p = new JPanel();
        
        vista();
    }
    
    public void vista(){
        this.setSize(450,150);
        this.setLocation(200, 200);
        this.setTitle("GALGODROMO NIVEL 1");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        getContentPane();
        p.setLayout(new GridLayout(3,6,10,10));
        
        p.add(tfResultado1);
        p.add(tfResultado2);
        
        p.add(lbl1);
        p.add(lbl2);
        
        p.add(tfCarril1);
        p.add(tfCarril2);
        
        this.add(p);
        this.setVisible(true);
    }  
    
}