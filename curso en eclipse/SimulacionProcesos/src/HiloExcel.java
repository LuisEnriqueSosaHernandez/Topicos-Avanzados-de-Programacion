import java.awt.Color;

import javax.swing.JProgressBar;

public class HiloExcel implements Runnable{
	JProgressBar barExcel;
	int i;
	public static boolean finalizado=false;
public HiloExcel(JProgressBar barExcel){
	this.barExcel=barExcel;
}
	@Override
	public void run() {
		for(i=0;i<=100;i++){
			if(finalizado){
				break;
			}
			barExcel.setValue(i);
			System.out.println("Proceso "+Thread.currentThread().getName() +" ejecutandose");
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
		finalizado=false;
		barExcel.setForeground(Color.RED);
		System.out.println("Proceso "+Thread.currentThread().getName() +" finalizado");
	}

}
