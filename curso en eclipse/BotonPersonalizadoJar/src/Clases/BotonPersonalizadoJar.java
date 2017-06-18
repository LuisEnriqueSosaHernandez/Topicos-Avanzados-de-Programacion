package Clases;

import java.awt.Dimension;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JLabel;

public class BotonPersonalizadoJar extends JLabel implements MouseListener{
public BotonPersonalizadoJar() {
	super();
	this.setPreferredSize(new Dimension(146,46));
	this.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/aceptarNormal.png")));
	this.addMouseListener(this);
}
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		this.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/aceptarPulsado.png")));
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		this.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/aceptarPasar.png")));
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		this.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/aceptarPasar.png")));
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		this.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/aceptarNormal.png")));
		
	}

}
