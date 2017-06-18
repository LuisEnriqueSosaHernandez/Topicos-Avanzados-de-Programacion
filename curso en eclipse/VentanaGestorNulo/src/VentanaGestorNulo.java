import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;
public class VentanaGestorNulo extends JFrame implements ActionListener{
	//Declaramos las variables
	JButton btnMostrar,btnBorrar;
	JLabel lblNombre,lblEdad,lblDatos;
	JTextField txtNombre,txtEdad,txtDatos;
	ImageIcon miImagen;
	ImageIcon miImagen2;
	
	
	public VentanaGestorNulo(){
	super("Ventana con Gestor Nulo y usando setBounds");
	setSize(500,500);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	lblNombre= new JLabel("Nombre");
	lblEdad= new JLabel("Edad");
	lblDatos= new JLabel("Datos");
	txtNombre=new JTextField(30);
	txtEdad=new JTextField(10);
	txtDatos=new JTextField(50);
	miImagen=new ImageIcon("a.PNG");
	miImagen2=new ImageIcon("b.PNG");
	//Creamos nuestros componentes
	//Creamos el boton y asociamos imagen
	 btnMostrar=new JButton("Mostrar",miImagen);
	 btnBorrar =new JButton("Borrar",miImagen2);
	//FlowLayout gestor=new FlowLayout();
	JPanel pnlCont=new JPanel(null);
	//ubicar botones
	//setBounds(pos x,pos y,ancho x,alto y)
	lblNombre.setBounds(5,10,50,20);
	lblEdad.setBounds(5, 50, 50, 20);
	lblDatos.setBounds(5,90,50,20);
	txtNombre.setBounds(75,10,150,20);
	txtEdad.setBounds(75,50,50,20);
	txtDatos.setBounds(75,90,220,20);
	btnMostrar.setBounds(320, 10, 120, 40);
	btnBorrar.setBounds(320, 90, 120, 40);
	pnlCont.add(lblNombre);
	pnlCont.add(lblEdad);
	pnlCont.add(lblDatos);
	pnlCont.add(txtNombre);
	pnlCont.add(txtEdad);
	pnlCont.add(txtDatos);
	
	pnlCont.add(btnMostrar);
	pnlCont.add(btnBorrar);
	setContentPane(pnlCont);
	//Agregamos el escuchador al boton
	btnMostrar.addActionListener(this);
	btnBorrar.addActionListener(this);
	setVisible(true);
	}
	public static void main(String[]args){
		VentanaGestorNulo v=new VentanaGestorNulo();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		String nombre="",edad="",datos="";
		int i=80;
		if(e.getSource()==btnMostrar){
			//Obtenemos el texto de los componentes
			nombre=txtNombre.getText();
			edad=txtEdad.getText();
			//Asignamos el componente a txt datos
			txtDatos.setText("Tu nombre es: "+nombre+", Tu edad es: "+edad);
		}
		if(e.getSource()==btnBorrar){
			txtNombre.setText("");
			txtEdad.setText("");
			txtDatos.setText("");
			
			
		}
		
	}

}
