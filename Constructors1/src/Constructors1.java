class Construct{
	
	int a,b;
	
	Construct(){
		a=10;
		b=20;
	}
	
	void display() {
		System.out.println(a);
		System.out.println(b);
	}
}


public class Constructors1 {

	public static void main(String[] args) {
		Construct obj = new Construct();
		obj.display();
	}

}
