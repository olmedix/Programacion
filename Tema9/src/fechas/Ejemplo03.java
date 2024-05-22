package fechas;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Ejemplo03 {

	public static void main(String[] args) {
		
		// Comparaciones de fechas.
		
		LocalDate fecha1 = LocalDate.parse("2024-01-01");
		LocalDate fecha2 = LocalDate.parse("2023-01-01");
		
		System.out.println("¿fecha1 es posterior a fecha2? " + fecha1.isAfter(fecha2));
		
		// Comparaciones de horas.
		
		LocalTime tiempo1 = LocalTime.parse("15:10:00");
		LocalTime tiempo2 = LocalTime.parse("15:55");
		
		System.out.println("¿tiempo1 es anterior a tiempo2? " + tiempo1.isBefore(tiempo2));
		
		// Comparaciones de instantes (fecha y hora juntas).
		LocalDateTime instante2 = LocalDateTime.of(fecha1,tiempo2);
		LocalDateTime instante1 = LocalDateTime.parse("2024-05-22T17:34:00");
		
		System.out.println("¿Instante1 es anterior a instante2? " + instante1.isBefore(instante2));
	}

}
