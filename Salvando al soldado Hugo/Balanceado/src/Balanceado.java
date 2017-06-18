
import java.util.Scanner;
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
public class Balanceado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArbolAVL a=new ArbolAVL();
        Scanner l=new Scanner(System.in);
        
        //Insertando nodos
       int i=1;
          try{
          int b=Integer.parseInt(JOptionPane.showInputDialog(null,"Cuantos datos desea Ingresar","Ingrese un numero",JOptionPane.NO_OPTION ));
          while(i<=b){
              try{
          a.insertar(Integer.parseInt(JOptionPane.showInputDialog(null,"teclee un numero","Leyendo datos",JOptionPane.NO_OPTION )));
         
              }catch(NumberFormatException n){
                  System.out.println("Error de formato"+n.getMessage());
                  i-=1;
              }
               i+=1;
          }
        System.out.println("PreOrden");
        a.preOrden(a.obtenerRaiz());
        System.out.println("InOrden");
        a.inOrden(a.obtenerRaiz());
        System.out.println("PostOrden");
        a.postOrden(a.obtenerRaiz());
        System.out.println("Hojas");
        a.mostrarHojas(a.obtenerRaiz());
              System.out.println("Raiz actual "+a.obtenerRaiz2());
              System.out.println("A partir de cual ");
              int dato=l.nextInt();
              a.Apartirdato(a.obtenerRaiz(), dato);
             
          }catch(NumberFormatException x){
              System.out.println("Error de formato"+x.getMessage());
          }
    }
    
}
