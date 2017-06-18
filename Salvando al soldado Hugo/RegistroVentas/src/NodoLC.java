/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SAMSUNG
 */
public class NodoLC {
    double precio;
    String producto;
    NodoLC siguiente;
    public NodoLC(String p,double pr){
        producto=p;
        precio=pr;
        siguiente=this;
    }
     public String toString(){
        return producto+" Su precio es: "+precio;
    }
    
}
