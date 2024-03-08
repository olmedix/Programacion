package ejemplos;

import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class Ejemplo05DetectarLookAndFeel {

	public static void main(String[] args) {

		try {
			UIManager.setLookAndFeel("com.jtattoo.plaf.smart.SmartLookAndFeel");
		
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
				| UnsupportedLookAndFeelException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		JOptionPane.showConfirmDialog(null, "¿Formatear el disco duro?", "Confirmación de formateo",
				JOptionPane.OK_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE);

	}

}
