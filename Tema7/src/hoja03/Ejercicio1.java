package hoja03;

import java.awt.BorderLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JToolBar;

public class Ejercicio1 extends JFrame {

	public Ejercicio1() {

		super("Planificador personal");
		setSize(400, 200);
		setLayout(new BorderLayout());
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		JButton btnNuevo = new JButton(new ImageIcon("iconos/1.png"));
		JButton btnNivel = new JButton(new ImageIcon("iconos/11.png"));
		JButton btnGuardar = new JButton(new ImageIcon("iconos/22.png"));
		JButton btnBombilla = new JButton(new ImageIcon("iconos/3.png"));
		JButton btnCalendario = new JButton(new ImageIcon("iconos/44.png"));
		JButton btnFoto = new JButton(new ImageIcon("iconos/66.png"));
		JButton btnTele = new JButton(new ImageIcon("iconos/67.png"));
		JButton btnConfiguracion = new JButton(new ImageIcon("iconos/73.png"));

		JToolBar tlbPlanificador = new JToolBar();
		tlbPlanificador.add(btnNuevo);
		tlbPlanificador.add(btnNivel);
		tlbPlanificador.add(btnGuardar);
		tlbPlanificador.add(btnBombilla);
		tlbPlanificador.addSeparator();

		tlbPlanificador.add(btnCalendario);
		tlbPlanificador.add(btnFoto);
		tlbPlanificador.add(btnTele);
		tlbPlanificador.addSeparator();

		tlbPlanificador.add(btnConfiguracion);

		add(tlbPlanificador, BorderLayout.NORTH);

		setVisible(true);
	}

	public static void main(String[] args) {
		new Ejercicio1();

	}

}
