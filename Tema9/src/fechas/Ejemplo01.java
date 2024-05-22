package fechas;

import java.time.LocalDate;
import java.time.LocalTime;

public class Ejemplo01 {

	public static void main(String[] args) {
		
		// FECHAS 
		
		LocalDate fecha1 = LocalDate.parse("2024-05-20");
		System.out.println(fecha1);
		
		LocalDate fecha2 = LocalDate.of(2024, 5, 20);
		System.out.println(fecha2);
		
		LocalDate fecha3 = LocalDate.now();
		System.out.println(fecha3);;

		// HORAS
		
		LocalTime tiempo1 = LocalTime.parse("15:05:00");
		System.out.println(tiempo1);
		
		LocalTime tiempo2 = LocalTime.of(15, 5,0);
		System.out.println(tiempo2);
		
		LocalTime tiempo3 = LocalTime.now();
		System.out.println(tiempo3);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
