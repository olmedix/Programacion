import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Ejemplo03 {

	public static void main(String[] args) {

		String url = "jdbc:mysql://localhost/inversiones";
		String usuario = "java";
		String password = "Ageofempires2";

		// addEmpresas(url, usuario, password);
		// addAcciones(url, usuario, password);
		// listaEmpresas(url, usuario, password);
		informe(url, usuario, password);
	}
	
	private static void informe(String url, String usuario, String password) {
		
		String sql = "select propietario, nombre, cantidad "
				+ "from acciones, empresas e\n"
				+ "where id_empresa = e.id\n"
				+ "order by propietario";
		
		try(Connection conexion = DriverManager.getConnection(url,usuario,password);
				Statement statement = conexion.createStatement()) {
			
			ResultSet resultados = statement.executeQuery(sql);
			
			System.out.println("Informe de acciones");
			System.out.println("---------------------------------------------------");
			System.out.printf("%-18s %-25s %-10s%n", "PROPIETARIO", "NOMBRE", "CANT");
			System.out.printf("%-18s %-25s %-10s%n", "==============", "======================", "====");
			
			while(resultados.next()) {
				String propietario = resultados.getString("propietario");
				String nombre = resultados.getString("nombre");
				int cantidad = resultados.getInt("cantidad");
				System.out.printf("%-18s %-25s %-10d%n", propietario, nombre, cantidad);
			}
			
			
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
	}

	private static void listaEmpresas(String url, String usuario, String password) {

		String sql = "select * from empresas;";

		try (Connection conexion = DriverManager.getConnection(url, usuario, password);
				Statement statement = conexion.createStatement()) {

			ResultSet resultados = statement.executeQuery(sql);

			System.out.println("Tabla Empresas");
			System.out.println("---------------------------------------------");
			System.out.printf("%-4s %-25s %-10s%n", "ID", "NOMBRE", "FUNDACIÓN");
			System.out.printf("%-4s %-25s %-10s%n", "==", "======", "==========");

			while (resultados.next()) {
				int id = resultados.getInt("id");
				String nombre = resultados.getString("nombre");
				String fundacion = resultados.getString("fundacion") + "-01-01";
				System.out.printf("%-4d %-25s %-10s%n", id, nombre, fundacion);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	private static void addAcciones(String url, String usuario, String password) {

		String[][] acciones = { { "1", "Carlos Pérez", "1", "100" }, { "2", "Lucía Martínez", "1", "55" },
				{ "3", "José López", "2", "70" }, { "4", "Marcos Jiménez", "3", "125" } };

		String sql = "insert into acciones values(?,?,?,?);";

		try (Connection conexion = DriverManager.getConnection(url, usuario, password);
				PreparedStatement prepareStatement = conexion.prepareStatement(sql)) {

			System.out.println("Insertando registros en la tabla Acciones...");
			for (int i = 0; i < acciones.length; i++) {

				int id = Integer.parseInt(acciones[i][0]);
				int idEmpresa = Integer.parseInt(acciones[i][2]);
				int cantidad = Integer.parseInt(acciones[i][3]);

				prepareStatement.setInt(1, id);
				prepareStatement.setString(2, acciones[i][1]);
				prepareStatement.setInt(3, idEmpresa);
				prepareStatement.setInt(4, cantidad);

				int resultado = prepareStatement.executeUpdate();
				System.out.println(resultado + " registro(s) modificados.");

			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	private static void addEmpresas(String url, String usuario, String password) {

		String[][] empresas = { { "1", "Navantia", "2005" }, { "2", "Red Eléctrica Española", "1985" },
				{ "3", "Indra", "1992" } };

		String sql = "insert into empresas values (?,?,?);";

		try (Connection conexion = DriverManager.getConnection(url, usuario, password);
				PreparedStatement prepareStatement = conexion.prepareStatement(sql);) {

			System.out.println("Insertando registros en la tabla de empresas...");
			for (int i = 0; i < empresas.length; i++) {

				prepareStatement.setInt(1, Integer.parseInt(empresas[i][0]));
				prepareStatement.setString(2, empresas[i][1]);
				prepareStatement.setString(3, empresas[i][2]);

				int registrosInsertados = prepareStatement.executeUpdate();

				System.out.println(registrosInsertados + " registro(s) modificados.");

			}

		} catch (SQLException e) {

			e.printStackTrace();
		}

	}

}
