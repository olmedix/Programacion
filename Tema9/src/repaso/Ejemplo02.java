import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Ejemplo02 {

	public static void main(String[] args) {

		String url = "jdbc:mysql://localhost/Libreria";
		String usuario = "librero";
		String password = "Ageofempires2";

		listar("Alejandro Dumas", url, usuario, password);

		Libro libro = new Libro(1007, "La ecuación de Dios", "Michio kako", 10.45f, 1);

		// insertarLibro(url, usuario, password, libro);

		// actualizarTitulo(url, usuario, password, 1002, "El conde de Montecristo");
		
		borrarTabla(url, usuario, password);

	}

	private static void borrarTabla(String url, String usuario, String password) {
		Scanner entrada = new Scanner(System.in);
		String sql = "DELETE FROM libros;";

		System.out.print("¿Estás seguro de querer eliminar la tabla?\nEscribe \"s\": ");
		String respuesta = entrada.nextLine();

		if (respuesta.equals("s")) {
			try (Connection conexion = DriverManager.getConnection(url, usuario, password);

					PreparedStatement prepareStatement = conexion.prepareStatement(sql)) {
				
				prepareStatement.executeUpdate();

			} catch (SQLException e) {
				e.printStackTrace();
			}

		} else {
			return;
		}

	}

	private static void actualizarTitulo(String url, String usuario, String password, int id, String titulo) {

		String sql = "update libros set titulo =? where id=?;";

		try (Connection conexion = DriverManager.getConnection(url, usuario, password);
				PreparedStatement prepareStatement = conexion.prepareStatement(sql)) {

			prepareStatement.setString(1, titulo);
			prepareStatement.setInt(2, id);

			prepareStatement.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	private static void insertarLibro(String url, String usuario, String password, Libro libro) {

		String sql = "insert into libros values(?,?,?,?,?);";

		try (Connection conexion = DriverManager.getConnection(url, usuario, password);
				PreparedStatement prepareStatement = conexion.prepareStatement(sql)) {

			prepareStatement.setInt(1, libro.getId());
			prepareStatement.setString(2, libro.getTitulo());
			prepareStatement.setString(3, libro.getAutor());
			prepareStatement.setFloat(4, libro.getPrecio());
			prepareStatement.setInt(5, libro.getUnidades());

			int registrosModificados = prepareStatement.executeUpdate();

			System.out.println("Se han modificado " + registrosModificados + " registros.");

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	private static void listar(String autor, String url, String usuario, String password) {

		String sql = "select * from libros where autor = ?";

		try (Connection conexion = DriverManager.getConnection(url, usuario, password);
				PreparedStatement preparedStatement = conexion.prepareStatement(sql)) {

			preparedStatement.setString(1, autor);

			ResultSet resultados = preparedStatement.executeQuery();

			System.out.println("LIBROS ESCRITOS POR " + autor.toUpperCase() + "\n-----------------------------------");
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
