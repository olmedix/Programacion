package fechas;

import java.time.LocalDateTime;

public class Ejemplo02 {

	public static void main(String[] args) {
		
		// INSTANTES DE TIEMPO
		
		LocalDateTime instante1 = LocalDateTime.parse("2024-05-22T17:10:00");
		System.out.println(instante1);
		
		LocalDateTime instante2 = LocalDateTime.of(2024, 5,22,17,10,00);
		System.out.println(instante2);
		
		LocalDateTime instante3 = LocalDateTime.now();
		System.out.println(instante3);

	}

}
