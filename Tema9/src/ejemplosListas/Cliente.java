package ejemplosListas;

public class Cliente {

	private String apellidos;
	private String nombre;
	private String dni;
	
	public Cliente(String apellidos, String nombre, String dni) {
		this.apellidos = apellidos;
		this.nombre = nombre;
		this.dni = dni;
	}
	
	@Override
	public String toString() {
		return nombre + " " + apellidos;
	}
	
	private String getDni() {
		return dni;
	}
	
	private String getNombre() {
		
		return nombre;
	}

	private String getApellidos() {
		
		return apellidos;
	}
	

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			System.out.println("los objetos son iguales");
			return true;
		}
		if (obj == null) {
			System.out.println("el objeto es null");
			return false;
		}
		if (getClass() != obj.getClass()) {
			System.out.println("el objeto no es de la misma clase ");
			return false;
		}
		Cliente cliente = (Cliente) obj;

		if(dni.equals(cliente.getDni()) && apellidos.equals(cliente.getApellidos()) && nombre.equals(cliente.getNombre())){
			return true ;
		}
		return false ;
	}




	
	
	
	
}
