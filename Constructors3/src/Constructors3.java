class Construct{
	
	int a,b;
	
	Construct(int x,int y){
		a=x;
		b=y;
	}
	
	void display() {
		System.out.println(a);
		System.out.println(b);
	}
}
public class Constructors3 {

	public static void main(String[] args) {
		
		Construct obj = new Construct(2,10);
		obj.display();
		
		

	}

}
