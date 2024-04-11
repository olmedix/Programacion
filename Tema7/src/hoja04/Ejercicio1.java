package hoja04;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Ejercicio1 extends JFrame implements ActionListener{
	
	private JButton btnBlackRain;
	private JButton btnCasoWinslow; 
	private JButton btnAsaltoDistrito13 ;
	private JButton btnBladeRunner ;
	private JLabel lblIMagen ;
	
	
	public Ejercicio1() {

		super("Fotogramas");
		setSize(700, 800);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new BorderLayout());

		// botones de arriba del panel
		btnBlackRain = new JButton("Black rain");
		btnBlackRain.addActionListener(this);
		
		btnCasoWinslow = new JButton("El caso Winslow");
		btnCasoWinslow.addActionListener(this);
		
		btnAsaltoDistrito13 = new JButton("Asalto al distrito 13");
		btnAsaltoDistrito13.addActionListener(this);
		
		btnBladeRunner = new JButton("Blade runner");
		btnBladeRunner.addActionListener(this);

		// Creamos el panel superior
		JPanel panelSuperior = new JPanel();
		panelSuperior.setLayout(new FlowLayout());

		// Creamos el label para la imagen central.
		lblIMagen = new JLabel();
		lblIMagen.setIcon(new ImageIcon("imgsProgram/Black Rain.png"));

		// Creamos el panel central
		JPanel panelCentral = new JPanel();
		panelCentral.setLayout(new FlowLayout());
		
		panelCentral.add(lblIMagen);

		panelSuperior.add(btnBlackRain);
		panelSuperior.add(btnCasoWinslow);
		panelSuperior.add(btnAsaltoDistrito13);
		panelSuperior.add(btnBladeRunner);

		add(panelSuperior, BorderLayout.NORTH);
		add(panelCentral, BorderLayout.CENTER);

		setVisible(true);

	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		
	 JButton btnOpcion = (JButton) arg0.getSource();
	 
	 if(btnOpcion == btnBlackRain) {
		 lblIMagen.setIcon(new ImageIcon("imgsProgram/Black Rain.png"));
	 }else if(btnOpcion == btnAsaltoDistrito13) {
		 lblIMagen.setIcon(new ImageIcon("imgsProgram/Asalto al distrito.png"));
	 }else if(btnOpcion == btnBladeRunner) {
		 lblIMagen.setIcon(new ImageIcon("imgsProgram/Blade Runner.png"));
	 }else if(btnOpcion == btnCasoWinslow) {
		 lblIMagen.setIcon(new ImageIcon("imgsProgram/Caso Winslow.png"));
	 }
		
	 
	 
	}

	public static void main(String[] args) {

		new Ejercicio1();

	}

	

}
