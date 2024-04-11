package examenPruebas;

import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JSlider;
import javax.swing.JTextField;
import javax.swing.JToolBar;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class Ejemplo1JFrames extends JFrame {
	
	public Ejemplo1JFrames() {
		
		super("Ejemplo JFrames");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(500,500);
		setLocationRelativeTo(null);
		setLayout(new FlowLayout());
		
		JLabel lblTitulo = new JLabel("TITULO DE LOS EJEMPLOS DE JFRAME");
		JTextField txtNombre = new JTextField(9);
		JLabel lblSexo = new JLabel("Elige tu sexo: ");
		JRadioButton rbtnHombre = new JRadioButton("Hombre",true); 
		JRadioButton rbtnMujer = new JRadioButton("Mujer");
		
//		ButtonGroup btnGroup = new ButtonGroup();
//		btnGroup.add(rbtnMujer);
//		btnGroup.add(rbtnHombre);
		
		JComboBox<String> cmbPueblosMallorquines = new JComboBox<String>();
		cmbPueblosMallorquines.addItem("Inca");
		cmbPueblosMallorquines.addItem("Lloseta");
		cmbPueblosMallorquines.addItem("Palma");
		cmbPueblosMallorquines.addItem("Arta");
		cmbPueblosMallorquines.addItem("Inca");
		cmbPueblosMallorquines.addItem("Esporles");
		
		
		JSlider sldprimero= new JSlider(JSlider.VERTICAL, 0, 100, 15);
		sldprimero.setMinorTickSpacing(5);
		sldprimero.setMajorTickSpacing(10);
		sldprimero.setPaintLabels(true);
		sldprimero.setPaintTicks(true);
		sldprimero.setPreferredSize(new Dimension(50,200));
		
		
		JButton btnImagen = new JButton(new ImageIcon("iconos/48.png"));
		
		JToolBar barraHerramientas = new JToolBar("Herramientas");
		
		JButton btnNuevo = new JButton("Nuevo");
		JButton btnViejo = new JButton("Viejo");
		barraHerramientas.add(btnNuevo);
		barraHerramientas.addSeparator(new Dimension(15,15));
		barraHerramientas.add(btnViejo);
		
		String[] colores = new String[] {"Rojo","Azul","Verde","Amarillo","Marrón","Violeta"};
		JList<String> color = new JList<String>(colores);
		color.addListSelectionListener(new ListSelectionListener() {
			
			@Override
			public void valueChanged(ListSelectionEvent e) {
				
				
			}
		});
		
		JScrollPane scpColor = new JScrollPane(color);
		scpColor.setPreferredSize(new Dimension(80,80));
		
		
		
		
		
		add(lblTitulo);
		add(txtNombre);
		add(lblSexo);
		add(rbtnHombre);
		add(rbtnMujer);
		add(cmbPueblosMallorquines);
		add(sldprimero);
		add(btnImagen);
		add(barraHerramientas);
		add(scpColor);
		
		
		
		setVisible(true);
	}
	
	private String muestraMascota() {
		String mascota= JOptionPane.showInputDialog(null, "Nombre de tu mascota:");
		
		return mascota; 
				}
	

	public static void main(String[] args) {
		
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
				| UnsupportedLookAndFeelException e) {
			
			JOptionPane.showMessageDialog(null,"No se ha podido visualizar el LookAndFeel", "Ejemplos de Frame", JOptionPane.ERROR_MESSAGE);
		}
		
		new Ejemplo1JFrames();
		
		//EJEMPLOS DE DIALOGOS.
		
		JOptionPane.showConfirmDialog(null, "Por favor confirma que eres tú:", "Mensaje de confirmación", JOptionPane.CLOSED_OPTION);
		int opcionCambios =JOptionPane.showConfirmDialog(null, "¿Quieres guardar los cambios?", "Cambios PC",JOptionPane.OK_CANCEL_OPTION);
	
		if(opcionCambios==0) {
			JOptionPane.showMessageDialog(null, "Mensaje guardado correctamente!!!", "GUARDADO", JOptionPane.INFORMATION_MESSAGE);
		}
	}

}
