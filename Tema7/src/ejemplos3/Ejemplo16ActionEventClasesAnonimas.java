package ejemplos3;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Ejemplo16ActionEventClasesAnonimas extends JFrame {

	private JLabel lblMensaje;

	public Ejemplo16ActionEventClasesAnonimas() {

		super("Eventos");
		setSize(220, 130);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setLayout(new FlowLayout());

		JButton btnPulsar = new JButton("Púlsame");
		btnPulsar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				lblMensaje.setText("Bién pulsado!!!");
				
			}
		});
		lblMensaje = new JLabel("Aún no has pulsado el botón!");

		add(btnPulsar);
		add(lblMensaje);

		setVisible(true);

	}

	public static void main(String[] args) {

		new Ejemplo16ActionEventClasesAnonimas();

	}

}
