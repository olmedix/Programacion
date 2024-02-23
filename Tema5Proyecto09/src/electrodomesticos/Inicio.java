package electrodomesticos;

public class Inicio {

	public static void main(String[] args) {

		Motor motor1 = new Motor(1, "Mitsubishi", "V3");
		Motor motor2 = new Motor(2, "Samsung", "A1");

		Lavadora lavadora1 = new Lavadora(201, motor1, "Balay", 450);
		Lavadora lavadora2 = new Lavadora(202, motor2, "S23 Ultra", 900);

		Taller taller1 = new Taller();

		
		taller1.addLavadora(lavadora2);
		taller1.addLavadora(lavadora1);
		taller1.addLavadora(lavadora2);
		taller1.addLavadora(lavadora1);

		

		taller1.borrarLavadora(202);

		System.out.println("la lavadora con id 202 está en la posición " + taller1.buscaLavadora(201));

		System.out.println(lavadora1.toString());
		
		taller1.listaLavadoras();
		
		
	}

}
