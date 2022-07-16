package DAO;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import OO.consultation;

public class consDAO {

	public consultation Ajouter(consultation cons) {
		// Connexion à la BD
		Connection c = ConnexionBD.getConnection();
		// Définition et exécution de la requête d'insertion
		if (c != null) {
			try {
				c.setAutoCommit(false);
				PreparedStatement ps = c.prepareStatement("insert into consultation values (?,?,?,?,?);");
				ps.setInt(1, cons.getNum());
				ps.setInt(2, cons.getCodepat());
				ps.setDate(3,(Date)cons.getDate());
				ps.setString(4,cons.getType());
				ps.setString(5, cons.getRemarques());
				
				
								
				int res = ps.executeUpdate();
				if (res != 0) { // Activer le commit uniquement si la requête s'est exécuté sans problème
					c.commit();
					return cons;
				}
			} catch (SQLException e) { e.printStackTrace();  }
			catch (Exception e) { e.printStackTrace();  }
		}
		return null;
	}
	
	public void suppPatient(int codec) 
	{
			Connection c = ConnexionBD.getConnection();
			if (c != null) 
			{
				try {
					c.setAutoCommit(false);
					PreparedStatement ps = c.prepareStatement("delete from consultation where num=?;");
					ps.setInt(1, codec);
					int res = ps.executeUpdate();				
					if (res != 0) { 
						//JOptionPane.showMessageDialog(FichePatient.frame,"Suppression patient réussie");
						c.commit();
						}
				}
				catch (SQLException e) { 
					e.printStackTrace(); 
					//JOptionPane.showMessageDialog(FichePatient.frame,"Erreur lors de la suppression du patient "+e.getMessage());
					}
				catch (Exception e) { e.printStackTrace();  }
			}
			
		
	
	
}
}
