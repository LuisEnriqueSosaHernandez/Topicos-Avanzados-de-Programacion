import java.awt.Color;
import java.awt.Graphics;
import java.awt.color.*;
import javax.swing.JPanel;
public class AreaDibujo extends JPanel {
public AreaDibujo(){
	setBounds(200,0,600,400);
	setBackground(Color.WHITE);
	}
/*public void paintComponent(Graphics g){
	super.paintComponent(g);
	g.setColor(Color.BLUE);
	g.drawOval(20, 20, 50, 50);
	g.setColor(Color.GRAY);
	g.fillRect(80, 20, 40, 40);
	g.setColor(Color.PINK);
	g.fillRoundRect(150,20 , 40, 40, 20, 20);
}*/
public static void dibujaCirculoVacio(Graphics g,int x,int y,int ancho,int alto){
	g.setColor(Color.GREEN);
	g.drawOval(x, y,ancho, alto);
}
public static void dibujaCirculoRelleno(Graphics g,int x,int y,int ancho,int alto){
	g.setColor(Color.RED);
	g.fillOval(x, y,ancho, alto);
}

}
