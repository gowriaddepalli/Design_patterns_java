package mvc;

public class MVCPatternDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		Student stud = fetchDatafromDatabase();
		
		StudentView sv = new StudentView();
		
		StudentController sc = new StudentController(stud,sv);
		
		sc.updateView();
		
		sc.setStudentName("Rahul");
		
		sc.updateView();
	}

	private static Student fetchDatafromDatabase() {
		// TODO Auto-generated method stub
		Student student = new Student("Robert","10");
	    return student;
	}

}
