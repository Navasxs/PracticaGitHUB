package Calculadora;

/**
 * @author Jesus Navascues
 * @version 1.0
 * 
 */

public class Calculadora {

	
	double op1;
	double op2;
	
	
	/**
	 * @param op1 primer operando de la calculadora
	 * @param op2 segundo operando de la calculadora
	 */
	public Calculadora(double op1, double op2) {
		this.op1 = op1;
		this.op2 = op2;
	}
	
	/**
	 * @return devuelve la suma de op1 y op2
	 */
	double suma() {
		return op1+op2;
	}
	
	/**
	 * @return devuelve la resta de op1 y op2
	 */
	double resta() {
		return op1-op2;
	}
	
	/**
	 * @return devuelve la division de op1 y op2
	 * @throws IllegalArgumentException ningun numero puede ser dividido por 0
	 */
	double division() {
		if(op2==0) {
			throw new IllegalArgumentException("El divisor es 0");
		}
		return op1/op2;
	}
	
	//TODO: A�adir la operaci�n potencia, que devuelve
	//op1 elevado a op2 con las siguientes reglas: 
	//-Por convenio cualquier n�mero elevado a 0 es igual a 1.
	//-Un n�mero "n" elevado a una potencia negativa "-p" es igual a 1/(n^p)
	//As� 232^0 = 1; y 2^(-3)=1/2^3=1/8
	
	/**
	 * @return devuelve op1 elevado a op2
	 */
	double potencia() {
		if(op2==0) {
			return 1;
		}
		if(op2<0) {
			return (1/(Math.pow(op1,op2)));
		}
		else {
			return Math.pow(op1,op2);
		}
	}

		
	
	//TODO: A�adir la operacion toString que devuelva los operandos
	//la cadena:
	//"Calculadora de <vuestroNombre>: "
	//"operando1 = <op1>"
	//"operando2 = <op2>"
	

	@Override
	public String toString() {
		return "Calculadora de JesusNavascues [op1=" + op1 + ", op2=" + op2 + "]";
	}
	
}
