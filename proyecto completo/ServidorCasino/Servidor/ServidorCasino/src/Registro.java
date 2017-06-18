
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;
import org.xml.sax.SAXException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LESH
 */
public class Registro {
    public void Registro(String nombre,String clave) throws SAXException, IOException, ParserConfigurationException, TransformerException{
         XMLGenerator x = new XMLGenerator();
       if(((nombre != null) && (!nombre.equals("")))&&((clave != null) && (!clave.equals("")) )){
        //codigo
        ArrayList <Usuarios> listUsuarios=x.obtenerUsuarios();
        boolean centi=false;
        for (Usuarios listUsuario : listUsuarios) {
            if ((listUsuario.getNombre().equals(nombre)) && (listUsuario.getContraseña().equals(clave))) {
                JOptionPane.showMessageDialog(null, "Usuario existente ");
                centi=true;
                
            } 
        } 
        //codigo
        if(centi==false){
            x.agregarUsuario(nombre,clave);
       
        }
       }
        
    }
    public boolean estaregistrado(String usuario,String clave){
         XMLGenerator A = new XMLGenerator();
        ArrayList <Usuarios> listUsuarios=A.obtenerUsuarios();
        boolean centi=false;
        for (Usuarios listUsuario : listUsuarios) {
            if ((listUsuario.getNombre().equals(usuario)) && (listUsuario.getContraseña().equals(clave))) {
                
                
                return true;
            } 
        }
      return false;
        }
    public boolean UsuarioOcupado(String usuario,String clave){
         XMLGenerator A = new XMLGenerator();
        ArrayList <Usuarios> listUsuarios=A.obtenerUsuarios();
        boolean centi=false;
        for (Usuarios listUsuario : listUsuarios) {
            if ((listUsuario.getNombre().equals(usuario)) && (!listUsuario.getContraseña().equals(clave))) {
                
                
                return true;
            } 
        }
      return false;
        }
    
}
