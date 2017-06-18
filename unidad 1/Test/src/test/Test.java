
package test;


 //@author LESH

public  class Test {
public  native static int getDouble(int n);
   

    
   
    public static void main(String[] args) {
      System.loadLibrary("Test DLL");
      System.out.println("El doble es: "+getDouble(5));
    }
    
}
