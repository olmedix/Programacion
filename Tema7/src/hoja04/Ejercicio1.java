package hoja04;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Ejercicio1 extends JFrame {
	
	public Ejercicio1() {
		
		super("Fotogramas");
		setSize(700,600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout( new BorderLayout());
		
		JButton btnBlackRain = new JButton("Black rain");
		JButton btnCasoWinslow = new JButton("El caso Winslow");
		JButton btnAsaltoDistrito13 = new JButton("Asalto al distrito 13");
		JButton btnBladeRunner = new JButton("Blade runner");
		
		JPanel panelSuperior = new JPanel();
		panelSuperior.setLayout(new FlowLayout());
		
		panelSuperior.add(btnBlackRain);
		panelSuperior.add(btnCasoWinslow);
		panelSuperior.add(btnAsaltoDistrito13);
		panelSuperior.add(btnBladeRunner);
		
		
		
		
		
		add(panelSuperior,BorderLayout.NORTH);
		
		
		setVisible(true);
		
	}

	public static void main(String[] args) {
		
		new Ejercicio1();

	}

}
