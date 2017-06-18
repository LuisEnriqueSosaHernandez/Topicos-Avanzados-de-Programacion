/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carreragalgos3;

public class Galgodromo3{

    public VistaGalgodromo3 vg3;
    public LlegadaMeta3 llegada3;
    public Seleccion3 sel3;
    
    public Galgodromo3(){
        this.vg3 = new VistaGalgodromo3();
        this.llegada3 = new LlegadaMeta3(1);
        crearHilos3();

    }
    
   
    public void crearHilos3(){
        double ran;
        int valorRan;
        
        ran = Math.random()*10;
        valorRan = (int)ran;
        valorRan = ((valorRan<1 || valorRan>10) ? 5 : valorRan);
        Galgo3 g13 = new Galgo3(vg3, llegada3, sel3);
        g13.setPriority(valorRan);
        g13.setName("Galgo 1");
//        System.out.println("prioridad Galgo1:"+g1.getPriority());       
        
        ran = Math.random()*10;
        valorRan = (int)ran;
        valorRan = ((valorRan<1 || valorRan>10) ? 5 : valorRan);
        Galgo3 g23 = new Galgo3(vg3, llegada3, sel3);
        g23.setPriority(valorRan);
        g23.setName("Galgo 2");
//        System.out.println("prioridad Galgo2:"+g2.getPriority());     
        
        ran = Math.random()*10;
        valorRan = (int)ran;
        valorRan = ((valorRan<1 || valorRan>10) ? 5 : valorRan);
        Galgo3 g33 = new Galgo3(vg3, llegada3, sel3);
        g33.setPriority(valorRan);
        g33.setName("Galgo 3");
//        System.out.println("prioridad Galgo3:"+g3.getPriority());
        
        ran = Math.random()*10;
        valorRan = (int)ran;
        valorRan = ((valorRan<1 || valorRan>10) ? 5 : valorRan);
        Galgo3 g34 = new Galgo3(vg3, llegada3, sel3);
        g34.setPriority(valorRan);
        g34.setName("Galgo 4");
//        System.out.println("prioridad Galgo3:"+g3.getPriority());
        
        g13.start();
        g23.start();
        g33.start();
        g34.start();
        
    }
       
}
