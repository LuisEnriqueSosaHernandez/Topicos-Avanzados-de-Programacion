import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class EventosKey extends JFrame implements KeyListener {
JLabel lblPulsa,lblTecla;
JTextField txtPulsa,txtTecla;
public EventosKey(){
	super("Eventos del teclado");
	setBounds(300, 300, 400, 200);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	JPanel pnl=new JPanel(null);
	lblPulsa=new JLabel("Pulsa una tecla");
	lblPulsa.setBounds(10, 50, 150, 20);
	txtPulsa=new JTextField(50);
	txtPulsa.setBounds(180, 50, 150, 20);
	lblTecla=new JLabel("Codigo de la tecla");
	lblTecla.setBounds(10, 80, 150, 20);
	txtTecla=new JTextField(50);
	txtTecla.setBounds(180, 80, 150, 20);
	txtPulsa.setEnabled(false);
	txtTecla.setEnabled(false);
	lblPulsa.setFocusable(false);
	pnl.add(lblPulsa);
	pnl.add(txtPulsa);
	pnl.add(lblTecla);
	pnl.add(txtTecla);
	add(pnl);
	addKeyListener(this);
	setVisible(true);
	
	
}
public static void main(String[]args){
	EventosKey v=new EventosKey();
}
@Override
public void keyTyped(KeyEvent kt) {

	
}
@Override
public void keyPressed(KeyEvent kp) {
txtPulsa.setText(kp.getKeyText(kp.getKeyCode()));
txtTecla.setText(""+kp.getKeyCode());
	
}
@Override
public void keyReleased(KeyEvent kr) {
txtPulsa.setText("solto la tecla "+kr.getKeyText(kr.getKeyCode()));	

	
}
}
