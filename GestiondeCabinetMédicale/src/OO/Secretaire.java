package OO;

public class Secretaire {
	int code;
	String nom;
	String prenom;
	
	
	public Secretaire(int code, String nom, String prenom) {
		super();
		this.code = code;
		this.nom = nom;
		this.prenom = prenom;
	}


	public int getCode() {
		return code;
	}


	public void setCode(int code) {
		this.code = code;
	}


	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public String getPrenom() {
		return prenom;
	}


	public void setPrenom(String prenom) {
		this.prenom = prenom;
	} 
	
	
	
	

}
