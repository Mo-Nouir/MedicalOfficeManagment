package DAO;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

import IHM.FichePatient;

import OO.patient;

public class PatDao {
	Connection con= null;
	Statement st= null;
	PreparedStatement ps=null ;
	
	
	public PatDao() {
		try {
			Class.forName("org.postgresql.Driver");
			System.out.println("Driver chargée");
		} catch (ClassNotFoundException e) {
			System.out.println("Erreur chargement Driver"+e.getMessage());
		}
		
		String url="jdbc:postgresql://localhost:5432/Gestion_CabMed";
		String user="postgres";
		String mdp="159246";
		
		try {
			con=DriverManager.getConnection(url, user, mdp);
			System.out.println("Connexion réussie");
		} catch (SQLException e) {
			System.out.println("Erreur de connexion "+e.getMessage());
			
		}
		if (con!=null) {
			try {
				st=con.createStatement();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} }
	public void creerPatient(patient p) {
		try {
			ps=con.prepareStatement("insert into patient(code,nom,prenom,adresse,datenaiss,tel,mail,ncnam,tcnam) values (?,?,?,?,?,?,?,?,?);");
			ps.setInt(1,p.getCode());
			ps.setString(2, p.getNom());
			ps.setString(3, p.getPrenom());
			ps.setString(4, p.getAdresse());
			ps.setDate(5, (Date) p.getDatenaiss());
			ps.setInt(6, p.getTel());
			ps.setString(7, p.getMail());
			ps.setInt(8, p.getNCnam());
			ps.setString(9, p.getTCnam());
			
			ps.executeUpdate();
			
			JOptionPane.showMessageDialog(FichePatient.frame, "Vous avez ajoutez un nouveau patient");				

	    	System.out.println("L'ajout du patient est reussie");

		} catch (SQLException e) {
			JOptionPane.showMessageDialog(FichePatient.frame,"Erreur d'ajout patient "+e.getMessage());
		}
	}
	
	
	public void suppPatient(int pats) 
	{
			Connection c = ConnexionBD.getConnection();
			if (c != null) 
			{
				try {
					c.setAutoCommit(false);
					PreparedStatement ps = c.prepareStatement("delete from patient where code=?;");
					ps.setInt(1, pats);
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
			
			//**********
			
			/*ps=con.prepareStatement("delete from patient where code= ? ;");
			ps.setInt(1, pats);
			ps.executeUpdate();
			JOptionPane.showMessageDialog(FichePatient.frame,"Suppression patient réussie");
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(FichePatient.frame,"Erreur lors de la suppression du patient "+e.getMessage());
		}*/
		
	
	
	
	public patient RechercherParnom(String nom) {
		patient p = null;
		// Connexion à la BD
		Connection c = ConnexionBD.getConnection();
		// Définition et exécution de la requête select
		if (c != null) {
			try {
				PreparedStatement ps = c.prepareStatement("select * from patient where nom=?;");		
				ps.setString(1, nom);
				ResultSet res = ps.executeQuery();
				if (res.next()) { // Activer le commit uniquement si la requête s'est exécuté sans problème
					//int code, String nom, String prenom, String adresse,int tel,  Date datenaiss,int nCnam, String tCnam,String mail
					p = new patient(res.getInt(1), res.getString(2), res.getString(3), res.getString(4),res.getInt(5), res.getDate(6), res.getInt(7), res.getString(8), res.getString(9));
					
					//System.out.println("Patient trouvé : "+res.getInt(1)+";  "+res.getString(2)+";  "+res.getInt(3)+";  "+res.getInt(4)+";  "+res.getInt(5));
				}
			} catch (SQLException e) { e.getMessage();  }
			catch (Exception e) { e.getMessage();  }
		}
		return p;
	}


}
