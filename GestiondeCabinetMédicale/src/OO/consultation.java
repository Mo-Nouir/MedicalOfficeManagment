package OO;

import java.sql.Date;

public class consultation {
	
	int num ;
	int codepat ; 
	Date date;
	String type;
	String remarques;
	public consultation(int num, int codepat, Date date, String type, String remarques) {
		super();
		this.num = num;
		this.codepat = codepat;
		this.date = date;
		this.type = type;
		this.remarques = remarques;
	}
	
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public int getCodepat() {
		return codepat;
	}
	public void setCodepat(int codepat) {
		this.codepat = codepat;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getRemarques() {
		return remarques;
	}
	public void setRemarques(String remarques) {
		this.remarques = remarques;
	} 
	
	
	
	
	
	
	
	
	
	
}
	
	