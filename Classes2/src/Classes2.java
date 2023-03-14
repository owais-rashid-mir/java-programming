class Person {
	String name; //Instance variables
	int age;
	
	void display() {  //Methods or subroutines.
		System.out.println("My name is:" + name);
		System.out.println("My age is:" + age);
	}
	
}

public class Classes2 {
	public static void main(String[] args) {
		Person person1 = new Person();
		
		person1.name="owais";
		person1.age = 15;
		person1.display();
		
		Person person2 = new Person();
		person2.name = "Ovi";
		person2.age = 20;
		person2.display();
		
	}
}