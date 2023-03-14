//Single inheritance
class SuperClass{
	int a,b,c;
	
	void setData(int x, int y, int z ) {
		a=x;
		b=y;
		c=z;
	}
}

class SubClass extends SuperClass{
	int sum;
	
	void calculateSum() {
		sum = a+b+c;
		System.out.println("Sum is:" + sum);
	}
}


public class Inheritance1 {

	public static void main(String[] args) {
		SubClass obj = new SubClass();
		obj.setData(10,20,20);
		obj.calculateSum();

	}

}
