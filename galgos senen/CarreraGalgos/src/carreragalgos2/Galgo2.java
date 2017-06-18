package carreragalgos2;

import javax.swing.JOptionPane;
import carreragalgos3.Seleccion3;
import carreragalgos3.VistaGalgodromo3;
import carreragalgos.Seleccion;

public class Galgo2 extends Thread {
    
    public VistaGalgodromo2 vg2;
    public LlegadaMeta2 llegada2;
    public Seleccion sel;
    public Seleccion2 sel2;
    public Seleccion3 sel3;
    public VistaGalgodromo3 vg3;
    
    public static final int LIMINF2=0;
    public static final int LIMSUP2=400;
    
    public Galgo2 (){
    }
    
    public Galgo2 (VistaGalgodromo2 vg2, LlegadaMeta2 llegada2, Seleccion2 sel2){
        this.vg2 = vg2;
        this.llegada2 = llegada2;
        this.sel2 = sel2;
    }
    
    public void run(){
        double r;
        long vR;
        String nombreHilo2;
        int lugarDeLlegada2;
        for(int i=LIMINF2; i<=LIMSUP2; i++){
            r  = Math.random()*10;
            vR = (int)r;
            try{
                Thread.sleep(vR);
            }catch(Exception e){}
            nombreHilo2=this.getName();
            switch(nombreHilo2){
                case "Galgo 1":
                    vg2.tfCarril12.setText(" "+i);
                    break;
                case "Galgo 2":
                    vg2.tfCarril22.setText(" "+i);
                    break;
                case "Galgo 3":
                    vg2.tfCarril32.setText(" "+i);
                    break;
            }
        }
 
        synchronized (llegada2){
             nombreHilo2=this.getName();
             lugarDeLlegada2 = llegada2.getLlegada2();
             switch(nombreHilo2){
                case "Galgo 1":
                    vg2.tfResultado12.setText(""+lugarDeLlegada2);
                    break;
                case "Galgo 2":
                    vg2.tfResultado22.setText(""+lugarDeLlegada2);
                    break;
                case "Galgo 3":
                    vg2.tfResultado32.setText(""+lugarDeLlegada2);
                    break;

            }
            llegada2.setLlegada2(lugarDeLlegada2+1);          
        }        
        
        
        //Ganador
        try{
        while(!"".equals(vg2.tfResultado12.getText()) 
                & !"".equals(vg2.tfResultado22.getText())
                & !"".equals(vg2.tfResultado32.getText())){

            switch(sel2.tf12.getText()){
                case "1":
                    String conver = (vg2.tfResultado12.getText());
                    int conv = Integer.parseInt(conver);
                    if(conv == 1){
                    JOptionPane.showMessageDialog(null, "Felicidades, usted gano!");
                    sel3 = new Seleccion3();
                    vg2.setVisible(false);
                    sel3.setVisible(true);
                    }
                    else{
                    JOptionPane.showMessageDialog(null, "Lo sentimos, pruebe otra vez");
                    sel = new Seleccion();
                    vg2.setVisible(false);
                    sel.setVisible(true); 
                    }
                break;
                    
                case "2":
                    String conver2 = (vg2.tfResultado22.getText());
                    int conv2 = Integer.parseInt(conver2);
                    if(conv2 == 1){
                    JOptionPane.showMessageDialog(null, "Felicidades, usted gano!");
                    sel3 = new Seleccion3();
                    vg2.setVisible(false);
                    sel3.setVisible(true);
                    }
                    else{
                    JOptionPane.showMessageDialog(null, "Lo sentimos, pruebe otra vez");
                    sel = new Seleccion();
                    vg2.setVisible(false);
                    sel.setVisible(true); 
                    }
                break;
                    
                case "3":
                    String conver3 = (vg2.tfResultado32.getText());
                    int conv3 = Integer.parseInt(conver3);
                    if(conv3 == 1){
                    JOptionPane.showMessageDialog(null, "Felicidades, usted gano!");
                    sel3 = new Seleccion3();
                    vg2.setVisible(false);
                    sel3.setVisible(true);
                    }
                    else{
                    JOptionPane.showMessageDialog(null, "Lo sentimos, pruebe otra vez");
                    sel = new Seleccion();
                    vg2.setVisible(false);
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