package ejgrahilos;

import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFrame;
/**
 *
 * @author alex_
 */
public class Main extends JFrame{
    public EjGraHilos v1;
   public Contador c1;
   public Contador c2;
    public Contador c3;
      Panel panel;     
      JButton btn1play;
      JButton btn1pause;
      JButton btn1resume;
      JButton btn2play;
      JButton btn2pause;
      JButton btn2resume;
      JButton btn3play;
      JButton btn3pause;
      JButton btn3resume;
    public Main() {
        super("Ventana con Sliders");
              
        setSize(800,500);
        setLocationRelativeTo(null);
        addComponentes();
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
    public void addComponentes(){
     btn1play=new JButton("Play");
        btn1pause=new JButton("Pause");
        btn1resume=new JButton("Resume");
        btn2play=new JButton("Play");
        btn2pause=new JButton("Pause");
        btn2resume=new JButton("Resume");
        btn3play=new JButton("Play");
        btn3pause=new JButton("Pause");
        btn3resume=new JButton("Resume");
        
        panel=new Panel();
         panel.setLayout(new GridLayout(1,9));
         panel.add(btn1play);
         panel.add(btn1pause);
         panel.add(btn1resume);
         panel.add(btn2play);
         panel.add(btn2pause);
         panel.add(btn2resume);
         panel.add(btn3play);
         panel.add(btn3pause);
         panel.add(btn3resume);
            v1 = new EjGraHilos();
             v1.add(panel,"North");
             
        c1 = new Contador(v1.getBarra1());
        c2 = new Contador(v1.getBarra2());
        c3 = new Contador(v1.getBarra3());
        
        add(v1);   
        btn1play.addActionListener (new ActionListener()
       {
         public void actionPerformed (ActionEvent e)
         {
            c1.play();
         }
       });
         btn1pause.addActionListener (new ActionListener()
       {
         public void actionPerformed (ActionEvent e)
         {
            c1.pause();
         }
       });
          btn1resume.addActionListener (new ActionListener()
       {
         public void actionPerformed (ActionEvent e)
         {
            c1.resume();
         }
       });
           btn2play.addActionListener (new ActionListener()
       {
         public void actionPerformed (ActionEvent e)
         {
            c2.play();
         }
       });
         btn2pause.addActionListener (new ActionListener()
       {
         public void actionPerformed (ActionEvent e)
         {
            c2.pause();
         }
       });
          btn2resume.addActionListener (new ActionListener()
       {
         public void actionPerformed (ActionEvent e)
         {
            c2.resume();
         }
       });
           btn3play.addActionListener (new ActionListener()
       {
         public void actionPerformed (ActionEvent e)
         {
            c3.play();
         }
       });
         btn3pause.addActionListener (new ActionListener()
       {
         public void actionPerformed (ActionEvent e)
         {
            c3.pause();
         }
       });
          btn3resume.addActionListener (new ActionListener()
       {
         public void actionPerformed (ActionEvent e)
         {
            c3.resume();
         }
       });

    }
}
//Como accede a la clase, al hilo y detiene el for
//como edito un jlabel desde el ciclo for que esta en la clase contador, si no se puede acceder

//Solo quiere que el boton tenga un sleep para cada barra, y que cuando acabe la barra, siga avanzando,
//Aunque las otras barras sigan esperando a que la primera termine el sleep y su tiempo de avance para comenzar.