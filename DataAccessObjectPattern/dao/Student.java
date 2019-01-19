package dao;

public class Student {

	private int rollNo;
	private String name;
		
		
	public Student( String Name, int rollNo) {
		this.rollNo = rollNo;
		this.name = Name;
	}


	public int getRollNo() {
		return rollNo;
	}


	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}
	
}
