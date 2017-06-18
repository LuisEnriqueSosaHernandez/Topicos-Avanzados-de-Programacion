import javax.swing.JOptionPane;

public class Operaciones {
	
	public static void main(String[]args){
		double num1=0.0,num2=0.0;
		try{
		num1=Double.parseDouble(JOptionPane.showInputDialog(null,"Ingrese el primer numero: ","Operaciones basicas",JOptionPane.INFORMATION_MESSAGE));
		num2=Double.parseDouble(JOptionPane.showInputDialog(null,"Ingrese el segundo numero: ","Operaciones basicas",JOptionPane.INFORMATION_MESSAGE));
	    /*JOptionPane.showMessageDialog(null, "El resultado de la suma de: "+num1+" + "+num2+" es: "+(num1+num2));
	    JOptionPane.showMessageDialog(null, "El resultado de la resta de: "+num1+" - "+num2+" es: "+(num1-num2));
	    JOptionPane.showMessageDialog(null, "El resultado de la multiplicacion de: "+num1+" * "+num2+" es: "+(num1*num2));
	    JOptionPane.showMessageDialog(null, "El resultado de la division de: "+num1+" /"+ " "+num2+" es: "+(num1/num2));*/
		JOptionPane.showMessageDialog(null, "El resultado de la suma de: "+num1+" + "+num2+" es: "+Logica.sumar(num1,num2));
	    JOptionPane.showMessageDialog(null, "El resultado de la resta de: "+num1+" - "+num2+" es: "+Logica.restar(num1,num2));
	    JOptionPane.showMessageDialog(null, "El resultado de la multiplicacion de: "+num1+" * "+num2+" es: "+Logica.multiplicar(num1,num2));
	    JOptionPane.showMessageDialog(null, "El resultado de la division de: "+num1+" /"+ " "+num2+" es: "+Logica.dividir(num1,num2));
		}catch(Exception e){
			JOptionPane.showMessageDialog(null,"Error de datos");
		}
	
	}

}
