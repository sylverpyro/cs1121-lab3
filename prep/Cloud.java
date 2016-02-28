import java.awt.*;

public class Cloud extends Animator{

    public void draw(int clock, Graphics g) {

	// draw the sun
	
	g.setColor(Color.yellow);
	g.fillOval(10,20,40,40);

	// draw the cloud

	g.setColor(Color.gray);
	g.fillOval((clock*2)%650-50,30,50,20);

        } // end of draw method

    } // end of Cloud class
