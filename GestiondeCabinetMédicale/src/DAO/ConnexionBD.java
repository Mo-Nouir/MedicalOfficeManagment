package DAO;
import java.sql.*;

public class ConnexionBD {

	// Params de la connexion
	private static String url = "jdbc:postgresql://localhost:5432/Gestion_CabMed";
	private static String user = "postgres";
	private static String passwd = "159246";

	private static Connection cn = null;

	// Constructeur priv? pour limiter l'instanciation
	private ConnexionBD() {
		try { 
			cn = DriverManager.getConnection(url, user, passwd);
		} 
		catch ( Exception e ) {
			e.printStackTrace();  
		}
	}

	// On n'instancie la connexion que si le cn est different de null
	public static Connection getConnection() {
		if (cn == null) {
			new ConnexionBD();
		}
		return cn;
	}
	// M?thode de fermeture de la connexion
	public static void Fermer() {
		if (cn != null) {
			try {  cn.close(); }
			catch (SQLException e) { 
				e.printStackTrace();  
			}
		}
	}
}
