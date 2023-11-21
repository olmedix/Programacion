import java.util.Scanner;

public class Ejemplo11 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		/*
		 * OPERADORES TERNARIOS
		 * 
		 * if(condición){ variable = valor1; }else { variable = valor2; }
		 * 
		 * variable = condicion? valor1 :valor2;
		 */
		float temp=entrada.nextFloat();
		 String diagnostico="";
		 
		diagnostico = temp <=36.5 ? "Estás sano como una manzana" : "Tienes fiebre";
		
		System.out.println("Diagnóstico: " + diagnostico);
	}

}
