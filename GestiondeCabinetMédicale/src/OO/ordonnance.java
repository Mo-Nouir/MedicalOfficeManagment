package OO;

public class ordonnance {
	int code;
	String nom;
	String desc;
	
	public ordonnance(int code , String nom ,String desc)
	{
		super();
		this.code = code;
		this.nom = nom;
		this.desc = desc;
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


	public String getDesc() {
		return desc;
	}


	public void setDesc(String desc) {
		this.desc = desc;
	}	
	

}
