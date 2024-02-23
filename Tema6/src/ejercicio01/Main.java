package ejercicio01;

public class Main {

	public static void main(String[] args) {

		// Medio me1 = new Medio();
		Mp3 mp1 = new Mp3("La madre de José", 2.35, "ECDL", "Pop", 1);
		Ogg o1 = new Ogg("La raja de tu falda", 3.20, "Estopa", "Rock", 1);
		
		Medio m1 = mp1;
		
		m1.reproducir();
		
		((Mp3) m1).guardar();
			
		
		Guardable g1 =o1;
		
		System.out.println(g1.guardar());
		
	}

}
