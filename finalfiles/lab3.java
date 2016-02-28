// Stacy Auger, Michael Benson
// Section 10
// Lab 3

import java.awt.*;

public class lab3 extends Animator {
    
    public void draw(int clock, Graphics g) {



	//draw a gray puff of smoke that rises from top of smokestack, repeats
	g.setColor(Color.gray);
	g.fillOval(285,145-(clock)%165,15,10);

	//draw another puff of smoke ahead of the first by 20 pixels
	g.setColor(Color.gray);
	g.fillOval(290,145-(clock+20)%165,15,10);

	//draw a black 50x100 smokestack
	g.setColor(Color.black);
	g.fillRect(275,125,50,100);
	
	} // end draw method

    } // end of lab3 class
