
package topicos;

import javax.swing.JFrame;


public class AppEventos {

    
    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() { 
    Ventana f =new Ventana();  
    f.setTitle("Panel de dibujo");
    f.pack();
    f.setLocationRelativeTo(null);
    f.setVisible(true);
    f.setDefaultCloseOperation(Ventana.EXIT_ON_CLOSE);
            }
        }); 
    }
    
}
