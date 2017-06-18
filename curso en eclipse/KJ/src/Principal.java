import java.util.ArrayList;
import java.util.List;


public class Principal {

	public static void main(String[] args) {
		List<String>dinero=new ArrayList<String>();
		Saldo sal=new Saldo();
		Thread hsal=new Thread(sal);
		Retirar ret=new Retirar(dinero);
		Depositar dep=new Depositar(dinero);
		Thread cliente1=new Thread(ret,"Juan");
		Thread cliente2=new Thread(ret,"Jose");
		Thread cliente3=new Thread(ret,"Javier");
		Thread cliente4=new Thread(ret,"Jorge");
		Thread cliente5=new Thread(ret,"Jonas");
		Thread cliente6=new Thread(ret,"El ultimo");
		Thread cajero=new Thread(dep,"Cajerito Patito S.A de C.V");
		hsal.start();
		cliente1.start();
		cliente2.start();
		cliente3.start();
		cliente4.start();
		cliente5.start();
		cajero.start();
		cliente6.start();
	}

}
