package Hoja1;

public class Ejer01 {

	public static void main(String[] args) {
	//Crea un array de Strings llamado estaciones cuyos valores sean los nombres de las cuatro
	//estaciones del año. Haz que después se muestren todos los valores mediante un bucle for.
		
		String[] estaciones = {"Verano","Primavera","Otoño","Invierno"};
		
		for(int i=0;i<estaciones.length;i++) {
			System.out.println("Estacion: " + estaciones[i]);
		}
	}

}
