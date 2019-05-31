package in.ac.sharda;

public class DepartmentDemo {

	public static void main(String[] args) {
		Department d = new Department(12);
		d.addStudent(new Student(1,"Ritvik"));
		d.addStudent(new Student(2,"Raghav"));
		d.addStudent(new Student(3,"AJat"));
		d.addStudent(new Student(4,"Aanya"));
		d.addStudent(new Student(5,"Anushka"));
		d.addStudent(new Student(6,"Aru"));
		d.printStudents();
		

	}

}
