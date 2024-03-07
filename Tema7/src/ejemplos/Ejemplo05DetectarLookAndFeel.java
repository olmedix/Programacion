package ejemplos;

import javax.swing.JOptionPane;
import javax.swing.UIManager;

import com.jtattoo.plaf.luna.LunaLookAndFeel;

public class Ejemplo05DetectarLookAndFeel {

	public static void main(String[] args) {

		try {
			// Establece el look and feel de JTattoo
			UIManager.setLookAndFeel(new LunaLookAndFeel()); // Puedes cambiar "AluminiumLookAndFeel" por el
																	// aspecto que desees utilizar
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		JOptionPane.showConfirmDialog(null, "¿Formatear el disco duro?", "Confirmación de formateo", JOptionPane.OK_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE);

	}

}
