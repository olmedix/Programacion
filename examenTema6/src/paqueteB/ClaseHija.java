package paqueteB;

import paqueteA.ClasePadre;

public class ClaseHija extends ClasePadre {
	// Constructor
	public ClaseHija(int valor) {
		super(valor);
	}

	public void mostrarAtributoProtegido() {
		System.out.println("El valor del atributo protegido es: " + this.atributoProtegido);
	}
}
