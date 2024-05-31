package examen7;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class Actividad1 extends JFrame{
	
	public Actividad1() {
		
		super("Fotos aleatorias");
		setSize(500,400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setLayout(new FlowLayout());
		
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
			SwingUtilities.updateComponentTreeUI(this);
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
				| UnsupportedLookAndFeelException e) {
	
			e.printStackTrace();
		}
		
		ImageIcon arbol01 = new ImageIcon("imgs/arbol01.png");
		ImageIcon arbol02 = new ImageIcon("imgs/arbol02.png");
		ImageIcon arbol03 = new ImageIcon("imgs/arbol03.png");
		ImageIcon arbol04 = new ImageIcon("imgs/arbol04.png");
		ImageIcon arbol05 = new ImageIcon("imgs/arbol05.png");
		ImageIcon arbol06 = new ImageIcon("imgs/arbol06.png");
		
		ImageIcon[] arboles = new ImageIcon[] {
				arbol01,arbol02,arbol03,arbol04,arbol05,arbol06	
		};
		
		JLabel imagen = new JLabel(arbol01);
		
		JButton btnSiguiente = new JButton("Siguiente");
		btnSiguiente.setPreferredSize(new Dimension(100,35));
		btnSiguiente.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				int numAleatorio =((int) (Math.random()*6));
				
				imagen.setIcon(arboles[numAleatorio]);
				
			}
		});
		
		
		
		JButton btnReset = new JButton("Reset");
		btnReset.setPreferredSize(new Dimension(100,35));
		btnReset.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				imagen.setIcon(arbol01);
				
			}
		});
		
		add(imagen);
		add(btnSiguiente);
		add(btnReset);
		
		
		
		setVisible(true);
		
	}

	public static void main(String[] args) {
		
		new Actividad1();

	}

}
