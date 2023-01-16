package kodlama.io.demo.entities;

public class Instructor {
	public String insrtuctorName;
	public String insrtuctorSurname;
	
	public Instructor() {
	}
	
	public Instructor(String insrtuctorName, String insrtuctorSurname) {
		this.insrtuctorName = insrtuctorName;
		this.insrtuctorSurname = insrtuctorSurname;
	}
	
	public String getInsrtuctorName() {
		return insrtuctorName;
	}
	
	public void setInsrtuctorName(String insrtuctorName) {
		this.insrtuctorName = insrtuctorName;
	}
	
	public String getInsrtuctorSurname() {
		return insrtuctorSurname;
	}
	
	public void setInsrtuctorSurname(String insrtuctorSurname) {
		this.insrtuctorSurname = insrtuctorSurname;
	}
	
	

}
