class Student {
	
	public void displayName(String name ) {
		System.out.println("Name : " + name);
	}
	
	public void displayRollno(int rollno) {
		System.out.println("Age : " + rollno);
	}
	
	public void displaySectionPercentage(String section , double per) {
		System.out.println("Section :" + section);
		System.out.println("Percentage: " + per);
	}
}

public class Classes4 {
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.displayName("Owais");
		s1.displayRollno(129);
		s1.displaySectionPercentage("Yellow", 90.5);
	}

}
