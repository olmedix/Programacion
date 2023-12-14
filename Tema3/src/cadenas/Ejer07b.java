package cadenas;

// Variación en que modificamos la frase sustituyendo las palabrotas por 
// asteriscos.

public class Ejer07b {

	public static void main(String[] args) {

		String frase = "Volvía a casa de noche y fui asaltado por un " 
		+ "mendrugo.";

		String[] palabrotas = { "sinvergüenza", "maleducado", 
				"analfabeto", "bribón", "mendrugo" };

		boolean textoLimpio = true;

		for (int i = 0; i < palabrotas.length; i++) {

			if (frase.indexOf(palabrotas[i]) != -1) {
				textoLimpio = false;
				frase = frase.replace(palabrotas[i], "***");
			}

		}

		if (textoLimpio) {
			System.out.println("Tu frase está limpia");
		} else {
			System.out.println("Ha escrito palabrotas");
		}
		
		System.out.println("Su frase, censurada: \n" + frase);
		
		
		
		

	}

}