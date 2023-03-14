import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int[][] rollSub = new int[5][4];
		
		
		for(int i=0 ; i<5 ; i++) {
			for(int j =0; j<4 ; j++) {
				//System.out.println("Roll number of" +" Student "+i +" :");
				//System.out.println("enter roll no. and lec delivered:");
				rollSub[i][j] = input.nextInt();
			}
		}
		
		for(int i=0 ; i<5 ; i++) {
			for(int j =0; j<4 ; j++) {
				//System.out.println("Roll number of" +" Student "+i +" :");
				System.out.print(rollSub[i][j] + " ");
				
			}
			System.out.println();
		}
		
		

		
		
	}
}

/* public static void main(String[] args) {

Scanner input = new Scanner(System.in);
int[] rollno = new int[6]; //rollno of 5 students. count(i) starts from 1.
double[] ld = new double[5];  //lec deliv in 4 sub. count(i) starts from 1.
double[] la = new double[5];  //lec atten.
double[] attPer = new double[5]; //attendance %age.

System.out.println("Enter the roll numbers of 5 students:");
for(int i=1 ; i<rollno.length ; i++) {
	System.out.println("Roll number of" +" Student "+i +" :");
	rollno[i] = input.nextInt();
}

System.out.println();
System.out.println("Enter the lectures deliverd in 4 subjects:");
for(int i=1 ; i<ld.length ; i++) {
	System.out.println("Lec delivered in" +" Subject "+i +" :");
	ld[i] = input.nextDouble();
}

System.out.println();
System.out.println("Enter the lectures attended in 4 subjects:");
for(int i=1 ; i<la.length ; i++) {
	System.out.println("Lec attended in" +" Subject "+i +" :");
	la[i] = input.nextDouble();
}

System.out.println();
for(int i= 1 ; i<attPer.length ; i++) {
attPer[i] = (la[i]/ld[i])*100.0;
//System.out.println(shortagePer[i]);
System.out.print("Roll no:" + rollno[i] + "\t");
System.out.print("Lec delivered:" + ld[i] + "\t");
System.out.print("Lec delivered:" + la[i] + "\t");
System.out.print("%age of attendance:" + attPer[i] + "\t");
System.out.println();
}


} */