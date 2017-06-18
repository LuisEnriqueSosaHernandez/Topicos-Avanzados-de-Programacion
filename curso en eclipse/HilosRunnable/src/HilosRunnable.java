
public class HilosRunnable implements Runnable{
private long ms=0;
	//@Override
	public void run() {
		
		try {
			ms=(long)(Math.random()*5)*1000;
			Thread.sleep(ms);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Proceso "+Thread.currentThread().getName()+" Finalizado en: "+ms);
	}

}
