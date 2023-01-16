package kodlama.io.demo.entities;

public class Course {
	private String courseName;
	private int unitPrice;
	
	public Course() {
	}
	public Course(String courseName, int unitPrice) {
		this.courseName = courseName;
		this.unitPrice = unitPrice;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public int getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(int unitPrice) {
		this.unitPrice = unitPrice;
	}

	
	
}
