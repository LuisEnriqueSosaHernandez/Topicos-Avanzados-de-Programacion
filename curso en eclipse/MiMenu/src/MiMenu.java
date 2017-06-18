import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JMenuBar;
public class MiMenu extends JFrame {
	JMenuItem cmdAbrir,cmdCerrar,cmdSalir,cmdCopiar,cmdPegar;
	JMenu mnuArchivo,mnuEdicion;
	JMenuBar braMenu;
	
public MiMenu(){
	super("Mi primer menu en JAVA");
	setBounds(200,200,800,500);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	//Paso 1,crear los jmenuitems
	cmdAbrir =new JMenuItem("Abrir");
	cmdCerrar=new JMenuItem("Cerrar");
	cmdSalir=new JMenuItem("Salir");
	cmdCopiar=new JMenuItem("Copiar");
	cmdPegar=new JMenuItem("Pegar");
	//paso 2 crear los jmenu
	mnuArchivo=new JMenu("Archivo");
	mnuEdicion=new JMenu("Edicion");
	//paso 3 crear jmenubar
	braMenu =new JMenuBar();
	//paso 4, agregar los comandos jmenuitem a los menus
	mnuArchivo.add(cmdAbrir);
	mnuArchivo.add(cmdCerrar);
	mnuArchivo.add(cmdSalir);
	mnuEdicion.add(cmdCopiar);
	mnuEdicion.add(cmdPegar);
	//paso 5,agregar los menus a la barra de menus
	braMenu.add(mnuArchivo);
	braMenu.add(mnuEdicion);
	//Paso 6, agregar la barra de menus a la ventana
	setJMenuBar(braMenu);
	setVisible(true);
}
	public static void main(String[] args) {
		MiMenu ventana=new MiMenu();

	}

}
