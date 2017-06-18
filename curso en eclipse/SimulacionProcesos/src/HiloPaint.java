import java.awt.Color;

import javax.swing.JProgressBar;

public class HiloPaint implements Runnable {
	JProgressBar barPaint;
	int i;
	public static boolean finalizado=false;
public HiloPaint(JProgressBar barPaint){
	this.barPaint=barPaint;
}
	@Override
	public void run() {
		for(i=0;i<=100;i++){
			if(finalizado){
				break;
			}
			barPaint.setValue(i);
			System.out.println("Proceso "+Thread.currentThread().getName() +" ejecutandose");
			try {
				Thread.sleep(90);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
		finalizado=false;
		barPaint.setForeground(Color.RED);
		System.out.println("Proceso "+Thread.currentThread().getName() +" finalizado");
	}

}
