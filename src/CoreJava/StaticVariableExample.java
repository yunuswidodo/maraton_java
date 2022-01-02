package CoreJava;

public class StaticVariableExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student = new Student(100, "Student 1");
        Student student2 = new Student(101, "Student 2");
        Student student3 = new Student(102, "Student 3");
        Student student4 = new Student(103, "Student 4");

        System.out.println(" ------------ Student 1 -------------");
        System.out.println(student.toString());
        System.out.println(student2.toString());
        System.out.println(student3.toString());
        System.out.println(student4.toString());
        
		

	}

}

class Student {
	private int rollNo;
	private String name;
	private static String college = "ABC"; // static variable
	public Student(int rollNo, String name) {
		super();
		this.rollNo =rollNo;
		this.name = name;
	}
	
	@Override 
	public String toString() {
		return "Student[rollNo]=" + rollNo + ", name=" + name + ".college= " + college + "]" ;
	}
	
}
