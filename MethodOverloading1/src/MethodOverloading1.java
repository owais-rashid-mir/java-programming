class MethOver{
	
	int a,b,c;
	
	//Varying the number of arguments
	void display(int a) {
		System.out.println(a);
	}
	
	void display(int a,int b) {
		System.out.println(a);
		System.out.println(b);
	}
	
	//Varying the type of arguments
	void display(int a, double b) {
		System.out.println(a);
		System.out.println(b);
	}
	
	void display(double a, int b) {
		System.out.println(a);
		System.out.println(b);
	}
	
	
}


public class MethodOverloading1 {

	public static void main(String[] args) {
		MethOver obj = new MethOver();
		
		obj.display(10);
		obj.display(20,30);
		
		obj.display(40 , 50.0);
		obj.display(60.0 , 70);

	}

}
