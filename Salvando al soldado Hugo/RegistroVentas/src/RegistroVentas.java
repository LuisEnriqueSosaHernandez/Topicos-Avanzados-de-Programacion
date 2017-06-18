
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author SAMSUNG
 */
public class RegistroVentas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ListaLC listita = new ListaLC();
        int opcion = 0;
        double precio;
        String producto;
        boolean eliminado=false;
        do {
            try {
                opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "1.Agregar un registro de producto\n"
                        + "2.Eliminar un registro de producto\n"
                        + "3.Mostrar los productos\n"
                        + "4.salir\n"
                        + "Que deseas Hacer?", "Menu de opciones",
                        JOptionPane.INFORMATION_MESSAGE));
                switch (opcion) {
                    case 1:
                        producto = JOptionPane.showInputDialog(null,
                                "Ingresa el nombre del producto", "Agregando producto a la lista circular",
                                JOptionPane.INFORMATION_MESSAGE);
                        precio = Double.parseDouble(JOptionPane.showInputDialog(null,
                                "Ingresa el precio del prodcto", "Agregando precio al producto",
                                JOptionPane.INFORMATION_MESSAGE));
                        listita.insertar(producto,precio);
                        break;
                    case 2:
                        if(!listita.estaVacia()){
                       producto =JOptionPane.showInputDialog(null,
                              "Ingresa el nombre del producto a eliminar", "Eliminando producto de la lista circular",
                               JOptionPane.INFORMATION_MESSAGE);
                       eliminado=listita.eliminar(producto);
                       if(eliminado){
                           JOptionPane.showMessageDialog(null, "El producto eliminado es: "+producto,
                                "Eliminado productos", JOptionPane.INFORMATION_MESSAGE);
                       }else{
                           JOptionPane.showMessageDialog(null, "El producto no esta en la lista",
                                "Producto no encontrado", JOptionPane.INFORMATION_MESSAGE);
                       }
                        }else{
                            JOptionPane.showMessageDialog(null, "Aun no hay productos",
                                "La lista esta vacia", JOptionPane.INFORMATION_MESSAGE);
                        }
                      
                        break;
                    case 3:
                        if(!listita.estaVacia()){
                            listita.mostrarLista();
                            listita.mostrarLista2();
                        }else{
                            JOptionPane.showMessageDialog(null, "Aun no hay nodos",
                                "Lista Vacia", JOptionPane.INFORMATION_MESSAGE);
                        }
                        
                        break;
                    case 4:
                        JOptionPane.showMessageDialog(null, "Aplicacion finalizada",
                                "Fiiin", JOptionPane.INFORMATION_MESSAGE);
                        break;
                        
                   
                    default:
                        JOptionPane.showMessageDialog(null, "La opcion no es correcta",
                                "Incorrecto", JOptionPane.INFORMATION_MESSAGE);
                        break;
                }
            } catch (NumberFormatException n) {
                JOptionPane.showMessageDialog(null, "Error " + n.getMessage());
            }
        } while (opcion != 4);
    }

}
