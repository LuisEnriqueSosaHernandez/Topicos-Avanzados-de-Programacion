/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carreragalgos3;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author FVPP
 */
public class Seleccion3 extends JFrame implements ActionListener{
    public JFrame f;
    public JPanel panelMayor, panelNorte, panelCentro, panelSur, panelEste, panelOeste;
    public JLabel lbl5;
    public JButton bs1, bs2;
    public JTextField tf13;
    
    public Galgodromo3 gal3;
    
//    public int conv;

    
    public Seleccion3(){
    JFrame f = new JFrame();
   
    //Declaración de panel
    panelMayor = new JPanel(new BorderLayout());  
    panelNorte = new JPanel();
    panelCentro = new JPanel();
    panelSur = new JPanel();
    panelEste = new JPanel();
    panelOeste = new JPanel();
    
    //Declaraciones
    FlowLayout fl1 = new FlowLayout (FlowLayout.CENTER);
    panelNorte.setLayout(fl1);
    
    GridBagLayout gbl1 = new GridBagLayout();
    GridBagConstraints gbc1 = new GridBagConstraints();
    panelCentro.setLayout(gbl1);
    
    FlowLayout fl2 = new FlowLayout();
    panelSur.setLayout(fl2);
    
    GridLayout gl2 = new GridLayout(3, 0);
    panelEste.setLayout(gl2);
    
    GridLayout gl3 = new GridLayout(3, 0);
    panelOeste.setLayout(gl3);
    
    
    //Asignación de formatos 
    
    lbl5 = new JLabel ("Cual es su eleccion?: ");
    
    /////////////////////////////////////////////////////////////////
    
    tf13 = new JTextField(25);
//    String conver = (tf1.getText());
//    conv = Integer.parseInt(conver);
    
    //////////////////////////////////////////////////////////////////
    
    bs1 = new JButton("Comenzar");
    bs1.addActionListener(this);
    
    /////////////////////////////////////////////////////////////////
    
    bs2 = new JButton("Cancelar");
    bs2.addActionListener(this);
   //Orientando los objetos
    
    gbc1.anchor = GridBagConstraints.WEST;
    
    gbc1.gridx = 0;
    gbc1.gridy = 0;
    
    panelCentro.add(lbl5,gbc1);
    gbc1.gridy = 0;
    gbc1.gridwidth = 5;
    gbc1.gridx = 1;

    panelCentro.add(tf13,gbc1);
    gbc1.gridy = 1;
    gbc1.gridwidth = 1;
     
      
    panelSur.add(bs1);
    panelSur.add(bs2);
   
    panelMayor.add(panelNorte, BorderLayout.NORTH);
    panelMayor.add(panelCentro, BorderLayout.CENTER);
    panelMayor.add(panelSur, BorderLayout.SOUTH);
    panelMayor.add(panelEste, BorderLayout.EAST);
    panelMayor.add(panelOeste, BorderLayout.WEST);
    
    this.add(panelMayor);
    
    
    this.setTitle("Carreras hilos nivel 3");
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setSize(480,200);
    this.setLocationRelativeTo(null);
    this.setVisible(true);
    
    }
    
    public void actionPerformed (ActionEvent evento){
        
        //boton 1
        if (bs1 == evento.getSource()){
            
        if(tf13.getText().equals("")){
        JOptionPane.showMessageDialog(null, "No ingreso ningun dato!");
        }
        else{
            this.setVisible(false);
            gal3 = new Galgodromo3();
        }
        
        }
 
        //boton 2
        if(bs2 == evento.getSource()){
            System.exit(0);
        }
    }
    
}