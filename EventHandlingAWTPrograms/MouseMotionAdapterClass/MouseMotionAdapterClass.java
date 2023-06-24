// importing the necessary libraries  
import java.awt.*;    
import java.awt.event.*;   

// class which inherits the MouseMotionAdapter class  
public class MouseMotionAdapterClass extends MouseMotionAdapter {     
	// object of Frame class  
    Frame f;  
    
    // class constructor  
    MouseMotionAdapterClass() {    
    	// creating the frame with the title  
        f = new Frame ("Mouse Motion Adapter");    
        
        // adding MouseMotionListener to the Frame  
        f.addMouseMotionListener(this);    
        
        // setting the size, layout and visibility of the frame  
        f.setSize (300, 300);    
        f.setLayout (null);    
        f.setVisible (true);    
    }    // End of MouseMotionAdapterClass()
    
	// overriding the mouseDragged() method   
	public void mouseDragged (MouseEvent e) {    
		// creating the Graphics object and fetching them from the Frame object using getGraphics() method  
	    Graphics g = f.getGraphics();    
	    // setting the color of graphics object  
	    g.setColor (Color.ORANGE);    
	    // setting the shape of graphics object  
	    g.fillOval (e.getX(), e.getY(), 20, 20);    
	}	//End of mouseDragged()   
	
	public static void main(String[] args) {    
		new MouseMotionAdapterClass();    
	}   
	
	
}	// End of MouseMotionAdapterClass