
public class Principal {

	public static void main(String[] args) {
		HilosRunnable miHilo=new HilosRunnable();
	    Thread proceso1=new Thread(miHilo,"Word");
	    proceso1.start();
	    Thread proceso2=new Thread(miHilo,"Excel");
	    proceso2.start();
	    Thread proceso3=new Thread(miHilo,"Power Point");
	    proceso3.start();
	    Thread proceso4=new Thread(miHilo,"Paint");
	    proceso4.start();
	    Thread proceso5=new Thread(miHilo,"Sudoku");
	    proceso5.start();
	}

}
