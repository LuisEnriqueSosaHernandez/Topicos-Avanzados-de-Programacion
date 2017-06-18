/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Random;
import javax.microedition.lcdui.*;

/**
 * @author LESH
 */
public class Pacman extends Canvas implements CommandListener,Runnable {
Image pacman,Manzana,fantasma,fantasma1;

int posicionx=0,posiciony=0,comidax=0,comiday=0,puntaje=0,rival1x,rival1y,rival2x,rival2y;
int codigo=0;
String estado="New Game";
boolean b=true;
Random rnd = new Random();
 
    /**
     * constructor
     */
  
    public Pacman() {
        try {
          
            posicionx=((getWidth()-24)/2);
            posiciony=((getWidth()-24)/2);
            comidax=(int)(rnd.nextDouble() * (getHeight()) + 0); 
        comiday=(int)(rnd.nextDouble() * (getWidth())+ 0);
        rival1x=(int)(rnd.nextDouble() * (getHeight()) + 0); 
        rival1y=(int)(rnd.nextDouble() * (getWidth())+ 0);
        rival2x=(int)(rnd.nextDouble() * (getHeight()) + 0); 
        rival2y=(int)(rnd.nextDouble() * (getWidth())+ 0);
        
        while((comidax==posicionx&&comiday==posiciony)||(comidax==rival1x&&comiday==rival1y)||(comidax==rival2x&&comiday==rival2y)){
            comidax=(int)(rnd.nextDouble() * (getWidth()) + 0); 
        comiday=(int)(rnd.nextDouble() * (getHeight())+ 0); 
        repaint();
        }
            // Set up this canvas to listen to command events
            setCommandListener(this);
            // Add the Exit command
            addCommand(new Command("Exit", Command.EXIT, 1));
            pacman=Image.createImage("/imagenes/pacman.png");
             Manzana=Image.createImage("/imagenes/Manzana.png");
             fantasma=Image.createImage("/imagenes/fantasma.png");
             fantasma1=Image.createImage("/imagenes/fantasma1.png");
            
           
           Thread correr =new Thread(this);
           correr.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * paint
     */
    public void comida(){
         comidax=(int)(rnd.nextDouble() * (getHeight()) + 0); 
        comiday=(int)(rnd.nextDouble() * (getWidth())+ 0);  
        while(comidax==posicionx&&comiday==posiciony){
            comidax=(int)(rnd.nextDouble() * (getHeight()) + 0); 
        comiday=(int)(rnd.nextDouble() * (getWidth())+ 0); 
        }
        repaint();
    }
    
     public void moverfantasma1(){
         rival1x=(int)(rnd.nextDouble() * (getHeight()) + 0); 
        rival1y=(int)(rnd.nextDouble() * (getWidth())+ 0);  
        while(rival1x==posicionx&&rival1y==posiciony){
            rival1x=(int)(rnd.nextDouble() * (getHeight()) + 0); 
        rival1y=(int)(rnd.nextDouble() * (getWidth())+ 0); 
        }
        repaint();
    }
     
      public void moverfantasma2(){
         rival2x=(int)(rnd.nextDouble() * (getHeight()) + 0); 
        rival2y=(int)(rnd.nextDouble() * (getWidth())+ 0);  
        while(rival2x==posicionx&&rival2y==posiciony){
            rival2x=(int)(rnd.nextDouble() * (getHeight()) + 0); 
        rival2y=(int)(rnd.nextDouble() * (getWidth())+ 0); 
        }
        repaint();
    }
    public void paint(Graphics g) {
        g.setColor(0,0,0);
        g.fillRect(0, 0, getWidth(), getHeight());
         //g.drawString("Puntaje"+puntaje,0, 0, Graphics.TOP|Graphics.LEFT);
        g.drawImage(pacman, posicionx, posiciony, Graphics.TOP|Graphics.LEFT);
        g.drawImage(Manzana, comidax, comiday, Graphics.TOP|Graphics.LEFT);
        g.drawImage(fantasma, rival1x, rival1y, Graphics.TOP|Graphics.LEFT);
        g.drawImage(fantasma1, rival2x, rival2y, Graphics.TOP|Graphics.LEFT);
        g.setColor(255,255,255);
         g.drawString("Puntaje: "+puntaje,0, 0, Graphics.TOP|Graphics.LEFT);
          g.drawString(estado,getHeight()-130, 0, Graphics.TOP|Graphics.LEFT);
        
    }

    /**
     * Called when a key is pressed.
     */
    protected void keyPressed(int keyCode) {
        estado="Jugando";
        
        b=true;
       codigo=keyCode;
       
    }

    /**
     * Called when a key is released.
     */
    protected void keyReleased(int keyCode) {
    }

    /**
     * Called when a key is repeated (held down).
     */
    protected void keyRepeated(int keyCode) {
    }

    /**
     * Called when the pointer is dragged.
     */
    protected void pointerDragged(int x, int y) {
    }

    /**
     * Called when the pointer is pressed.
     */
    protected void pointerPressed(int x, int y) {
    }

    /**
     * Called when the pointer is released.
     */
    protected void pointerReleased(int x, int y) {
    }

    /**
     * Called when action should be handled
     */
    public void commandAction(Command command, Displayable displayable) {
    }

    public void run() {
        while(true){
            try {
                switch(codigo){
                    case -1:
                        if(posiciony>=0){
                            if(b==true){
                        posiciony--;
                            }
                        if((posicionx==comidax||posicionx==comidax+1||posicionx==comidax-1
                                ||posicionx==comidax+2||posicionx==comidax-2
                                ||posicionx==comidax+3||posicionx==comidax-3
                                ||posicionx==comidax+4||posicionx==comidax-4
                                ||posicionx==comidax+5||posicionx==comidax-5
                                ||posicionx==comidax+6||posicionx==comidax-6
                                ||posicionx==comidax+7||posicionx==comidax-7
                                ||posicionx==comidax+8||posicionx==comidax-8
                                ||posicionx==comidax+9||posicionx==comidax-9
                                ||posicionx==comidax+10||posicionx==comidax-10
                                ||posicionx==comidax+11||posicionx==comidax-11
                                ||posicionx==comidax+12||posicionx==comidax-12
                                ||posicionx==comidax+13||posicionx==comidax-13
                                ||posicionx==comidax+14||posicionx==comidax-14
                                ||posicionx==comidax+15||posicionx==comidax-15
                                ||posicionx==comidax+16||posicionx==comidax-16
                                ||posicionx==comidax+17||posicionx==comidax-17
                                ||posicionx==comidax+18||posicionx==comidax-18
                                ||posicionx==comidax+19||posicionx==comidax-19
                                ||posicionx==comidax+20||posicionx==comidax-20
                                ||posicionx==comidax+21||posicionx==comidax-21
                                
                                )&&(posiciony==comiday||posiciony==comiday+1||posiciony==comiday-1
                                ||posiciony==comiday+1||posiciony==comiday-1
                                ||posiciony==comiday+2||posiciony==comiday-2
                                ||posiciony==comiday+3||posiciony==comiday-3
                                ||posiciony==comiday+4||posiciony==comiday-4
                                ||posiciony==comiday+5||posiciony==comiday-5
                                ||posiciony==comiday+6||posiciony==comiday-6
                                ||posiciony==comiday+7||posiciony==comiday-7
                                ||posiciony==comiday+8||posiciony==comiday-8
                                ||posiciony==comiday+9||posiciony==comiday-9
                                ||posiciony==comiday+10||posiciony==comiday-10
                                ||posiciony==comiday+11||posiciony==comiday-11
                                ||posiciony==comiday+12||posiciony==comiday-12
                                ||posiciony==comiday+13||posiciony==comiday-13
                                ||posiciony==comiday+14||posiciony==comiday-14
                                ||posiciony==comiday+15||posiciony==comiday-15
                                ||posiciony==comiday+16||posiciony==comiday-16
                                ||posiciony==comiday+17||posiciony==comiday-17
                                ||posiciony==comiday+18||posiciony==comiday-18
                                ||posiciony==comiday+19||posiciony==comiday-19
                                ||posiciony==comiday+20||posiciony==comiday-20
                                ||posiciony==comiday+21||posiciony==comiday-21)){
                            comida();
                            moverfantasma1();
                            moverfantasma2();
                            puntaje+=1;
                        }
                        if((posicionx==rival1x||posicionx==rival1x+1||posicionx==rival1x-1
                                 ||posicionx==rival1x+2||posicionx==rival1x-2
                                 ||posicionx==rival1x+3||posicionx==rival1x-3
                                 ||posicionx==rival1x+4||posicionx==rival1x-4
                                 ||posicionx==rival1x+5||posicionx==rival1x-5
                                 ||posicionx==rival1x+6||posicionx==rival1x-6
                                 )&&(posiciony==rival1y||posiciony==rival1y+1||posiciony==rival1y-1
                                 ||posiciony==rival1y+2||posiciony==rival1y-2
                                 ||posiciony==rival1y+3||posiciony==rival1y-3
                                 ||posiciony==rival1y+4||posiciony==rival1y-4
                                 ||posiciony==rival1y+5||posiciony==rival1y-5
                                 ||posiciony==rival1y+6||posiciony==rival1y-6)){
                            puntaje=0;
                            posicionx=((getWidth()-24)/2);
            posiciony=((getWidth()-24)/2);
            b=false;
            estado="End Game";
                         }
                         if((posicionx==rival2x||posicionx==rival2x+1||posicionx==rival2x-1
                                 ||posicionx==rival2x+2||posicionx==rival2x-2
                                 ||posicionx==rival2x+3||posicionx==rival2x-3
                                 ||posicionx==rival2x+4||posicionx==rival2x-4
                                 ||posicionx==rival2x+5||posicionx==rival2x-5
                                 ||posicionx==rival2x+6||posicionx==rival2x-6
                                 )&&(posiciony==rival2y||posiciony==rival2y+1||posiciony==rival1y-1
                                 ||posiciony==rival2y+2||posiciony==rival2y-2
                                 ||posiciony==rival2y+3||posiciony==rival2y-3
                                 ||posiciony==rival2y+4||posiciony==rival2y-4
                                 ||posiciony==rival2y+5||posiciony==rival2y-5
                                 ||posiciony==rival2y+6||posiciony==rival2y-6)){
                            puntaje=0;
                            posicionx=((getWidth()-24)/2);
            posiciony=((getWidth()-24)/2);
            b=false;
             estado="End Game";
                         }
                        }
                        break;
                    case -2:
                        if(posiciony<=getWidth()){
                            if(b==true){
                        posiciony++;
                            }
                         if((posicionx==comidax||posicionx==comidax+1||posicionx==comidax-1
                                ||posicionx==comidax+2||posicionx==comidax-2
                                ||posicionx==comidax+3||posicionx==comidax-3
                                ||posicionx==comidax+4||posicionx==comidax-4
                                ||posicionx==comidax+5||posicionx==comidax-5
                                ||posicionx==comidax+6||posicionx==comidax-6
                                ||posicionx==comidax+7||posicionx==comidax-7
                                ||posicionx==comidax+8||posicionx==comidax-8
                                ||posicionx==comidax+9||posicionx==comidax-9
                                ||posicionx==comidax+10||posicionx==comidax-10
                                ||posicionx==comidax+11||posicionx==comidax-11
                                ||posicionx==comidax+12||posicionx==comidax-12
                                ||posicionx==comidax+13||posicionx==comidax-13
                                ||posicionx==comidax+14||posicionx==comidax-14
                                ||posicionx==comidax+15||posicionx==comidax-15
                                ||posicionx==comidax+16||posicionx==comidax-16
                                ||posicionx==comidax+17||posicionx==comidax-17
                                ||posicionx==comidax+18||posicionx==comidax-18
                                ||posicionx==comidax+19||posicionx==comidax-19
                                ||posicionx==comidax+20||posicionx==comidax-20
                                ||posicionx==comidax+21||posicionx==comidax-21
                                
                                )&&(posiciony==comiday||posiciony==comiday+1||posiciony==comiday-1
                                ||posiciony==comiday+1||posiciony==comiday-1
                                ||posiciony==comiday+2||posiciony==comiday-2
                                ||posiciony==comiday+3||posiciony==comiday-3
                                ||posiciony==comiday+4||posiciony==comiday-4
                                ||posiciony==comiday+5||posiciony==comiday-5
                                ||posiciony==comiday+6||posiciony==comiday-6
                                ||posiciony==comiday+7||posiciony==comiday-7
                                ||posiciony==comiday+8||posiciony==comiday-8
                                ||posiciony==comiday+9||posiciony==comiday-9
                                ||posiciony==comiday+10||posiciony==comiday-10
                                ||posiciony==comiday+11||posiciony==comiday-11
                                ||posiciony==comiday+12||posiciony==comiday-12
                                ||posiciony==comiday+13||posiciony==comiday-13
                                ||posiciony==comiday+14||posiciony==comiday-14
                                ||posiciony==comiday+15||posiciony==comiday-15
                                ||posiciony==comiday+16||posiciony==comiday-16
                                ||posiciony==comiday+17||posiciony==comiday-17
                                ||posiciony==comiday+18||posiciony==comiday-18
                                ||posiciony==comiday+19||posiciony==comiday-19
                                ||posiciony==comiday+20||posiciony==comiday-20
                                ||posiciony==comiday+21||posiciony==comiday-21)){
                            comida();
                            moverfantasma1();
                            moverfantasma2();
                            puntaje+=1;
                            
                        }
                         if((posicionx==rival1x||posicionx==rival1x+1||posicionx==rival1x-1
                                 ||posicionx==rival1x+2||posicionx==rival1x-2
                                 ||posicionx==rival1x+3||posicionx==rival1x-3
                                 ||posicionx==rival1x+4||posicionx==rival1x-4
                                 ||posicionx==rival1x+5||posicionx==rival1x-5
                                 ||posicionx==rival1x+6||posicionx==rival1x-6
                                 )&&(posiciony==rival1y||posiciony==rival1y+1||posiciony==rival1y-1
                                 ||posiciony==rival1y+2||posiciony==rival1y-2
                                 ||posiciony==rival1y+3||posiciony==rival1y-3
                                 ||posiciony==rival1y+4||posiciony==rival1y-4
                                 ||posiciony==rival1y+5||posiciony==rival1y-5
                                 ||posiciony==rival1y+6||posiciony==rival1y-6)){
                             puntaje=0;
                             posicionx=((getWidth()-24)/2);
            posiciony=((getWidth()-24)/2);
            b=false;
             estado="End Game";
                         }
                         if((posicionx==rival2x||posicionx==rival2x+1||posicionx==rival2x-1
                                 ||posicionx==rival2x+2||posicionx==rival2x-2
                                 ||posicionx==rival2x+3||posicionx==rival2x-3
                                 ||posicionx==rival2x+4||posicionx==rival2x-4
                                 ||posicionx==rival2x+5||posicionx==rival2x-5
                                 ||posicionx==rival2x+6||posicionx==rival2x-6
                                 )&&(posiciony==rival2y||posiciony==rival2y+1||posiciony==rival1y-1
                                 ||posiciony==rival2y+2||posiciony==rival2y-2
                                 ||posiciony==rival2y+3||posiciony==rival2y-3
                                 ||posiciony==rival2y+4||posiciony==rival2y-4
                                 ||posiciony==rival2y+5||posiciony==rival2y-5
                                 ||posiciony==rival2y+6||posiciony==rival2y-6)){
                            puntaje=0;
                            posicionx=((getWidth()-24)/2);
            posiciony=((getWidth()-24)/2);
            b=false;
             estado="End Game";
                         }
                         
                        }                        
                        break;
                        
                    case -3:
                        if(posicionx>=0){
                            if(b==true){
                        posicionx--;
                            }
                        if((posicionx==comidax||posicionx==comidax+1||posicionx==comidax-1
                                ||posicionx==comidax+2||posicionx==comidax-2
                                ||posicionx==comidax+3||posicionx==comidax-3
                                ||posicionx==comidax+4||posicionx==comidax-4
                                ||posicionx==comidax+5||posicionx==comidax-5
                                ||posicionx==comidax+6||posicionx==comidax-6
                                ||posicionx==comidax+7||posicionx==comidax-7
                                ||posicionx==comidax+8||posicionx==comidax-8
                                ||posicionx==comidax+9||posicionx==comidax-9
                                ||posicionx==comidax+10||posicionx==comidax-10
                                ||posicionx==comidax+11||posicionx==comidax-11
                                ||posicionx==comidax+12||posicionx==comidax-12
                                ||posicionx==comidax+13||posicionx==comidax-13
                                ||posicionx==comidax+14||posicionx==comidax-14
                                ||posicionx==comidax+15||posicionx==comidax-15
                                ||posicionx==comidax+16||posicionx==comidax-16
                                ||posicionx==comidax+17||posicionx==comidax-17
                                ||posicionx==comidax+18||posicionx==comidax-18
                                ||posicionx==comidax+19||posicionx==comidax-19
                                ||posicionx==comidax+20||posicionx==comidax-20
                                ||posicionx==comidax+21||posicionx==comidax-21
                                
                                )&&(posiciony==comiday||posiciony==comiday+1||posiciony==comiday-1
                                ||posiciony==comiday+1||posiciony==comiday-1
                                ||posiciony==comiday+2||posiciony==comiday-2
                                ||posiciony==comiday+3||posiciony==comiday-3
                                ||posiciony==comiday+4||posiciony==comiday-4
                                ||posiciony==comiday+5||posiciony==comiday-5
                                ||posiciony==comiday+6||posiciony==comiday-6
                                ||posiciony==comiday+7||posiciony==comiday-7
                                ||posiciony==comiday+8||posiciony==comiday-8
                                ||posiciony==comiday+9||posiciony==comiday-9
                                ||posiciony==comiday+10||posiciony==comiday-10
                                ||posiciony==comiday+11||posiciony==comiday-11
                                ||posiciony==comiday+12||posiciony==comiday-12
                                ||posiciony==comiday+13||posiciony==comiday-13
                                ||posiciony==comiday+14||posiciony==comiday-14
                                ||posiciony==comiday+15||posiciony==comiday-15
                                ||posiciony==comiday+16||posiciony==comiday-16
                                ||posiciony==comiday+17||posiciony==comiday-17
                                ||posiciony==comiday+18||posiciony==comiday-18
                                ||posiciony==comiday+19||posiciony==comiday-19
                                ||posiciony==comiday+20||posiciony==comiday-20
                                ||posiciony==comiday+21||posiciony==comiday-21)){
                            comida();
                            moverfantasma1();
                            moverfantasma2();
                            puntaje+=1;
                        }
                        if((posicionx==rival1x||posicionx==rival1x+1||posicionx==rival1x-1
                                 ||posicionx==rival1x+2||posicionx==rival1x-2
                                 ||posicionx==rival1x+3||posicionx==rival1x-3
                                 ||posicionx==rival1x+4||posicionx==rival1x-4
                                 ||posicionx==rival1x+5||posicionx==rival1x-5
                                 ||posicionx==rival1x+6||posicionx==rival1x-6
                                 )&&(posiciony==rival1y||posiciony==rival1y+1||posiciony==rival1y-1
                                 ||posiciony==rival1y+2||posiciony==rival1y-2
                                 ||posiciony==rival1y+3||posiciony==rival1y-3
                                 ||posiciony==rival1y+4||posiciony==rival1y-4
                                 ||posiciony==rival1y+5||posiciony==rival1y-5
                                 ||posiciony==rival1y+6||posiciony==rival1y-6)){
                             puntaje=0;
                             posicionx=((getWidth()-24)/2);
            posiciony=((getWidth()-24)/2);
            b=false;
             estado="End Game";
                         }
                         if((posicionx==rival2x||posicionx==rival2x+1||posicionx==rival2x-1
                                 ||posicionx==rival2x+2||posicionx==rival2x-2
                                 ||posicionx==rival2x+3||posicionx==rival2x-3
                                 ||posicionx==rival2x+4||posicionx==rival2x-4
                                 ||posicionx==rival2x+5||posicionx==rival2x-5
                                 ||posicionx==rival2x+6||posicionx==rival2x-6
                                 )&&(posiciony==rival2y||posiciony==rival2y+1||posiciony==rival1y-1
                                 ||posiciony==rival2y+2||posiciony==rival2y-2
                                 ||posiciony==rival2y+3||posiciony==rival2y-3
                                 ||posiciony==rival2y+4||posiciony==rival2y-4
                                 ||posiciony==rival2y+5||posiciony==rival2y-5
                                 ||posiciony==rival2y+6||posiciony==rival2y-6)){
                             puntaje=0;
                             posicionx=((getWidth()-24)/2);
            posiciony=((getWidth()-24)/2);
            b=false;
             estado="End Game";
                         }
                        }
                        break;
                    case -4:
                        if(posicionx<=getHeight()){
                            if(b==true){
                        posicionx++;
                            }
                         if((posicionx==comidax||posicionx==comidax+1||posicionx==comidax-1
                                ||posicionx==comidax+2||posicionx==comidax-2
                                ||posicionx==comidax+3||posicionx==comidax-3
                                ||posicionx==comidax+4||posicionx==comidax-4
                                ||posicionx==comidax+5||posicionx==comidax-5
                                ||posicionx==comidax+6||posicionx==comidax-6
                                ||posicionx==comidax+7||posicionx==comidax-7
                                ||posicionx==comidax+8||posicionx==comidax-8
                                ||posicionx==comidax+9||posicionx==comidax-9
                                ||posicionx==comidax+10||posicionx==comidax-10
                                ||posicionx==comidax+11||posicionx==comidax-11
                                ||posicionx==comidax+12||posicionx==comidax-12
                                ||posicionx==comidax+13||posicionx==comidax-13
                                ||posicionx==comidax+14||posicionx==comidax-14
                                ||posicionx==comidax+15||posicionx==comidax-15
                                ||posicionx==comidax+16||posicionx==comidax-16
                                ||posicionx==comidax+17||posicionx==comidax-17
                                ||posicionx==comidax+18||posicionx==comidax-18
                                ||posicionx==comidax+19||posicionx==comidax-19
                                ||posicionx==comidax+20||posicionx==comidax-20
                                ||posicionx==comidax+21||posicionx==comidax-21
                                
                                )&&(posiciony==comiday||posiciony==comiday+1||posiciony==comiday-1
                                ||posiciony==comiday+1||posiciony==comiday-1
                                ||posiciony==comiday+2||posiciony==comiday-2
                                ||posiciony==comiday+3||posiciony==comiday-3
                                ||posiciony==comiday+4||posiciony==comiday-4
                                ||posiciony==comiday+5||posiciony==comiday-5
                                ||posiciony==comiday+6||posiciony==comiday-6
                                ||posiciony==comiday+7||posiciony==comiday-7
                                ||posiciony==comiday+8||posiciony==comiday-8
                                ||posiciony==comiday+9||posiciony==comiday-9
                                ||posiciony==comiday+10||posiciony==comiday-10
                                ||posiciony==comiday+11||posiciony==comiday-11
                                ||posiciony==comiday+12||posiciony==comiday-12
                                ||posiciony==comiday+13||posiciony==comiday-13
                                ||posiciony==comiday+14||posiciony==comiday-14
                                ||posiciony==comiday+15||posiciony==comiday-15
                                ||posiciony==comiday+16||posiciony==comiday-16
                                ||posiciony==comiday+17||posiciony==comiday-17
                                ||posiciony==comiday+18||posiciony==comiday-18
                                ||posiciony==comiday+19||posiciony==comiday-19
                                ||posiciony==comiday+20||posiciony==comiday-20
                                ||posiciony==comiday+21||posiciony==comiday-21)){
                            comida();
                            moverfantasma1();
                            moverfantasma2();
                            puntaje+=1;
                        }
                         if((posicionx==rival1x||posicionx==rival1x+1||posicionx==rival1x-1
                                 ||posicionx==rival1x+2||posicionx==rival1x-2
                                 ||posicionx==rival1x+3||posicionx==rival1x-3
                                 ||posicionx==rival1x+4||posicionx==rival1x-4
                                 ||posicionx==rival1x+5||posicionx==rival1x-5
                                 ||posicionx==rival1x+6||posicionx==rival1x-6
                                 )&&(posiciony==rival1y||posiciony==rival1y+1||posiciony==rival1y-1
                                 ||posiciony==rival1y+2||posiciony==rival1y-2
                                 ||posiciony==rival1y+3||posiciony==rival1y-3
                                 ||posiciony==rival1y+4||posiciony==rival1y-4
                                 ||posiciony==rival1y+5||posiciony==rival1y-5
                                 ||posiciony==rival1y+6||posiciony==rival1y-6)){
                             puntaje=0;
                             posicionx=((getWidth()-24)/2);
            posiciony=((getWidth()-24)/2);
            b=false;
             estado="End Game";
                         }
                         if((posicionx==rival2x||posicionx==rival2x+1||posicionx==rival2x-1
                                 ||posicionx==rival2x+2||posicionx==rival2x-2
                                 ||posicionx==rival2x+3||posicionx==rival2x-3
                                 ||posicionx==rival2x+4||posicionx==rival2x-4
                                 ||posicionx==rival2x+5||posicionx==rival2x-5
                                 ||posicionx==rival2x+6||posicionx==rival2x-6
                                 )&&(posiciony==rival2y||posiciony==rival2y+1||posiciony==rival1y-1
                                 ||posiciony==rival2y+2||posiciony==rival2y-2
                                 ||posiciony==rival2y+3||posiciony==rival2y-3
                                 ||posiciony==rival2y+4||posiciony==rival2y-4
                                 ||posiciony==rival2y+5||posiciony==rival2y-5
                                 ||posiciony==rival2y+6||posiciony==rival2y-6)){
                            puntaje=0;
                            posicionx=((getWidth()-24)/2);
            posiciony=((getWidth()-24)/2);
            b=false;
             estado="End Game";
                         }
                        }
                        break;
                         case 50:
                        if(posiciony>=0){
                            if(b==true){
                        posiciony--;
                            }
                        if((posicionx==comidax||posicionx==comidax+1||posicionx==comidax-1
                                ||posicionx==comidax+2||posicionx==comidax-2
                                ||posicionx==comidax+3||posicionx==comidax-3
                                ||posicionx==comidax+4||posicionx==comidax-4
                                ||posicionx==comidax+5||posicionx==comidax-5
                                ||posicionx==comidax+6||posicionx==comidax-6
                                ||posicionx==comidax+7||posicionx==comidax-7
                                ||posicionx==comidax+8||posicionx==comidax-8
                                ||posicionx==comidax+9||posicionx==comidax-9
                                ||posicionx==comidax+10||posicionx==comidax-10
                                ||posicionx==comidax+11||posicionx==comidax-11
                                ||posicionx==comidax+12||posicionx==comidax-12
                                ||posicionx==comidax+13||posicionx==comidax-13
                                ||posicionx==comidax+14||posicionx==comidax-14
                                ||posicionx==comidax+15||posicionx==comidax-15
                                ||posicionx==comidax+16||posicionx==comidax-16
                                ||posicionx==comidax+17||posicionx==comidax-17
                                ||posicionx==comidax+18||posicionx==comidax-18
                                ||posicionx==comidax+19||posicionx==comidax-19
                                ||posicionx==comidax+20||posicionx==comidax-20
                                ||posicionx==comidax+21||posicionx==comidax-21
                                
                                )&&(posiciony==comiday||posiciony==comiday+1||posiciony==comiday-1
                                ||posiciony==comiday+1||posiciony==comiday-1
                                ||posiciony==comiday+2||posiciony==comiday-2
                                ||posiciony==comiday+3||posiciony==comiday-3
                                ||posiciony==comiday+4||posiciony==comiday-4
                                ||posiciony==comiday+5||posiciony==comiday-5
                                ||posiciony==comiday+6||posiciony==comiday-6
                                ||posiciony==comiday+7||posiciony==comiday-7
                                ||posiciony==comiday+8||posiciony==comiday-8
                                ||posiciony==comiday+9||posiciony==comiday-9
                                ||posiciony==comiday+10||posiciony==comiday-10
                                ||posiciony==comiday+11||posiciony==comiday-11
                                ||posiciony==comiday+12||posiciony==comiday-12
                                ||posiciony==comiday+13||posiciony==comiday-13
                                ||posiciony==comiday+14||posiciony==comiday-14
                                ||posiciony==comiday+15||posiciony==comiday-15
                                ||posiciony==comiday+16||posiciony==comiday-16
                                ||posiciony==comiday+17||posiciony==comiday-17
                                ||posiciony==comiday+18||posiciony==comiday-18
                                ||posiciony==comiday+19||posiciony==comiday-19
                                ||posiciony==comiday+20||posiciony==comiday-20
                                ||posiciony==comiday+21||posiciony==comiday-21)){
                            comida();
                            moverfantasma1();
                            moverfantasma2();
                            puntaje+=1;
                        }
                        if((posicionx==rival1x||posicionx==rival1x+1||posicionx==rival1x-1
                                 ||posicionx==rival1x+2||posicionx==rival1x-2
                                 ||posicionx==rival1x+3||posicionx==rival1x-3
                                 ||posicionx==rival1x+4||posicionx==rival1x-4
                                 ||posicionx==rival1x+5||posicionx==rival1x-5
                                 ||posicionx==rival1x+6||posicionx==rival1x-6
                                 )&&(posiciony==rival1y||posiciony==rival1y+1||posiciony==rival1y-1
                                 ||posiciony==rival1y+2||posiciony==rival1y-2
                                 ||posiciony==rival1y+3||posiciony==rival1y-3
                                 ||posiciony==rival1y+4||posiciony==rival1y-4
                                 ||posiciony==rival1y+5||posiciony==rival1y-5
                                 ||posiciony==rival1y+6||posiciony==rival1y-6)){
                            puntaje=0;
                            posicionx=((getWidth()-24)/2);
            posiciony=((getWidth()-24)/2);
            b=false;
            estado="End Game";
                         }
                         if((posicionx==rival2x||posicionx==rival2x+1||posicionx==rival2x-1
                                 ||posicionx==rival2x+2||posicionx==rival2x-2
                                 ||posicionx==rival2x+3||posicionx==rival2x-3
                                 ||posicionx==rival2x+4||posicionx==rival2x-4
                                 ||posicionx==rival2x+5||posicionx==rival2x-5
                                 ||posicionx==rival2x+6||posicionx==rival2x-6
                                 )&&(posiciony==rival2y||posiciony==rival2y+1||posiciony==rival1y-1
                                 ||posiciony==rival2y+2||posiciony==rival2y-2
                                 ||posiciony==rival2y+3||posiciony==rival2y-3
                                 ||posiciony==rival2y+4||posiciony==rival2y-4
                                 ||posiciony==rival2y+5||posiciony==rival2y-5
                                 ||posiciony==rival2y+6||posiciony==rival2y-6)){
                            puntaje=0;
                            posicionx=((getWidth()-24)/2);
            posiciony=((getWidth()-24)/2);
            b=false;
             estado="End Game";
                         }
                        }
                        break;
                        case 56:
                        if(posiciony<=getWidth()){
                            if(b==true){
                        posiciony++;
                            }
                         if((posicionx==comidax||posicionx==comidax+1||posicionx==comidax-1
                                ||posicionx==comidax+2||posicionx==comidax-2
                                ||posicionx==comidax+3||posicionx==comidax-3
                                ||posicionx==comidax+4||posicionx==comidax-4
                                ||posicionx==comidax+5||posicionx==comidax-5
                                ||posicionx==comidax+6||posicionx==comidax-6
                                ||posicionx==comidax+7||posicionx==comidax-7
                                ||posicionx==comidax+8||posicionx==comidax-8
                                ||posicionx==comidax+9||posicionx==comidax-9
                                ||posicionx==comidax+10||posicionx==comidax-10
                                ||posicionx==comidax+11||posicionx==comidax-11
                                ||posicionx==comidax+12||posicionx==comidax-12
                                ||posicionx==comidax+13||posicionx==comidax-13
                                ||posicionx==comidax+14||posicionx==comidax-14
                                ||posicionx==comidax+15||posicionx==comidax-15
                                ||posicionx==comidax+16||posicionx==comidax-16
                                ||posicionx==comidax+17||posicionx==comidax-17
                                ||posicionx==comidax+18||posicionx==comidax-18
                                ||posicionx==comidax+19||posicionx==comidax-19
                                ||posicionx==comidax+20||posicionx==comidax-20
                                ||posicionx==comidax+21||posicionx==comidax-21
                                
                                )&&(posiciony==comiday||posiciony==comiday+1||posiciony==comiday-1
                                ||posiciony==comiday+1||posiciony==comiday-1
                                ||posiciony==comiday+2||posiciony==comiday-2
                                ||posiciony==comiday+3||posiciony==comiday-3
                                ||posiciony==comiday+4||posiciony==comiday-4
                                ||posiciony==comiday+5||posiciony==comiday-5
                                ||posiciony==comiday+6||posiciony==comiday-6
                                ||posiciony==comiday+7||posiciony==comiday-7
                                ||posiciony==comiday+8||posiciony==comiday-8
                                ||posiciony==comiday+9||posiciony==comiday-9
                                ||posiciony==comiday+10||posiciony==comiday-10
                                ||posiciony==comiday+11||posiciony==comiday-11
                                ||posiciony==comiday+12||posiciony==comiday-12
                                ||posiciony==comiday+13||posiciony==comiday-13
                                ||posiciony==comiday+14||posiciony==comiday-14
                                ||posiciony==comiday+15||posiciony==comiday-15
                                ||posiciony==comiday+16||posiciony==comiday-16
                                ||posiciony==comiday+17||posiciony==comiday-17
                                ||posiciony==comiday+18||posiciony==comiday-18
                                ||posiciony==comiday+19||posiciony==comiday-19
                                ||posiciony==comiday+20||posiciony==comiday-20
                                ||posiciony==comiday+21||posiciony==comiday-21)){
                            comida();
                            moverfantasma1();
                            moverfantasma2();
                            puntaje+=1;
                            
                        }
                         if((posicionx==rival1x||posicionx==rival1x+1||posicionx==rival1x-1
                                 ||posicionx==rival1x+2||posicionx==rival1x-2
                                 ||posicionx==rival1x+3||posicionx==rival1x-3
                                 ||posicionx==rival1x+4||posicionx==rival1x-4
                                 ||posicionx==rival1x+5||posicionx==rival1x-5
                                 ||posicionx==rival1x+6||posicionx==rival1x-6
                                 )&&(posiciony==rival1y||posiciony==rival1y+1||posiciony==rival1y-1
                                 ||posiciony==rival1y+2||posiciony==rival1y-2
                                 ||posiciony==rival1y+3||posiciony==rival1y-3
                                 ||posiciony==rival1y+4||posiciony==rival1y-4
                                 ||posiciony==rival1y+5||posiciony==rival1y-5
                                 ||posiciony==rival1y+6||posiciony==rival1y-6)){
                             puntaje=0;
                             posicionx=((getWidth()-24)/2);
            posiciony=((getWidth()-24)/2);
            b=false;
             estado="End Game";
                         }
                         if((posicionx==rival2x||posicionx==rival2x+1||posicionx==rival2x-1
                                 ||posicionx==rival2x+2||posicionx==rival2x-2
                                 ||posicionx==rival2x+3||posicionx==rival2x-3
                                 ||posicionx==rival2x+4||posicionx==rival2x-4
                                 ||posicionx==rival2x+5||posicionx==rival2x-5
                                 ||posicionx==rival2x+6||posicionx==rival2x-6
                                 )&&(posiciony==rival2y||posiciony==rival2y+1||posiciony==rival1y-1
                                 ||posiciony==rival2y+2||posiciony==rival2y-2
                                 ||posiciony==rival2y+3||posiciony==rival2y-3
                                 ||posiciony==rival2y+4||posiciony==rival2y-4
                                 ||posiciony==rival2y+5||posiciony==rival2y-5
                                 ||posiciony==rival2y+6||posiciony==rival2y-6)){
                            puntaje=0;
                            posicionx=((getWidth()-24)/2);
            posiciony=((getWidth()-24)/2);
            b=false;
             estado="End Game";
                         }
                         
                        }                        
                        break;
                        case 52:
                        if(posicionx>=0){
                            if(b==true){
                        posicionx--;
                            }
                        if((posicionx==comidax||posicionx==comidax+1||posicionx==comidax-1
                                ||posicionx==comidax+2||posicionx==comidax-2
                                ||posicionx==comidax+3||posicionx==comidax-3
                                ||posicionx==comidax+4||posicionx==comidax-4
                                ||posicionx==comidax+5||posicionx==comidax-5
                                ||posicionx==comidax+6||posicionx==comidax-6
                                ||posicionx==comidax+7||posicionx==comidax-7
                                ||posicionx==comidax+8||posicionx==comidax-8
                                ||posicionx==comidax+9||posicionx==comidax-9
                                ||posicionx==comidax+10||posicionx==comidax-10
                                ||posicionx==comidax+11||posicionx==comidax-11
                                ||posicionx==comidax+12||posicionx==comidax-12
                                ||posicionx==comidax+13||posicionx==comidax-13
                                ||posicionx==comidax+14||posicionx==comidax-14
                                ||posicionx==comidax+15||posicionx==comidax-15
                                ||posicionx==comidax+16||posicionx==comidax-16
                                ||posicionx==comidax+17||posicionx==comidax-17
                                ||posicionx==comidax+18||posicionx==comidax-18
                                ||posicionx==comidax+19||posicionx==comidax-19
                                ||posicionx==comidax+20||posicionx==comidax-20
                                ||posicionx==comidax+21||posicionx==comidax-21
                                
                                )&&(posiciony==comiday||posiciony==comiday+1||posiciony==comiday-1
                                ||posiciony==comiday+1||posiciony==comiday-1
                                ||posiciony==comiday+2||posiciony==comiday-2
                                ||posiciony==comiday+3||posiciony==comiday-3
                                ||posiciony==comiday+4||posiciony==comiday-4
                                ||posiciony==comiday+5||posiciony==comiday-5
                                ||posiciony==comiday+6||posiciony==comiday-6
                                ||posiciony==comiday+7||posiciony==comiday-7
                                ||posiciony==comiday+8||posiciony==comiday-8
                                ||posiciony==comiday+9||posiciony==comiday-9
                                ||posiciony==comiday+10||posiciony==comiday-10
                                ||posiciony==comiday+11||posiciony==comiday-11
                                ||posiciony==comiday+12||posiciony==comiday-12
                                ||posiciony==comiday+13||posiciony==comiday-13
                                ||posiciony==comiday+14||posiciony==comiday-14
                                ||posiciony==comiday+15||posiciony==comiday-15
                                ||posiciony==comiday+16||posiciony==comiday-16
                                ||posiciony==comiday+17||posiciony==comiday-17
                                ||posiciony==comiday+18||posiciony==comiday-18
                                ||posiciony==comiday+19||posiciony==comiday-19
                                ||posiciony==comiday+20||posiciony==comiday-20
                                ||posiciony==comiday+21||posiciony==comiday-21)){
                            comida();
                            moverfantasma1();
                            moverfantasma2();
                            puntaje+=1;
                        }
                        if((posicionx==rival1x||posicionx==rival1x+1||posicionx==rival1x-1
                                 ||posicionx==rival1x+2||posicionx==rival1x-2
                                 ||posicionx==rival1x+3||posicionx==rival1x-3
                                 ||posicionx==rival1x+4||posicionx==rival1x-4
                                 ||posicionx==rival1x+5||posicionx==rival1x-5
                                 ||posicionx==rival1x+6||posicionx==rival1x-6
                                 )&&(posiciony==rival1y||posiciony==rival1y+1||posiciony==rival1y-1
                                 ||posiciony==rival1y+2||posiciony==rival1y-2
                                 ||posiciony==rival1y+3||posiciony==rival1y-3
                                 ||posiciony==rival1y+4||posiciony==rival1y-4
                                 ||posiciony==rival1y+5||posiciony==rival1y-5
                                 ||posiciony==rival1y+6||posiciony==rival1y-6)){
                             puntaje=0;
                             posicionx=((getWidth()-24)/2);
            posiciony=((getWidth()-24)/2);
            b=false;
             estado="End Game";
                         }
                         if((posicionx==rival2x||posicionx==rival2x+1||posicionx==rival2x-1
                                 ||posicionx==rival2x+2||posicionx==rival2x-2
                                 ||posicionx==rival2x+3||posicionx==rival2x-3
                                 ||posicionx==rival2x+4||posicionx==rival2x-4
                                 ||posicionx==rival2x+5||posicionx==rival2x-5
                                 ||posicionx==rival2x+6||posicionx==rival2x-6
                                 )&&(posiciony==rival2y||posiciony==rival2y+1||posiciony==rival1y-1
                                 ||posiciony==rival2y+2||posiciony==rival2y-2
                                 ||posiciony==rival2y+3||posiciony==rival2y-3
                                 ||posiciony==rival2y+4||posiciony==rival2y-4
                                 ||posiciony==rival2y+5||posiciony==rival2y-5
                                 ||posiciony==rival2y+6||posiciony==rival2y-6)){
                             puntaje=0;
                             posicionx=((getWidth()-24)/2);
            posiciony=((getWidth()-24)/2);
            b=false;
             estado="End Game";
                         }
                        }
                        break;
                        case 54:
                        if(posicionx<=getHeight()){
                            if(b==true){
                        posicionx++;
                            }
                         if((posicionx==comidax||posicionx==comidax+1||posicionx==comidax-1
                                ||posicionx==comidax+2||posicionx==comidax-2
                                ||posicionx==comidax+3||posicionx==comidax-3
                                ||posicionx==comidax+4||posicionx==comidax-4
                                ||posicionx==comidax+5||posicionx==comidax-5
                                ||posicionx==comidax+6||posicionx==comidax-6
                                ||posicionx==comidax+7||posicionx==comidax-7
                                ||posicionx==comidax+8||posicionx==comidax-8
                                ||posicionx==comidax+9||posicionx==comidax-9
                                ||posicionx==comidax+10||posicionx==comidax-10
                                ||posicionx==comidax+11||posicionx==comidax-11
                                ||posicionx==comidax+12||posicionx==comidax-12
                                ||posicionx==comidax+13||posicionx==comidax-13
                                ||posicionx==comidax+14||posicionx==comidax-14
                                ||posicionx==comidax+15||posicionx==comidax-15
                                ||posicionx==comidax+16||posicionx==comidax-16
                                ||posicionx==comidax+17||posicionx==comidax-17
                                ||posicionx==comidax+18||posicionx==comidax-18
                                ||posicionx==comidax+19||posicionx==comidax-19
                                ||posicionx==comidax+20||posicionx==comidax-20
                                ||posicionx==comidax+21||posicionx==comidax-21
                                
                                )&&(posiciony==comiday||posiciony==comiday+1||posiciony==comiday-1
                                ||posiciony==comiday+1||posiciony==comiday-1
                                ||posiciony==comiday+2||posiciony==comiday-2
                                ||posiciony==comiday+3||posiciony==comiday-3
                                ||posiciony==comiday+4||posiciony==comiday-4
                                ||posiciony==comiday+5||posiciony==comiday-5
                                ||posiciony==comiday+6||posiciony==comiday-6
                                ||posiciony==comiday+7||posiciony==comiday-7
                                ||posiciony==comiday+8||posiciony==comiday-8
                                ||posiciony==comiday+9||posiciony==comiday-9
                                ||posiciony==comiday+10||posiciony==comiday-10
                                ||posiciony==comiday+11||posiciony==comiday-11
                                ||posiciony==comiday+12||posiciony==comiday-12
                                ||posiciony==comiday+13||posiciony==comiday-13
                                ||posiciony==comiday+14||posiciony==comiday-14
                                ||posiciony==comiday+15||posiciony==comiday-15
                                ||posiciony==comiday+16||posiciony==comiday-16
                                ||posiciony==comiday+17||posiciony==comiday-17
                                ||posiciony==comiday+18||posiciony==comiday-18
                                ||posiciony==comiday+19||posiciony==comiday-19
                                ||posiciony==comiday+20||posiciony==comiday-20
                                ||posiciony==comiday+21||posiciony==comiday-21)){
                            comida();
                            moverfantasma1();
                            moverfantasma2();
                            puntaje+=1;
                        }
                         if((posicionx==rival1x||posicionx==rival1x+1||posicionx==rival1x-1
                                 ||posicionx==rival1x+2||posicionx==rival1x-2
                                 ||posicionx==rival1x+3||posicionx==rival1x-3
                                 ||posicionx==rival1x+4||posicionx==rival1x-4
                                 ||posicionx==rival1x+5||posicionx==rival1x-5
                                 ||posicionx==rival1x+6||posicionx==rival1x-6
                                 )&&(posiciony==rival1y||posiciony==rival1y+1||posiciony==rival1y-1
                                 ||posiciony==rival1y+2||posiciony==rival1y-2
                                 ||posiciony==rival1y+3||posiciony==rival1y-3
                                 ||posiciony==rival1y+4||posiciony==rival1y-4
                                 ||posiciony==rival1y+5||posiciony==rival1y-5
                                 ||posiciony==rival1y+6||posiciony==rival1y-6)){
                             puntaje=0;
                             posicionx=((getWidth()-24)/2);
            posiciony=((getWidth()-24)/2);
            b=false;
             estado="End Game";
                         }
                         if((posicionx==rival2x||posicionx==rival2x+1||posicionx==rival2x-1
                                 ||posicionx==rival2x+2||posicionx==rival2x-2
                                 ||posicionx==rival2x+3||posicionx==rival2x-3
                                 ||posicionx==rival2x+4||posicionx==rival2x-4
                                 ||posicionx==rival2x+5||posicionx==rival2x-5
                                 ||posicionx==rival2x+6||posicionx==rival2x-6
                                 )&&(posiciony==rival2y||posiciony==rival2y+1||posiciony==rival1y-1
                                 ||posiciony==rival2y+2||posiciony==rival2y-2
                                 ||posiciony==rival2y+3||posiciony==rival2y-3
                                 ||posiciony==rival2y+4||posiciony==rival2y-4
                                 ||posiciony==rival2y+5||posiciony==rival2y-5
                                 ||posiciony==rival2y+6||posiciony==rival2y-6)){
                            puntaje=0;
                            posicionx=((getWidth()-24)/2);
            posiciony=((getWidth()-24)/2);
            b=false;
             estado="End Game";
                         }
                        }
                        break;
                        
                }
                if(puntaje<=9){
               
                Thread.sleep(12);
                }
                if(puntaje>=10&&puntaje<=19){
                Thread.sleep(10);
                }
                if(puntaje>=20&&puntaje<=49){
                Thread.sleep(8);
                }
                if(puntaje>=50&&puntaje<=79){
                Thread.sleep(4);
                }
                if(puntaje>=80){
                    Thread.sleep(2);
                }
                
                
                repaint();
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        
               
    }
       
    }
    
}
