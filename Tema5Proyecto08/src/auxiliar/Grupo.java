package auxiliar;

import java.util.Scanner;

public class Grupo {

	private int id;
	private String nivel;
	private int curso;
	private String clase;

	public Grupo() {

	}

	public Grupo(int id, String nivel, int curso, String clase) {
		this.id = id;
		this.nivel = nivel;
		this.curso = curso;
		this.clase = clase;
	}

	public String toString() {
		return "Id: " + id + ", nivel: " + nivel + ", curso: " + curso + ", clase: " + clase;
	}

	public void leeDatos() {
		Scanner entrada = new Scanner(System.in);

		System.out.print("Escribe el id: ");
		id = entrada.nextInt();

		System.out.print("Escribe el nivel: ");
		nivel = entrada.nextLine();

		entrada.nextLine();

		System.out.print("Escribe el curso: ");
		curso = entrada.nextInt();
		
		entrada.nextLine();

		System.out.print("Escribe la clase: ");
		clase = entrada.nextLine();
	}
}
