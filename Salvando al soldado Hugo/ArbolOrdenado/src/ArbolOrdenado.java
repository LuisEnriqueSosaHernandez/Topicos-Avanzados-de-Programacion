
import java.util.Scanner;
import javax.swing.JOptionPane;

public class ArbolOrdenado {
      Nodo raiz;

      public ArbolOrdenado() {
          raiz=null;
      }
      
      public void insertar (int dato)
      {
         
          Nodo nuevo = new Nodo(dato);
          nuevo.dato = dato;
          nuevo.izq = null;
          nuevo.der = null;
          if (raiz == null)
              raiz = nuevo;
          else
          {
              Nodo anterior = null, reco;
              reco = raiz;
              while (reco != null)
              {
                  anterior = reco;
                  if (dato < reco.dato)
                      reco = reco.izq;
                  else
                      reco = reco.der;
              }
              if (dato < anterior.dato)
                  anterior.izq = nuevo;
              else
                  anterior.der = nuevo;
          }
      }


      private void RecorrerPreOrden(Nodo reco)
      {
          if (reco != null)
          {
              System.out.print(reco.dato + " ");
              RecorrerPreOrden (reco.izq);
              RecorrerPreOrden (reco.der);
          }
      }

      public void raizPre ()
      {
          RecorrerPreOrden (raiz);
          System.out.println();
      }

      private void RecorrerInOrden (Nodo reco)
      {
          if (reco != null)
          {    
              RecorrerInOrden (reco.izq);
              System.out.print(reco.dato + " ");
              RecorrerInOrden (reco.der);
          }
      }

      public void raizIn ()
      {
          RecorrerInOrden (raiz);
          System.out.println();
      }


      private void RecorrerPostOrden (Nodo reco)
      {
          if (reco != null)
          {
              RecorrerPostOrden(reco.izq);
              RecorrerPostOrden (reco.der);
              System.out.print(reco.dato + " ");
          }
      }
      public void raizPost ()
      {
          RecorrerPostOrden (raiz);
          System.out.println();
      }
      public void ApartirDato(Nodo r,int dato){
          
          if(r!=null){
              if(r.dato>=dato){
                 System.out.println(r.dato);
              }
        
              ApartirDato(r.izq, dato);
              ApartirDato(r.der, dato);
          }
      }
      public void mostrarHojas(Nodo reco){
        if(reco!=null){
           
            if(reco.der==null&&reco.izq==null){
                System.out.println("Hojas "+reco.dato);  
            }
            
            mostrarHojas(reco.izq);
            mostrarHojas(reco.der);
           
        }
   }
       public void raizHojas(){
           mostrarHojas(raiz);
           System.out.println();
   }
       public Nodo raiz(){
         return raiz;           
       }


      

      public static void main (String [] ar)
      {
          Scanner l=new Scanner(System.in);
          int i=1;
          ArbolOrdenado abo = new ArbolOrdenado ();
          try{
          int a=Integer.parseInt(JOptionPane.showInputDialog(null,"Cuantos datos desea Ingresar","Ingrese un numero",JOptionPane.NO_OPTION ));
          while(i<=a){
              try{
          abo.insertar(Integer.parseInt(JOptionPane.showInputDialog(null,"teclee un numero","Leyendo datos",JOptionPane.NO_OPTION )));
         
              }catch(NumberFormatException n){
                  System.out.println("Error de formato"+n.getMessage());
                  i-=1;
              }
               i+=1;
          }
          System.out.println ("Impresion Preorden: ");
          abo.raizPre ();
          System.out.println ("Impresion Inorden: ");
          abo.raizIn ();
          System.out.println ("Impresion Postorden: ");
          abo.raizPost (); 
           System.out.println ("Impresion Hojas: ");
          abo.raizHojas();
              System.out.println("A partir de que dato");
          int dato=l.nextInt();
          abo.ApartirDato(abo.raiz(), dato);
          
          }catch(NumberFormatException x){
              System.out.println("Error de formato"+x.getMessage());
          }
      }      
}