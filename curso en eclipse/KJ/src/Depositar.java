import java.util.List;

public class Depositar implements Runnable {
	List<String>dinero;
	public Depositar(List<String>dinero){
		this.dinero=dinero;
	}
public void run(){
	while(true){
		try {
			Thread.sleep(2000);
			synchronized (dinero) {
				SuperClase.saldo=SuperClase.saldo+100;
				dinero.notify();
				System.out.println("En estos momentos se depositaron $100");
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
}
