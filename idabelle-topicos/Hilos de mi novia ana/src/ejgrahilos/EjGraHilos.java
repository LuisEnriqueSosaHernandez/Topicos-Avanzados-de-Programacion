package ejgrahilos;

import java.awt.BorderLayout;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
/**
 *
 * @author alex_
 */
public class EjGraHilos extends JPanel {
    private JSlider barra1;
    private JSlider barra2;
    private JSlider barra3;
    JPanel p1;
        JLabel cont;
        JLabel cont2;
        JLabel cont3;
        JPanel p2;
        JLabel l1;
        JLabel l2;
        JLabel l3;  
    public EjGraHilos(){
        addComponentes();
        
        
        
        
    }
    public void addComponentes(){
        setLayout(new BorderLayout());
        p1 = new JPanel();
        cont=setLabel("");
        cont2=setLabel("");
        cont3=setLabel("");
        p2 = new JPanel();
        l1 = setLabel("Contador 1");
        l2 = setLabel("Contador 2");
        l3 = setLabel("Contador 3"); 
        barra1 = setBarra();
        barra2 = setBarra();
        barra3 = setBarra();
        add(p1, "Center");
        add(p2, "South");
        p1.setLayout(new GridLayout(1,3));
         p2.setLayout(new GridLayout(1,3));
        p1.add(barra1);
        p1.add(cont);
        p1.add(barra2);
        p1.add(cont2);
        p1.add(barra3);
        p1.add(cont3);
        p2.add(l1);
        p2.add(l2);
        p2.add(l3);
       
    }    
    public JSlider setBarra(){
        JSlider barra = new JSlider(JSlider.VERTICAL,0,1000,0);
        barra.setMajorTickSpacing(100);
        barra.setMajorTickSpacing(10);
        barra.setPaintTicks(true);
        barra.getValue(); //Con el metodo value mando a llamar el valor que va teniendo el hilo, en un jlabel txtfield
        return barra;
    }
    public JLabel setLabel(String label){
        JLabel l = new JLabel(label);
        l.setAlignmentX(JLabel.CENTER);
        return l;
    }
    public JSlider getBarra1(){
        return barra1;
    }
    public JSlider getBarra2(){
        return barra2;
    }
    public JSlider getBarra3(){
        return barra3;
    }
}  
    
class Contador implements Runnable{
    private boolean paused=false;
    private boolean stopped=false;
    public JSlider slider;
    public Contador(JSlider slider){
        this.slider = slider;
    }
   public void play() {
paused = false;
stopped = false;
new Thread(this, "Player").start();
}
public synchronized void pause() {
paused = true;
}

public synchronized void resume() {
paused = false;
notify();
}

public synchronized void stop() {
stopped = true;

notify();
}   
    public void run() {
        int i=0;
while (!stopped) {
    if(i>=999){
        System.out.println("fin hilo1");
        stop();
    }
try {
synchronized (this) {
if (paused) {
System.out.println("Paused");
wait();
System.out.println("Resumed");
}
}
slider.setValue(i);
i++;
System.out.println(i);
Thread.sleep(3);
} catch (InterruptedException ex) {
System.err.println(ex);
}
}
}
    }


