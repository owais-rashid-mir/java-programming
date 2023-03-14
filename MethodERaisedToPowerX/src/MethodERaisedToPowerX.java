//java method which returns 'e' raised to the power of a given number.
public class MethodERaisedToPowerX {

	public static void main(String[] args) {
		
		int n =10;
		float x =1;
		System.out.println("e^x = " + exp(n,x));

	}
	
	public static float exp(int n , float x) {
		
		//Initialize sum 0f series
		float sum =1;
		for(int i=n-1; i>0 ; --i)
			sum = 1+x*sum/i;
		return sum;
	}

}
