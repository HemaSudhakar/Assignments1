import week1.day1.Student;

public class report {

	public static void main(String[] args) {
		
		Student hemss=new Student();
		int rollno=hemss.rollno;
		String college =hemss.college;
		String name=hemss.name;
		int marks=hemss.marks;
		float cgpa=hemss.cgpa;
		System.out.println("name: "+name);
		System.out.println("rollno:"+rollno);
		System.out.println("collegename:"+college);
		System.out.println("marks"+marks);
		System.out.println("cgpa"+cgpa);
	}

}
