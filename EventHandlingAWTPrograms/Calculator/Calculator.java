//GUI Calculator App using Java AWT.

import java.awt.*;
import java.awt.event.*;

public class Calculator implements ActionListener {
	//Creating a Frame
	Frame f = new Frame("Calculator");	
	
	// Adding Labels
	Label l1 = new Label("First Number: ");	 
	Label l2 = new Label("Second Number: ");
	Label l3 = new Label("Result: ");
	
	// Adding text fields
	TextField t1 = new TextField();	
	TextField t2 = new TextField();
	TextField t3 = new TextField();
	
	// Adding buttons
	Button b1 = new Button("Add");
	Button b2 = new Button("Sub");
	Button b3 = new Button("Mul");
	Button b4 = new Button("Div");
	Button b5 = new Button("Mod");
	Button b6 = new Button("Reset");
	Button b7 = new Button("Close");
	
	Calculator() {
		//Setting the coordinates and adjusting the position of buttons.
		l1.setBounds(50, 100, 100, 20);
		l2.setBounds(50, 140, 100, 20);
		l3.setBounds(50, 180, 100, 20);
		
		t1.setBounds(200, 100, 100, 20);
		t2.setBounds(200, 140, 100, 20);
		t3.setBounds(200, 180, 100, 20);
		
		b1.setBounds(50, 250, 50, 20);
		b2.setBounds(110, 250, 50, 20);
		b3.setBounds(170, 250, 50, 20);
		b4.setBounds(230, 250, 50, 20);
		b5.setBounds(290, 250, 50, 20);
		b6.setBounds(350, 250, 50, 20);
		b7.setBounds(410, 250, 50, 20);
		
		//Adding components to the frame.
		f.add(l1);
		f.add(l2);
		f.add(l3);
		
		f.add(t1);
		f.add(t2);
		f.add(t3);
		
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(b4);
		f.add(b5);
		f.add(b6);
		f.add(b7);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		b7.addActionListener(this);
		
		f.setLayout(null);
		f.setVisible(true);
		f.setSize(500, 400);
		f.setLocation(500, 200);
	}
	
	public void actionPerformed(ActionEvent e) {
		
		double n1=0, n2=0, res=0;
		
        try
        {
        	// Converting the entered text in TextField1 to Double.
            n1 = Double.parseDouble(t1.getText());
        }
        // If user types an invalid character
        catch (NumberFormatException e2) {
            t1.setText("Invalid input.");
        }
        
        try
        {
        	// Converting the entered text in TextField2 to Double.
            n2 = Double.parseDouble(t2.getText());
        }
        catch (NumberFormatException e2) {
            t2.setText("Invalid input.");
        }
		
        
        if(e.getSource() == b1)
        {
            res = n1 + n2;	//Adding
            t3.setText(String.valueOf(res));	//Display the result in TextField3
        }
        
        if(e.getSource() == b2)
        {
            res = n1 - n2;	//Subtraction
            t3.setText(String.valueOf(res));
        }
        
        if(e.getSource() == b3)
        {
            res = n1 * n2;	//Multiplication
            t3.setText(String.valueOf(res));
        }
        
        if(e.getSource() == b4)		//Division
        {
            res = n1 / n2;
            t3.setText(String.valueOf(res));
        }
        
        if(e.getSource() == b5)
        {
            res = n1 % n2;	//Modulus
            t3.setText(String.valueOf(res));
        }
        
        if(e.getSource() == b6)
        {
        	t1.setText("0");	//Reset
            t2.setText("0");
            t3.setText("0");
        }
        
        if(e.getSource() == b7)
        {
        	System.exit(0);		//Close
        }
        	
	}
	
	//Main Method
	public static void main(String[] args) {
		new Calculator();
	}
}
