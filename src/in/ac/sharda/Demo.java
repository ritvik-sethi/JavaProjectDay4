package in.ac.sharda;

public class Demo {

	public static void main(String[] args) {
		Student s2 =new Student(2,"ritvik","ritviksethi56@gmail.com");
		Student s = new Student(1, "Sethi");
		System.out.println(s.equals(s2));
		System.out.println(s.getname());
		System.out.println(s2.getRollNumber());
		System.out.println(s2.getname());
		System.out.println(s2.getEmail());
	}
	

}
