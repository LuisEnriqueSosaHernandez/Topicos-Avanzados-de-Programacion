/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Displayable;
import javax.microedition.midlet.*;

/**
 * @author Uriel
 */
    public class Main extends MIDlet implements CommandListener{
    private Command salir;
    private Command iniciar;
    private Pacman contexto;
    
    public Main(){
        
    salir= new Command("Salir",Command.EXIT,0);
    iniciar = new Command("Iniciar",Command.OK,1);
    contexto = new Pacman();
    contexto.addCommand(salir);
    //contexto.addCommand(iniciar);
    contexto.setCommandListener(this);
    }
    public void commandAction(Command a,Displayable b){
    if(a==salir){
    notifyDestroyed();
    } 
    else if(a==iniciar){
    //Thread t =new Thread(contexto);
    //t.start();
     }
    }
    public void startApp() {
        Display.getDisplay(this).setCurrent(contexto);
    }
    
    public void pauseApp() {
    }
    
    public void destroyApp(boolean unconditional) {
    }

    
}