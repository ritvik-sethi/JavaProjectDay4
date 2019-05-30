package in.ac.sharda;

import java.util.Set;
import java.util.TreeSet;


public class University {
	private Set<Department> departments=new TreeSet<>();
	
	public boolean addDepartment(Department d) {
      return departments.add(d);
	
	}
	public void printDepartment() {
		departments.parallelStream()
		.forEach(d -> System.out.println(d.getId()));
	}
	}
	


