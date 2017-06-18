
public class THilo extends Thread {
	//metodo run encargado de realizar las acciones
private String proceso="";
private long ms=0;
	public void run(){
	try {
		ms=(long)(Math.random()*5)*1000;
		Thread.sleep(ms);
	} catch (InterruptedException e) {
		System.out.println("Error de ejecucion");
		e.printStackTrace();
	}
	System.out.println("Proceso "+proceso+" Finalizado en "+ms+" Milisegundos");
}
//Constructor
public THilo(String proceso){
	this.proceso=proceso;
}
}
