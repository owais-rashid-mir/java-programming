//Winter assignment question Q7 - 2nd sem.
//Works only with SINGLE_CHARACTER operators.
//See "operator_input1" java program
package operator_input2;

import java.util.Scanner;

public class Oi2 {
public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a character:");
		//String ch = input.nextLine();
		int ch=input.next().charAt(0);
		//char ch=input.next(".").charAt(0);
		
		
		if(ch == '+' ) {
			System.out.println("Addition arithemetic Java operator.");
		}
		
		else if(ch == '-') {
			System.out.println("Subtraction arithemetic Java operator.");
		}
		
		else if(ch == '*') {
			System.out.println("Multiplication arithemetic Java operator.");
		}
		
		/*else if(ch == '!=') {
			System.out.println("NOT EQUAL TO Java operator.");
		} */  //Throws an error.. can't use operators with double characters.
		
	}

}
