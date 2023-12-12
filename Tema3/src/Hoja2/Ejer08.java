package Hoja2;

public class Ejer08 {

	public static void main(String[] args) {
		int[] humedad = {45,40,40,40,37,35,39,39,
						 45,50,55,60,65,70,70,75,
						 75,72,65,60,55,50,50,45};
		int posMin=0;
		int posMax=0;
		
		for(int i=1;i<humedad.length;i++) {
			
			if(humedad[i] < humedad[posMin]) {
				posMin = i;
			}else if(humedad[i] > humedad[posMax]) {
				posMax=i;
			}
			
		}
		

		System.out.println("La humedad mímina ha sido a las " + posMin+
				":00h con un " + humedad[posMin] + "%.");
		System.out.println("La humedad máxima ha sido a las " + posMax+
				":00h con un " + humedad[posMax] + "%.");
	
	}
}
