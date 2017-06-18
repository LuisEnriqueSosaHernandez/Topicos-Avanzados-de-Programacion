

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Haunter extends JFrame implements KeyListener {
JLabel lblPulsa,lblTecla;
JTextField txtPulsa,txtTecla;
ImageIcon haunter,hitmontop;
JLabel imagen,imagen2;
int x=0,y=0;
public Haunter(){
	super("Eventos del teclado");
	setBounds(0, 0, 1366, 764);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	JPanel pnl=new JPanel(null);
	 haunter = new ImageIcon(Haunter.class.getResource("haunter.gif"));
         imagen=new JLabel(haunter);
         imagen.setBounds(0, 0, 100, 100);
          hitmontop = new ImageIcon(Haunter.class.getResource("hitmontop.gif"));
         imagen2=new JLabel(hitmontop);
         imagen2.setBounds(1250, 0, 100, 100);
         pnl.add(imagen);
         pnl.add(imagen2);
         
	add(pnl);
	addKeyListener(this);
	setVisible(true);
	
	
}
public static void main(String[]args){
	Haunter v=new Haunter();
}
@Override
public void keyTyped(KeyEvent kt) {

	
}
@Override
public void keyPressed(KeyEvent kp) {
    if(kp.getKeyCode()==37&&x>=0){
    x-=10;
     imagen.setBounds(x,y,100, 100);
    }
    if(kp.getKeyCode()==39&&x<=1266){
    x+=10;
     imagen.setBounds(x,y,100, 100);
    }
    if(kp.getKeyCode()==40&&y<=628){
    y+=10;
     imagen.setBounds(x,y,100, 100);
    }
    if(kp.getKeyCode()==38&&y>=0){
    y-=10;
     imagen.setBounds(x,y,100, 100);
    }
    	
}
@Override
public void keyReleased(KeyEvent kr) {
	

	
}
}
