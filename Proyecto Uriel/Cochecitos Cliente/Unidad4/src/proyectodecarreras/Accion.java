/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectodecarreras;

import java.awt.BorderLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
/**
 *
 * @author Uriel
 */
public class Accion extends JFrame implements KeyListener{
    public Accion(){
     vista();
    }
    //public JLabel lbl1;
    //public JLabel lbl2;
    ImageIcon Auto,Vehiculo;
    JLabel imagen,Otra;
    int x=0;
    int y=0;
    public void vista(){
       // this.setSize(1000,600);
        this.setTitle("Arena");
        this.setBounds(0, 0, 1000, 600);
       
    
        JPanel panelMayor=new JPanel(new BorderLayout()); //panel mayor
        
        JPanel panelCentro=new JPanel(null);
        
        GridBagLayout gbl = new GridBagLayout();
        GridBagConstraints gbc = new GridBagConstraints();
       // panelCentro.setLayout(gbl);
        
       //
        Auto= new ImageIcon(Accion.class.getResource("Auto1.gif"));
        imagen = new JLabel(Auto);
        imagen.setBounds(0,0,285,164);
        Vehiculo=new ImageIcon(Accion.class.getResource("Auto2.gif"));
        Otra = new JLabel(Vehiculo);
        addKeyListener(this);
        Otra.setBounds(0,350,285,164);
        //JLabel lbl3=new JLabel("Auto1");
        //lbl2=new JLabel();
        //lbl2.setIcon(new ImageIcon(getClass().getResource("Auto2.gif")));
        //JLabel lbl4=new JLabel("Auto2");
        
        gbc.anchor = GridBagConstraints.WEST;
        //gbc.gridy=0; //La parte de arriba sera la que obedecera el panel
        //gbc.gridx=1
        gbc.gridy=0;
        gbc.gridx=1;
        panelCentro.add(imagen,gbc);
        
        //panelCentro.add(lbl3,gbc);
        /*gbc.gridy=10;
        gbc.gridx=1;*/
        gbc.gridy=5;
        gbc.gridx=1;
        panelCentro.add(Otra,gbc);
        
        //panelCentro.add(lbl4,gbc);
       
        
        
        panelMayor.add(panelCentro,null);
        this.add(panelMayor);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    @Override
    public void keyTyped(KeyEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyPressed(KeyEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
   
    
    if(e.getKeyCode()==39&&x<=725){
     x+=2;
     imagen.setBounds(x, y,285,164);
     Otra.setBounds(x, 350,285,164);
    }
   
    }

    @Override
    public void keyReleased(KeyEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
 }
