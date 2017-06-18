import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class PersonalizarBotones extends JFrame implements ActionListener{
JButton btnPersonalizado;
JPanel pnl;
ImageIcon imgNormal;
ImageIcon imgPasar;
ImageIcon imgPulsado;
public PersonalizarBotones(){
	super("Personalizacion de botones");
	setBounds(500, 200, 400, 200);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	btnPersonalizado =new JButton("");
	btnPersonalizado.setBounds(120, 60, 146, 46);
	imgNormal=new ImageIcon(PersonalizarBotones.class.getResource("/MisImagenes/aceptarNormal.png"));
	imgPulsado=new ImageIcon(PersonalizarBotones.class.getResource("/MisImagenes/aceptarPulsado.png"));
	imgPasar=new ImageIcon(PersonalizarBotones.class.getResource("/MisImagenes/aceptarPasar.png"));
	
	btnPersonalizado.setBorder(null);
	btnPersonalizado.setBorderPainted(false);
	btnPersonalizado.setContentAreaFilled(false);
	btnPersonalizado.setIcon(imgNormal);
	btnPersonalizado.setPressedIcon(imgPulsado);
	btnPersonalizado.setRolloverIcon(imgPasar);
	pnl=new JPanel(null);
	pnl.add(btnPersonalizado);
	add(pnl);
	btnPersonalizado.addActionListener(this);
	setVisible(true);
}
public static void main(String[]args){
	new PersonalizarBotones();
}
@Override
public void actionPerformed(ActionEvent e) {
	if(e.getSource()==btnPersonalizado){
		JOptionPane.showMessageDialog(null,"Boton pulsado");
	}
	
}
}
