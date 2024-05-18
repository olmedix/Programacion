package ejemplosSets;

import java.util.Objects;

public class Mascota {

	private int id;
	private String nombre;
	private String especie;

	public Mascota(int id, String nombre, String especie) {
		this.id = id;
		this.nombre = nombre;
		this.especie = especie;
	}


	@Override
	public int hashCode() {
		return Objects.hash(especie, id, nombre);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		
		Mascota mascotas = (Mascota) obj;
		if(id == mascotas.id && nombre.equals(mascotas.nombre) && especie.equals(mascotas.especie)) {
			return true;
		}
		return false;
	}
	

	public String toString() {
		return nombre + " " + especie + " " + "( " + id + ")";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}

}
