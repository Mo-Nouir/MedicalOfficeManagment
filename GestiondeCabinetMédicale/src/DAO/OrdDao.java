package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import OO.ordonnance;

public class OrdDao {
	
	public ordonnance AjouteOrd(ordonnance ord) {
		// Connexion à la BD
		Connection c = ConnexionBD.getConnection();
		// Définition et exécution de la requête d'insertion
		if (c != null) {
			try {
				c.setAutoCommit(false);
				
				PreparedStatement ps = c.prepareStatement("insert into ordonnance values (?,?,?);");
				ps.setInt(1, ord.getCode());
				ps.setString(2, ord.getDesc());
				ps.setString(3, ord.getNom());
						
				int res = ps.executeUpdate();
				if (res != 0) 
				{ // Activer le commit uniquement si la requête s'est exécuté sans problème
					c.commit();
					return ord;
				}
			} catch (SQLException e) { 
				System.out.println("eereur 1:" + e.getMessage());  }
			catch (Exception e) {
				System.out.println("eereur 2:" + e.getMessage());  }
		}
		return null;
	}

}
