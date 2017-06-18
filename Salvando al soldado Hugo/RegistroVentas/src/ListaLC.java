
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
public class ListaLC {
 NodoLC ultimo;
 public ListaLC(){
     ultimo=null;
 }
 //Metodo para saber si la lista esta vacia
 public boolean estaVacia(){
     return ultimo==null;
 }
 //Metodo para insertar NODOS
 public ListaLC insertar(String producto,double elemento){
     NodoLC nuevo=new NodoLC(producto,elemento);
    if(ultimo!=null){
         nuevo.siguiente=ultimo.siguiente;
         ultimo.siguiente=nuevo;
 }
    ultimo=nuevo;
    return this;
 }
 //Metodo para recorrer o mostrar la lista
 public void mostrarLista(){
     NodoLC auxiliar=ultimo.siguiente;
     String cadena="";
     do{
         cadena=cadena+"["+auxiliar.producto+"]->";
         auxiliar=auxiliar.siguiente;
     }while(auxiliar!=ultimo.siguiente);
 JOptionPane.showMessageDialog(null,cadena, "Mostrando la Lista Circular", JOptionPane.INFORMATION_MESSAGE);
 }
  public void mostrarLista2(){
     NodoLC auxiliar=ultimo.siguiente;
     do{
         System.out.println(auxiliar.toString());
         auxiliar=auxiliar.siguiente;
     }while(auxiliar!=ultimo.siguiente);
 }
 
 //Metodo para eliminar un nodo de la lista circular
 public boolean eliminar(String producto){
     NodoLC actual;
     boolean encontrado=false;
     actual=ultimo;
     while(actual.siguiente!=ultimo&&!encontrado){
         encontrado=(actual.siguiente.producto.equals(producto));
         if(!encontrado){
             actual=actual.siguiente;
         }
     }
     encontrado=(actual.siguiente.producto.equals(producto));
     if(encontrado){
         NodoLC auxiliar=actual.siguiente;
         if(ultimo==ultimo.siguiente){
             ultimo=null;
         }else{
             if(auxiliar==ultimo){
                 ultimo=actual;
             }
             actual.siguiente=auxiliar.siguiente;
         }
         auxiliar=null;
     }
     return encontrado==true;
 }

 
}
