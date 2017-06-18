import javax.swing.*;
import java.awt.*;
public class Ventana extends JFrame {
	//Creamos el constructor
	/*public Ventana(){
		super("Mi Primer ventana en Java");//Titulo de la ventana
		setSize(400,600);//Tamanio de la ventana
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}*/
public static void main(String[]args){
	Ventana objVentanita=new Ventana();
	objVentanita.setTitle("Mi primera ventana en Java");
	objVentanita.setSize(400,600);
	objVentanita.setDefaultCloseOperation(EXIT_ON_CLOSE);
    objVentanita.setVisible(true);
}
}
