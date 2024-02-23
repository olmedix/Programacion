package inicio;

import auxiliar.Alumno;
import auxiliar.Grupo;
import instituto.Instituto;

public class Inicio {

	public static void main(String[] args) {

		Grupo grupo1 = new Grupo(12, "ESO", 3, "B");
////		grupo1.leeDatos();
//
//		System.out.println(grupo1.toString());
//
//		Grupo grupo2 = new Grupo();
//
//		// Creamos un objeto ALumno pasándole los datos al constructor.
//		Alumno alumno1 = new Alumno(100, "Pérez", "Luis", grupo1);
//		System.out.println(alumno1.toString());
//
//		Alumno alumno2 = new Alumno();
//		alumno2.leeDatos();
//		
//		System.out.println(alumno2.toString());

		Alumno alu1 = new Alumno(1, "Martínez", "Oscar", grupo1);
		Alumno alu2 = new Alumno(2, "García", "Laura", grupo1);
		Alumno alu3 = new Alumno(3, "Pérez", "Mario", grupo1);

		Instituto instituto = new Instituto();

		instituto.addAlumno(alu2);
		instituto.addAlumno(alu3);
		instituto.addAlumno(alu1);                                                   

		instituto.muestraAlumnos();

		instituto.delAlumno(2);

		instituto.muestraAlumnos();

		System.out.println("Número total de alumnos: " + instituto.numAlumnos());

		System.out.println("\nEl alumno 3 está en la posición " + instituto.buscaAlumno(3));

	}

}
