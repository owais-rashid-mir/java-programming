//Winter assignment question Q7 - 2nd sem.
package operator_input1;

import java.util.Scanner;

public class Oi1 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a character:");
        String ch = input.nextLine();
        
        switch(ch) {
        case "+":
        	System.out.println("Addition arithemetic Java operator.");
        	break;
        	
        case "-":
        	System.out.println("Subtraction arithemetic Java operator.");
        	break;
        	
        case "*":
        	System.out.println("Multiplication arithemetic Java operator.");
        	break;
        	
        case "/":
        	System.out.println("Division arithemetic Java operator.");
        	break;
        	
        case "++":
        	System.out.println("Increment arithemetic Java operator.");
        	break;
        	
        case "--":
        	System.out.println("Decrement arithemetic Java operator.");
        	break;
        	
        case "==":
        	System.out.println("'Equal To' relational Java operator.");
        	break;
        	
        case "!=":
        	System.out.println("'Not Equal To' relational Java operator.");
        	break;
        	
        case ">":
        	System.out.println("'Greater Than' relational Java operator.");
        	break;
        	
        case "<":
        	System.out.println("'Less Than' relational Java operator.");
        	break;
        	
        case ">=":
        	System.out.println("'Greater Than or Equal To' relational Java operator.");
        	break;
        	
        case "<=":
        	System.out.println("'Less Than or Equal To' relational Java operator.");
        	break;
        	
        default:
        	System.out.println("The entered character is not any relational or arithemetic operator");
        } //End of switch
		
	}

}
