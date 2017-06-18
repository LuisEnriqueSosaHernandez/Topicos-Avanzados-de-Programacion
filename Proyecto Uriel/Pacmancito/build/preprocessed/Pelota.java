/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import javax.microedition.lcdui.Canvas;
import javax.microedition.lcdui.Graphics;

/**
 *
 * @author Uriel
 */
public class Pelota extends Canvas implements Runnable{
private int iX;
private int iY;
private int largo;
private int ancho;
private int tiempo;


public Pelota(){
largo=this.getWidth();
ancho=this.getHeight();
iX=largo/2;
iY=ancho/2;
tiempo=50;
}
public void run(){
int incX =5;
int incY=3;
for(;;){
iX+=incX;
iY+=incY;
if(iX>largo || iX<0){
 incX*=-1;
}
if(iY>ancho || iY<0){
    incY*=-1;
}
repaint();
try{
  Thread.sleep(tiempo);
}catch(InterruptedException e){
   System.exit(0);
  }
}
}
protected void paint (Graphics g){
g.setColor(255,255,255);
g.fillRect(0,0,largo,ancho);
g.setColor(0,0,255);
g.fillArc(iX, iY,10,10,0,360);
}
public int getTiempo(){
return tiempo;
}
public void setTiempo(int tiempo){
 this.tiempo=tiempo;
}
public void KeyPressed(int KeyCode){
 int tecla = this.getGameAction(KeyCode);
 System.out.println("tecla ="+tecla);
 if(tecla ==Canvas.LEFT){
  tiempo= Math.min(200,tiempo+5);
 }else if(tecla == Canvas.RIGHT){
 tiempo = Math.max(10,tiempo-5);
 }
}
}
