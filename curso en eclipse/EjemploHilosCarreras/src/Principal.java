
public class Principal {
public static void main(String[]args){
	Liebre HiloLiebre=new Liebre();
	Tortuga HiloTortuga=new Tortuga();
	Thread HT=new Thread(HiloTortuga);
	Guepardo HiloGuepardo=new Guepardo();
	
	System.out.println("Comienza la Carrera");
	HiloLiebre.start();
	HT.start();
	HiloGuepardo.start();
	
	
	
}
}
