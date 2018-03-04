package Calculadora;

public class Programa {
	
	//TODO: Crear un programa principal que 
	//utilice todas las funciones de la calculadora
	//Incluida las operaciones toString y la potencia
	//que habr�is a�adido.
	//Ejecutadlo.
	
	public static void main(String[] args) {
		Calculadora c1= new Calculadora(6,3);
		Calculadora c2= new Calculadora(6,0);
		Calculadora c3= new Calculadora(6,-3);
		
		System.out.println(c1);
		System.out.println("suma de los operandos:"+ c1.suma());
		System.out.println("resta de los operandos:"+ c1.resta());
		System.out.println("division de los operandos:"+ c1.division());
		System.out.println("potencia de los operandos:" + c1.potencia());
		System.out.println(c3+ "comprobacion de la potencia negativa:");
		System.out.println("potencia de los operandos:" + c3.potencia());
		System.out.println(c2 + "comprobacion de la division y la potencia entre 0:");
		System.out.println("potencia de los operandos:" + c2.potencia());
		System.out.println("division de los operandos:"+ c2.division());
		
	}
}
