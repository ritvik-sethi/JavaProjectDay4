package in.ac.sharda;

public class Student implements IResultArrivedListner {
	
	private final int rollNumber;
	private final String name;
    private String email;
    
	public Student(int rn, String n) {
		this.rollNumber=rn;
		this.name=n;
	}
	public Student(int rn, String n,String email) {
		this.rollNumber=rn;
		this.name=n;
		this.email=email;
	}
		
	
	public void attendance() {
		System.out.println("Present");
			}
	
		public int getRollNumber() {
			return rollNumber;
		}
		public String getname() {
			return name;
					
		}
		
		public void setEmail(String email) {
			this.email = email;
		}

		public String getEmail() {
			return email;
			
		}
		public String getName() {
			return name;
			
		}
		
		@Override
		public boolean equals(Object obj) {
			if(obj instanceof Student) {
				return((Student)obj)
						.getRollNumber()==rollNumber;
			}
			return false;
			
		}
		@Override
		public void resultArrived() {
			System.out.println("Hey! Go check your Result"+name );
			
		}	
}


		
		
		

