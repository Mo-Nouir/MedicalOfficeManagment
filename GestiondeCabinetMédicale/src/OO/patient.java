package OO;

import java.util.Date;


public class patient {
	int code;
	String nom;
	String prenom;
	String adresse;
	int tel;
	//String grpsanguin;
	Date datenaiss;
	int NCnam;
	String TCnam;
	String mail;
	
	public patient(int code, String nom, String prenom, String adresse,int tel,  Date datenaiss,int nCnam, String tCnam,String mail)
			
	{				

		super();
		this.code = code;
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
		this.tel = tel;
		//this.grpsanguin = grpsanguin;
		this.datenaiss = datenaiss;
		this.NCnam = nCnam;
		this.TCnam = tCnam;
		this.mail = mail;
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

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public int getTel() {
		return tel;
	}

	public void setTel(int tel) {
		this.tel = tel;
	}

	/*public String getGrpsanguin() {
		return grpsanguin;
	}

	public void setGrpsanguin(String grpsanguin) {
		this.grpsanguin = grpsanguin;
	}*/

	public Date getDatenaiss() {
		return datenaiss;
	}

	public void setDatenaiss(Date datenaiss) {
		this.datenaiss = datenaiss;
	}

	public int getNCnam() {
		return NCnam;
	}

	public void setNCnam(int nCnam) {
		NCnam = nCnam;
	}

	public String getTCnam() {
		return TCnam;
	}

	public void setTCnam(String tCnam) {
		TCnam = tCnam;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}
	
	
	
	
	
}
	
	