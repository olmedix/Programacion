package ejemplos3;

import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Ejemplo22MouseListener extends JFrame {

	public Ejemplo22MouseListener() {

		super("Mouse Listener");
		setSize(300, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setLayout(new FlowLayout(FlowLayout.LEFT));

		JLabel lblCordenadas = new JLabel("¡Haz clic en esta ventana!");
		JLabel lblBoton = new JLabel("");

		addMouseListener(new MouseListener() {

			@Override
			public void mouseReleased(MouseEvent arg0) {
				// getContentPane().setBackground(Color.BLACK);

			}

			@Override
			public void mousePressed(MouseEvent arg0) {
				// getContentPane().setBackground(Color.YELLOW);

			}

			@Override
			public void mouseExited(MouseEvent arg0) {
				// getContentPane().setBackground(Color.PINK);

			}

			@Override
			public void mouseEntered(MouseEvent arg0) {
				// getContentPane().setBackground(Color.CYAN);

			}

			@Override
			public void mouseClicked(MouseEvent arg0) {
				// System.out.println("MouseClicked");

				int x = arg0.getX();
				int y = arg0.getY();

				lblCordenadas.setText("Coordenadas: (" + x + ", " + y + ")");

				int boton = arg0.getButton();
				if (boton == MouseEvent.BUTTON1) {
					lblBoton.setText("Has pulsado el botón izquierdo");
				} else if (boton == MouseEvent.BUTTON3) {
					lblBoton.setText("Has pulsado el botón derecho");
				} else if (boton == MouseEvent.BUTTON2) {
					lblBoton.setText("Has pulsado la rueda del botón");
				}

			}
		});

		add(lblCordenadas);
		add(lblBoton);

		setVisible(true);

	}

	public static void main(String[] args) {

		new Ejemplo22MouseListener();

	}

}
