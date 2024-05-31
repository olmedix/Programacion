package examen7;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class Actividad3 extends JFrame {

	private String[][] cargas = { { "Detector de partículas de alta energía", "19.2" },
			{ "Subsistema espectrómetro de plasma", "12.5" }, { "Analizador de polvo cósmico", "40" },
			{ "Magnetómetro", "4.5" }, { "Detector de ondas de plasma", "51" }, { "Espectrómetro de masas", "43" },
			{ "Instrumento para radioastronomía planetaria", "80" } };
	private int posInstrumento;
	private JTextArea txtDescripcion;
	private JLabel lblPesoTotal;
	private double pesoTotal = 0;

	public Actividad3() {

		super("Fotos aleatorias");
		setSize(430, 530);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setLayout(new FlowLayout(FlowLayout.LEFT));

		JLabel lblInformacion = new JLabel("Elija las cargas (carga máxima, 150.0 kg):");

		JComboBox<String> cmbCargas = new JComboBox<String>();
		cmbCargas.setPreferredSize(new Dimension(400, 30));
		cmbCargas.addItemListener(new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent arg0) {
				posInstrumento = cmbCargas.getSelectedIndex();

			}
		});

		for (int i = 0; i < cargas.length; i++) {

			cmbCargas.addItem(cargas[i][0] + " (" + cargas[i][1] + "kg)");

		}

		JButton btnAnyadir = new JButton("Añadir carga");
		btnAnyadir.setPreferredSize(new Dimension(180, 30));
		btnAnyadir.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {

				String listado = cargas[posInstrumento][0] + " ... " + cargas[posInstrumento][1] + " kg\n";
				txtDescripcion.append(listado);

				pesoTotal += Double.parseDouble(cargas[posInstrumento][1]);

				pesoTotal = Math.round(pesoTotal * 100) / 100.0;

				lblPesoTotal.setText("" + pesoTotal + " kg");

				if (pesoTotal > 150) {
					JOptionPane.showMessageDialog(null, "El peso de la carga ha superado el máximo permitido",
							"Payload", JOptionPane.ERROR_MESSAGE);
				}
			}
		});

		txtDescripcion = new JTextArea(10, 36);

		JLabel lblCargaTotal = new JLabel("Carga total:");
		lblCargaTotal.setPreferredSize(new Dimension(400, 25));

		lblPesoTotal = new JLabel("0 kg");
		lblPesoTotal.setFont(new Font("Arial", Font.PLAIN, 80));

		add(lblInformacion);
		add(cmbCargas);
		add(btnAnyadir);
		add(txtDescripcion);
		add(lblCargaTotal);
		add(lblPesoTotal);

		setVisible(true);
	}

	public static void main(String[] args) {
		new Actividad3();

	}

}
