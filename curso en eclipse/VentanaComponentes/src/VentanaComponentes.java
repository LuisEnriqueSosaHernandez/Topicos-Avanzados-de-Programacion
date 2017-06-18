
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class VentanaComponentes extends JFrame {
//Creamos el constructor
	public VentanaComponentes(){
		//Creamos nuestra ventana
		super("Ventana con Componentes");
		setSize(350,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//Creamos una etiqueta
		JLabel lblNombre=new JLabel("Nombre: ");
	    //Creamos cuadro de texto
		JTextField txtNombre=new JTextField(20);
		//Creamos un boton
		JButton btnSinEvento =new JButton("Boton Sin Evento");
		//Creamos el contendedor que contendra los componentes
		JPanel pnlContenido=new JPanel();
		//Agregamos los componentes al contenedor
		pnlContenido .add(lblNombre);
		pnlContenido.add(txtNombre);
		pnlContenido.add(btnSinEvento);
		//Asociamos el contendedor a la ventana de aplicacion
		setContentPane(pnlContenido);
		//Hacemos visible la ventana
		setVisible(true);
		
	}
	public static void main(String[]args){
		VentanaComponentes v=new VentanaComponentes();
	}
}
