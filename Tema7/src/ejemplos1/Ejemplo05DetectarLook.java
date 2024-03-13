package ejemplos1;

import javax.swing.JFrame;
import javax.swing.UIManager;

public class Ejemplo05DetectarLook extends JFrame {
	public Ejemplo05DetectarLook() {
		UIManager.LookAndFeelInfo[] laf = UIManager.getInstalledLookAndFeels();
		for (int i = 0; i < laf.length; i++) {
			System.out.println("Class name: " + laf[i].getClassName());
			System.out.println("Name: " + laf[i].getName() + "\n");
		}
	}

	public static void main(String[] arguments) {
		Ejemplo05DetectarLook dialog = new Ejemplo05DetectarLook();
	}
}
