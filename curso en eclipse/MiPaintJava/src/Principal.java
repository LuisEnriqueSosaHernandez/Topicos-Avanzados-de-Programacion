import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Principal extends JFrame implements ActionListener{
	AreaDibujo aread;
	JPanel pnlHtas;
	JButton btnCirVacio,btnCirRelleno,btnBorrar;
public Principal(){
	setTitle("Graficos en JAVA");
	setBounds(100,50,800,400);
	setLayout(null);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	btnCirVacio =new JButton("Circulo vacio");
	btnCirVacio.setBounds(10, 10, 120, 40);
	btnCirRelleno=new JButton("Circulo relleno");
	btnCirRelleno.setBounds(10, 60, 120, 40);
	btnBorrar =new JButton("Borrar");
	btnBorrar.setBounds(10, 110, 120, 40);
	pnlHtas=new JPanel(null);
	pnlHtas.setBounds(0,0,200,400);
	pnlHtas.setBackground(Color.DARK_GRAY);
	pnlHtas.add(btnCirVacio);
	pnlHtas.add(btnCirRelleno);
	pnlHtas.add(btnBorrar);
	add(pnlHtas);
	aread=new AreaDibujo();
	add(aread);
	btnCirVacio.addActionListener(this);
	btnCirRelleno.addActionListener(this);
	btnBorrar.addActionListener(this);
	setVisible(true);

}
	public static void main(String[] args) {
		Principal ventana= new Principal();

	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btnCirVacio){
			AreaDibujo.dibujaCirculoVacio(aread.getGraphics(), 50,50, 80, 80);
		}
		if(e.getSource()==btnCirRelleno){
			AreaDibujo.dibujaCirculoRelleno(aread.getGraphics(), 50,150, 80, 80);
		}
		if(e.getSource()==btnBorrar){
			repaint();
		}
		
		
	}

}
