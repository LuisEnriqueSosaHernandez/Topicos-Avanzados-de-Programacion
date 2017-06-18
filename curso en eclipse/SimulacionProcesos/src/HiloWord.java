import java.awt.Color;

import javax.swing.JProgressBar;

public class HiloWord implements Runnable{
	JProgressBar barWord;
	int i;
	public static boolean finalizado=false;
public HiloWord(JProgressBar barWord){
	this.barWord=barWord;
}
	@Override
	public void run() {
		for(i=0;i<=100;i++){
			if(finalizado){
				break;
			}
			barWord.setValue(i);
			System.out.println("Proceso "+Thread.currentThread().getName() +" ejecutandose");
			try {
				Thread.sleep(80);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
		finalizado=false;
		barWord.setForeground(Color.RED);
		System.out.println("Proceso "+Thread.currentThread().getName() +" finalizado");
	}

}
