class Person {
	String name;
	int age;
	
	String getName() {
		return name;
	}
	
	int getAge() {
		return age;
	}
}


public class Classes3 {
	public static void main(String[] args) {
	
		Person p1 = new Person();
		p1.name = "Owais";
		p1.age = 19;
		
		String name = p1.getName();
		System.out.println("Name is: " + name);
		
		int age = p1.getAge();
		System.out.println("Age is: " + age);
		
	}
}