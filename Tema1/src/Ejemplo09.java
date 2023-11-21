
public class Ejemplo09 {

	public static void main(String[] args) {
		
		//Constantes: no pueden cambiar de valor una vez que han sido inicializadas.
		
		final float PI= 3.1416F;
		final boolean APTO = false;	
		boolean otraVariable = !APTO;
		final String SALUDO = "Estimado Sr/a: ";
		final float GRAVEDAD_TIERRA = 9.8F;
		final double TEMPERATURA_DESEADA_CAMARA = -20;
		
		System.out.println("Temperatura deseada es:" + TEMPERATURA_DESEADA_CAMARA + " °C.");
		
		System.out.println(SALUDO + " gracias por comprar nuesto termómetro.\n"
				+ "le recordamos que la temperatura ideal es " + TEMPERATURA_DESEADA_CAMARA
				 + " °C.");
	}

}
