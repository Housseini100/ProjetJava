package principale;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnexionBD {
	public static void main(String[] args) {
		Connecter();
	}
	public static void Connecter() {
		String url = "jdbc:mysql://localhost/formation";
		String login = "root";
		String passwd = "";
		Connection cn =null;
		try {

			// Etape 1 : Chargement du driver
			Class.forName("com.mysql.jdbc.Driver");

			// Etape 2 : récupération de la connexion
			cn = DriverManager.getConnection(url, login, passwd);
			System.out.println("Connexion etablie");
		}catch (SQLException e) {
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				// TODO: handle exception
				e.printStackTrace();
			} finally {
				try {
				// Etape 6 : libérer ressources de la mémoire.
					cn.close();
					System.out.println("Connexion fermée");
					//st.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}

		
	}
	

}
