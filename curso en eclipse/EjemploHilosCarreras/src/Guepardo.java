
public class Guepardo extends Thread{
	public void run(){
		int i=0;
		long ms=0;
		System.out.println("Comienza el Guepardo");
		while(i<5){
			try {
				ms=(long)(Math.random()*5+1)*1000;
				Thread.sleep(ms);
				System.out.println("Guepardo Corriendo a "+ms+" Metros x segundo");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			i++;
		}
		System.out.println("Termina el Guepardo");
	}
}
