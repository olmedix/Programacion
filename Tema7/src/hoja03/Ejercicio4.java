package hoja03;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class Ejercicio4 extends JFrame {

	public Ejercicio4() {

		super("Asistente matemático");
		setSize(300, 200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new BorderLayout());

		// Creación de menú Aritmética y sus items.
		JMenu menuAritmética = new JMenu("Aritmética");
		JMenuItem itemSuma = new JMenuItem("Suma");
		JMenuItem itemResta = new JMenuItem("Resta");
		JMenuItem itemMultiplicacion = new JMenuItem("Multiplicación");
		JMenuItem itemDivision = new JMenuItem("División");
		JMenuItem itemPorcentaje = new JMenuItem("Porcentaje");

		// Items del menu aritmética agregados
		menuAritmética.add(itemSuma);
		menuAritmética.add(itemResta);
		menuAritmética.addSeparator();
		menuAritmética.add(itemMultiplicacion);
		menuAritmética.add(itemDivision);
		menuAritmética.addSeparator();
		menuAritmética.add(itemPorcentaje);

		// Creación de menú Calculo y sus items.
		JMenu menuCalculo = new JMenu("Cálculo");
		JMenuItem itemDerivada = new JMenuItem("Derivada");
		JMenuItem itemIntegral = new JMenuItem("Integral");
		JMenuItem itemPolinomio = new JMenuItem("Polinomio de Taylor");
		JMenuItem itemEcuacion = new JMenuItem("Ecuación diferencial");

		// Items del menu cálculo agregados
		menuCalculo.add(itemDerivada);
		menuCalculo.add(itemIntegral);
		menuCalculo.addSeparator();
		menuCalculo.add(itemPolinomio);
		menuCalculo.add(itemEcuacion);

		// Creación de la barra de menú.
		JMenuBar menu = new JMenuBar();
		menu.add(menuAritmética);
		menu.add(menuCalculo);

		add(menu, BorderLayout.NORTH);

		setVisible(true);
	}

	public static void main(String[] args) {
		new Ejercicio4();

	}

}
