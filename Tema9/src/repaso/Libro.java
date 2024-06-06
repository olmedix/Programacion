
public class Libro {
	
	private int id;
	private String titulo;
	private String autor;
	private float precio;
	private int unidades;
	
	
	
	public Libro(int id, String titulo, String autor, float precio, int unidades) {
		this.id = id;
		this.titulo = titulo;
		this.autor = autor;
		this.precio = precio;
		this.unidades = unidades;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public float getPrecio() {
		return precio;
	}
	public void setPrecio(float precio) {
		this.precio = precio;
	}
	public int getUnidades() {
		return unidades;
	}
	public void setUnidades(int unidades) {
		this.unidades = unidades;
	}
	
	

}
