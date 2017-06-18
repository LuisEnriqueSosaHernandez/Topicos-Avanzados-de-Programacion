package carreragalgos;

public class Galgodromo{

    public VistaGalgodromo vg;
    public LlegadaMeta llegada;
    public Seleccion sel;
    
    public Galgodromo(){
        this.vg = new VistaGalgodromo();
        this.llegada = new LlegadaMeta(1);
        crearHilos();

    }
    
   
    public void crearHilos(){
        double ran;
        int valorRan;
        
        ran = Math.random()*10;
        valorRan = (int)ran;
        valorRan = ((valorRan<1 || valorRan>10) ? 5 : valorRan);
        Galgo g1 = new Galgo(vg, llegada, sel);
        g1.setPriority(valorRan);
        g1.setName("Galgo 1");
//        System.out.println("prioridad Galgo1:"+g1.getPriority());       
        
        ran = Math.random()*10;
        valorRan = (int)ran;
        valorRan = ((valorRan<1 || valorRan>10) ? 5 : valorRan);
        Galgo g2 = new Galgo(vg, llegada, sel);
        g2.setPriority(valorRan);
        g2.setName("Galgo 2");
//        System.out.println("prioridad Galgo2:"+g2.getPriority());     
              
        g1.start();
        g2.start();
        
    }
       
}