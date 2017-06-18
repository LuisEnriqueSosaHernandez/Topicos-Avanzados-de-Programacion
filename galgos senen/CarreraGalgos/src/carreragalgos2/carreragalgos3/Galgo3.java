/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carreragalgos3;

import carreragalgos.Seleccion;
import javax.swing.JOptionPane;

public class Galgo3 extends Thread {
    
    public VistaGalgodromo3 vg3;
    public LlegadaMeta3 llegada3;
    public Seleccion3 sel3;
    public Seleccion sel;
    
    public static final int LIMINF3=0;
    public static final int LIMSUP3=500;
    
    public Galgo3 (){
    }
    
    public Galgo3 (VistaGalgodromo3 vg3, LlegadaMeta3 llegada3, Seleccion3 sel3){
        this.vg3 = vg3;
        this.llegada3 = llegada3;
        this.sel3 = sel3;
    }
    
    public void run(){
        double r;
        long vR;
        String nombreHilo3;
        int lugarDeLlegada3;
        for(int i=LIMINF3; i<=LIMSUP3; i++){
            r  = Math.random()*10;
            vR = (int)r;
            try{
                Thread.sleep(vR);
            }catch(Exception e){}
            nombreHilo3=this.getName();
            switch(nombreHilo3){
                case "Galgo 1":
                    vg3.tfCarril13.setText(" "+i);
                    break;
                case "Galgo 2":
                    vg3.tfCarril23.setText(" "+i);
                    break;
                case "Galgo 3":
                    vg3.tfCarril33.setText(" "+i);
                    break;
                case "Galgo 4":
                    vg3.tfCarril43.setText(" "+i);
                    break;
            }
        }
 
        synchronized (llegada3){
             nombreHilo3=this.getName();
             lugarDeLlegada3 = llegada3.getLlegada3();
             switch(nombreHilo3){
                case "Galgo 1":
                    vg3.tfResultado13.setText(""+lugarDeLlegada3);
                    break;
                case "Galgo 2":
                    vg3.tfResultado23.setText(""+lugarDeLlegada3);
                    break;
                case "Galgo 3":
                    vg3.tfResultado33.setText(""+lugarDeLlegada3);
                    break;
                case "Galgo 4":
                    vg3.tfResultado43.setText(""+lugarDeLlegada3);
                    break;

            }
            llegada3.setLlegada3(lugarDeLlegada3+1);          
        }        
        
        
        //Ganador
        try{
        while(!"".equals(vg3.tfResultado13.getText()) 
                & !"".equals(vg3.tfResultado23.getText())
                & !"".equals(vg3.tfResultado33.getText())
                & !"".equals(vg3.tfResultado43.getText())){

            switch(sel3.tf13.getText()){
                case "1":
                    String conver = (vg3.tfResultado13.getText());
                    int conv = Integer.parseInt(conver);
                    if(conv == 1){
                    JOptionPane.showMessageDialog(null, "Felicidades, gano todos los niveles!");
                    vg3.setVisible(false);
                    System.exit(0);
                    }
                    else{
                    JOptionPane.showMessageDialog(null, "Lo sentimos, pruebe otra vez");
                    sel = new Seleccion();
                    vg3.setVisible(false);
                    sel.setVisible(true); 
                    }
                break;
                    
                case "2":
                    String conver2 = (vg3.tfResultado23.getText());
                    int conv2 = Integer.parseInt(conver2);
                    if(conv2 == 1){
                    JOptionPane.showMessageDialog(null, "Felicidades, gano todos los niveles!");
                    vg3.setVisible(false);
                    System.exit(0);
                    }
                    else{
                    JOptionPane.showMessageDialog(null, "Lo sentimos, pruebe otra vez");
                    sel = new Seleccion();
                    vg3.setVisible(false);
                    sel.setVisible(true); 
                    }
                break;
                    
                case "3":
                    String conver3 = (vg3.tfResultado33.getText());
                    int conv3 = Integer.parseInt(conver3);
                    if(conv3 == 1){
                    JOptionPane.showMessageDialog(null, "Felicidades, gano todos los niveles!");
                    vg3.setVisible(false);
                    System.exit(0);
                    }
                    else{
                    JOptionPane.showMessageDialog(null, "Lo sentimos, pruebe otra vez");
                    sel = new Seleccion();
                    vg3.setVisible(false);
                    sel.setVisible(true); 
                    }
                break;
                    
                case "4":
                    String conver4 = (vg3.tfResultado43.getText());
                    int conv4 = Integer.parseInt(conver4);
                    if(conv4 == 1){
                    JOptionPane.showMessageDialog(null, "Felicidades, gano todos los niveles!");
                    vg3.setVisible(false);
                    System.exit(0);
                    }
                    else{
                    JOptionPane.showMessageDialog(null, "Lo sentimos, pruebe otra vez");
                    sel = new Seleccion();
                    vg3.setVisible(false);
                    sel.setVisible(true); 
                    }
                break;

            }
            
        }
               
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "Error");
        }              
        
    }

}