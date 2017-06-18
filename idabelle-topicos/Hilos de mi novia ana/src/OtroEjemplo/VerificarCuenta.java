/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OtroEjemplo;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author alex_
 */
public class VerificarCuenta implements Runnable {
    private CuentaBanco cb = new CuentaBanco();
    private synchronized void HacerRetiro(int cantidad) throws InterruptedException{
        if(cb.getBalance()>=cantidad){
        System.out.println(Thread.currentThread().getName() + " Esta realizando un retiro de: "+cantidad+"");
        Thread.sleep(1000);
        cb.retiroBancario(cantidad);
        System.out.println(Thread.currentThread().getName()+" Retiro realizado");
        System.out.println(Thread.currentThread().getName()+" Los fondos son de: "+cb.getBalance());
    }
        else{
            System.out.println(" No hay suficiente dinero en la cuenta para realizar el retiro. "+Thread.currentThread().getName());
            Thread.sleep(1000);
        }
    }
    public void run(){
        for(int i=0; i<=3; i++){
            try{
                this.HacerRetiro(10);
                if(cb.getBalance()<0){
                    System.out.println("La cuenta será sobregirada");
                }
            } catch (InterruptedException ex) {
            }
        }
    }
    
}
