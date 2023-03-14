package qwerty;

class Box
{
	private int len, br, ht;
	
	Box(int l,int b,int h)
	{
		len = l;
		br = b;
		ht = h;
	}
	public void calculateVolume()
	{
		int vol = len * br * ht;
		System.out.println("Volume = " + vol);
	}
}


public class qwertyClass {
	public static void main(String[] args) {
		Box b1=new Box(10,10,10);
		b1.calculateVolume();
		
		Box b2=new Box(10,10,1);
		b2.calculateVolume();
	}
}
