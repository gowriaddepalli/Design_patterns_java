package dao;

import java.util.ArrayList;
import java.util.List;

public class StudentDaoImpl implements StudentDao{
	List<Student> studs = null;
	
	public StudentDaoImpl() {
		studs = new ArrayList<Student>();
		studs.add(new Student("Lakshmi",3));
		studs.add(new Student("gowri",13));
	}

	@Override
	public List<Student> getAllStudents() {
		// TODO Auto-generated method stub
		return studs;
	}

	@Override
	public Student getStudent(int rollNo) {
		// TODO Auto-generated method stub
		Student p = null;
		for(Student s: studs) {
			if(s.getRollNo() == rollNo) {
				p =s;
			}
		}
		return p;
	}

	@Override
	public void updateStudent(Student student) {
		// TODO Auto-generated method stub
		int r = student.getRollNo();
		getStudent(r).setName(student.getName());
		System.out.println("Student with roll no:" + student.getRollNo() + "updated.");
	}

	@Override
	public void deleteStudent(Student student) {
		// TODO Auto-generated method stub
		studs.remove(getStudent(student.getRollNo()));
		System.out.println("Student with roll no:" + student.getRollNo() + "deleted.");
	}

}
