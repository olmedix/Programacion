package biblioteca;

public class Libro {

	private String titulo;
	private String isbn;
	private Autor[] autores;
	private static int anyoActual;

	public Libro(String titulo) {
		this.titulo = titulo;
	}

	public Libro(String titulo, String isbn, Autor[] autores) {

		this.titulo = titulo;
		this.isbn = isbn;
		this.autores = autores;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public Autor[] getAutores() {
		return autores;
	}

	public void setAutores(Autor[] autores) {
		this.autores = autores;
	}

	public int getAnyoActual() {
		return anyoActual;
	}

	public static void setAnyoActual(int anyoActual) {
		// anyoActual es estático y vale lo mismo en cualquier objeto Libro.
		// Si usamos this.anyoActual daría la impresión de que podemos modificar
		// el atributo de forma distinta para objetos distintos.
		// Por eso, usamos el nombre de la clase: Libro.anyoActual
		Libro.anyoActual = anyoActual;
	}

	public String toString() {

		if (autores.length == 1) {
			return "Título: " + titulo + ", isbn: " + isbn + ", autor: " + autores[0].getNombre() + ", año: "
					+ anyoActual;
		}

		return "Título: " + titulo + ", isbn: " + isbn + ", autor: Varios autores" + ", año: " + anyoActual;
	}

	public String muestraAutores() {
		System.out.println("\n***** NOMBRES DE AUTORES *****\n");
		
		String muestraAuto="";
		
		for (int i = 0; i < autores.length; i++) {
			
			if(autores[i] != null) {
				muestraAuto = muestraAuto + " - " + autores[i].getNombre() + "\n";
			}
		}
		
		return muestraAuto;

	}
	
	
}
