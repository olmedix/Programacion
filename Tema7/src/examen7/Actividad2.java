package examen7;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JProgressBar;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Actividad2 extends JFrame {
	
	private JProgressBar pgbPotencia;

	public Actividad2() {
		super("Fotos aleatorias");
		setSize(500,400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setLayout(new FlowLayout(FlowLayout.LEFT));
		
		
		
		JLabel lblAjustePotencia = new JLabel("Ajuste la potencia (en CV):");
	
		
		JSlider sldPotencia = new JSlider(JSlider.HORIZONTAL, 0, 2000, 300);
		sldPotencia.setPreferredSize(new Dimension(400,50));
		sldPotencia.setPaintLabels(true);
		sldPotencia.setPaintTicks(true);
		sldPotencia.setMajorTickSpacing(500);
		sldPotencia.setMinorTickSpacing(100);
		sldPotencia.addChangeListener(new ChangeListener() {
			
			@Override
			public void stateChanged(ChangeEvent arg0) {
				int potencia = sldPotencia.getValue();
				pgbPotencia.setValue(potencia);
				
				if(potencia <= 1400) {
					pgbPotencia.setForeground(Color.GREEN);
					
				}else if(potencia <= 1800) {
					pgbPotencia.setForeground(Color.ORANGE);
					
				}else {
					pgbPotencia.setForeground(Color.RED);
				
				}
			}
		});
		
		pgbPotencia = new JProgressBar(JProgressBar.VERTICAL, 0, 2000);
		pgbPotencia.setPreferredSize(new Dimension(70,310));
		pgbPotencia.setStringPainted(true);
		pgbPotencia.setValue(300);
		pgbPotencia.setForeground(Color.GREEN);
		
		add(lblAjustePotencia);
		add(sldPotencia);
		add(pgbPotencia);
		
		setVisible(true);
	}
	
	
	public static void main(String[] args) {
		new Actividad2();

	}

}
