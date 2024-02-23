package cadenas;

public class Ejer07 {

	public static void main(String[] args) {

		String frase = "Volvía a casa de noche y fui asaltado por un "
				+ "mendrugo.";

		String[] palabrotas = { "sinvergüenza", "maleducado", 
				"analfabeto", "bribón", "mendrugo" };

		boolean textoLimpio = true;

		for (int i = 0; i < palabrotas.length; i++) {

			if (frase.indexOf(palabrotas[i]) != -1) {
				textoLimpio = false;
				break;
			}

		}

		if (textoLimpio) {
			System.out.println("Tu frase está limpia");
		} else {
			System.out.println("Ha escrito una palabrota");
		}

	}

}