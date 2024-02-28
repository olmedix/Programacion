
public class Camion {

	private int numPaquetes;
	private Paquete[] paquetes;

	public Camion(int capacidad) {
		numPaquetes = 0;
		paquetes = new Paquete[capacidad];
	}

	public void addPaquete(Paquete paquete) {

		if (numPaquetes < paquetes.length) {
			paquetes[numPaquetes] = paquete;
			numPaquetes++;
		}
	}

	public void showPaquetes() {

		System.out.println("Carga del camión");

		for (int i = 0; i < numPaquetes; i++) {
			System.out.println(paquetes[i].toString());
		}
	}

	public int searchPaquetes(int codPaquete) {

		for (int i = 0; i < numPaquetes; i++) {

			if (paquetes[i].getCodigoPaquete() == codPaquete) {
				return i;
			}
		}

		return -1;
	}

	public void delPaquete(int codPaquete) {

		int pos = searchPaquetes(codPaquete);

		if (pos != -1) {

			for (int i = pos; i < numPaquetes; i++) {
				paquetes[i] = paquetes[i + 1];
			}

			numPaquetes--;
		}

	}

	public void showPaquetes(String ciudad) {
		System.out.println("Paquetes destinados a " + ciudad + ":");

		for (int i = 0; i < numPaquetes; i++) {

			if (paquetes[i].getDireccion().getCiudad().equals(ciudad)) {
				System.out.println(paquetes[i].toString());
			}

		}
	}

}
