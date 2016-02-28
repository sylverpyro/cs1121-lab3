import java.awt.*;

public class Rock extends Animator{

    public void draw(int clock, Graphics g) {

	// the rocks

	//rock 1
	g.setColor(Color.black);
	g.fillOval(50,(clock*4)%230-35,30,30);

	//rock 2, 10 up and 80 to the right
	g.setColor(Color.black);
	g.fillOval(130,(clock*4-10)%230-35,30,30);

        } // end of draw method

    } // end of Rock class
