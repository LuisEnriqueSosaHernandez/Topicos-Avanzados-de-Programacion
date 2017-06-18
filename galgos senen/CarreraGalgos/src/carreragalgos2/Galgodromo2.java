package carreragalgos2;

public class Galgodromo2{

    public VistaGalgodromo2 vg2;
    public LlegadaMeta2 llegada2;
    public Seleccion2 sel2;
    
    public Galgodromo2(){
        this.vg2 = new VistaGalgodromo2();
        this.llegada2 = new LlegadaMeta2(1);
        crearHilos2();

    }
    
   
    public void crearHilos2(){
        double ran;
        int valorRan;
        
        ran = Math.random()*10;
        valorRan = (int)ran;
        valorRan = ((valorRan<1 || valorRan>10) ? 5 : valorRan);
        Galgo2 g12 = new Galgo2(vg2, llegada2, sel2);
        g12.setPriority(valorRan);
        g12.setName("Galgo 1");
//        System.out.println("prioridad Galgo1:"+g1.getPriority());       
        
        ran = Math.random()*10;
        valorRan = (int)ran;
        valorRan = ((valorRan<1 || valorRan>10) ? 5 : valorRan);
        Galgo2 g22 = new Galgo2(vg2, llegada2, sel2);
        g22.setPriority(valorRan);
        g22.setName("Galgo 2");
//        System.out.println("prioridad Galgo2:"+g2.getPriority());     
        
        ran = Math.random()*10;
        valorRan = (int)ran;
        valorRan = ((valorRan<1 || valorRan>10) ? 5 : valorRan);
        Galgo2 g32 = new Galgo2(vg2, llegada2, sel2);
        g32.setPriority(valorRan);
        g32.setName("Galgo 3");
//        System.out.println("prioridad Galgo3:"+g3.getPriority());
        
        g12.start();
        g22.start();
        g32.start();
        
    }
       
}