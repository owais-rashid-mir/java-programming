class Person {
	String name; //Instance variables
	int age;
	
}


public class Classes {
	public static void main(String[] args) {
		
		Person person1 = new Person();
		person1.name="owais";
		person1.age = 15;
	
		Person person2 = new Person();
		person2.name = "Ovi";
		person2.age = 20;
			
		System.out.println(person1.name);
		System.out.println(person1.age);
		
		System.out.println(person2.name);
		System.out.println(person2.age); 
		
		
	}
}