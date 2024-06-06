import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Ejemplo01 {

	public static void main(String[] args) {

		String url = "jdbc:mysql://localhost/Libreria";
		String usuario = "librero";
		String password = "Ageofempires2";

		listar("Alejandro Dumas",url, usuario, password);

	}

	private static void listar( String autor, String url, String usuario, String password) {

		String sql = "select * from libros where autor = '" + autor + "'";

		try (Connection conexion = DriverManager.getConnection(url, usuario, password);
				Statement statement = conexion.createStatement();) {

			ResultSet resultados = statement.executeQuery(sql);
			
			System.out.println("LIBROS ESCRITOS POR " + autor.toUpperCase()+"\n-----------------------------------");
			while (resultados.next()) {

				System.out.println(resultados.getInt("id"));
				System.out.println(resultados.getString("titulo"));
				System.out.println(resultados.getString("autor"));
				System.out.println(resultados.getFloat("precio"));
				System.out.println(resultados.getInt("cantidad"));
				System.out.println("-------------");

			}

		} catch (SQLException e) {
			System.out.println("Error de acceso a la base de datos.");
			e.printStackTrace();
		}
	}

}
