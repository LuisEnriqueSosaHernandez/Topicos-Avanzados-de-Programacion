package carreragalgos;

import javax.swing.JOptionPane;
import carreragalgos2.Seleccion2;
import carreragalgos2.VistaGalgodromo2;
import java.util.Scanner;

public class Galgo extends Thread {

    public VistaGalgodromo vg;
    public LlegadaMeta llegada;
    public Seleccion sel;
    public Seleccion2 sel2;
    public VistaGalgodromo2 vg2;

    public static final int LIMINF = 0;
    public static final int LIMSUP = 300;

    public Galgo() {
    }

    public Galgo(VistaGalgodromo vg, LlegadaMeta llegada, Seleccion sel) {
        this.vg = vg;
        this.llegada = llegada;
        this.sel = sel;
    }

    public void run() {
        double r;
        long vR;
        String nombreHilo;
        int lugarDeLlegada;
        for (int i = LIMINF; i <= LIMSUP; i++) {
            r = Math.random() * 10;
            vR = (int) r;
            try {
                Thread.sleep(vR);
            } catch (Exception e) {
            }
            nombreHilo = this.getName();
            switch (nombreHilo) {
                case "Galgo 1":
                    vg.tfCarril1.setText(" " + i);
                    break;
                case "Galgo 2":
                    vg.tfCarril2.setText(" " + i);
                    break;
            }
        }

        synchronized (llegada) {
            nombreHilo = this.getName();
            lugarDeLlegada = llegada.getLlegada();
            switch (nombreHilo) {
                case "Galgo 1":
                    vg.tfResultado1.setText("" + lugarDeLlegada);
                    break;
                case "Galgo 2":
                    vg.tfResultado2.setText("" + lugarDeLlegada);
                    break;
            }
            llegada.setLlegada(lugarDeLlegada + 1);
        }

        //Ganador
        try{
        while (!"".equals(vg.tfResultado1.getText())
                & !"".equals(vg.tfResultado2.getText())) {
            Seleccion s=new Seleccion();
         System.out.println(sel.vuelta);//Esto es por que el puntero no salia >v jaja , y estatico para poder usar el valor y no regrese null
            switch (sel.vuelta) {//Esto es por que el puntero no salia >v jaja , y estatico para poder usar el valor y no regrese null
                case "1":
                    String conver = (vg.tfResultado1.getText());
                    int conv = Integer.parseInt(conver);
                    System.out.println(conv);//Esto creo es tuyo >v
                    if (conv == 1) {
                        JOptionPane.showMessageDialog(null, "Felicidades, usted gano!");
                        sel2 = new Seleccion2();
                        vg.setVisible(false);
                        sel2.setVisible(true);
                        Scanner l=new Scanner(System.in);//Sirve para botar el ciclo infinito
                        l.next();//Sirve para botar el ciclo infinito
                    } else {
                        JOptionPane.showMessageDialog(null, "Lo sentimos, pruebe otra vez");
                         sel = new Seleccion();
                         vg.setVisible(false);
                         sel.setVisible(true); 
                          Scanner l=new Scanner(System.in);//Sirve para botar el ciclo infinito
                        l.next();//Sirve para botar el ciclo infinito
                    }
                    break;

                case "2":
                    String conver2 = (vg.tfResultado2.getText());
                    int conv2 = Integer.parseInt(conver2);
                    if (conv2 == 1) {
                        JOptionPane.showMessageDialog(null, "Felicidades, usted gano!");
                        sel2 = new Seleccion2();
                        vg.setVisible(false);
                        sel2.setVisible(true);
                         Scanner l=new Scanner(System.in);//Sirve para botar el ciclo infinito
                        l.next();//Sirve para botar el ciclo infinito
                    } else {
                        JOptionPane.showMessageDialog(null, "Lo sentimos, pruebe otra vez");
                        sel = new Seleccion();
                        vg.setVisible(false);
                        sel.setVisible(true);
                         Scanner l=new Scanner(System.in);//Sirve para botar el ciclo infinito
                        l.next();//Sirve para botar el ciclo infinito
                    }
                    break;

            }

        }

         }catch (Exception e){
          JOptionPane.showMessageDialog(null, "Error");
        }
    }

}
