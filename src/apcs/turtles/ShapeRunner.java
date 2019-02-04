package apcs.turtles;

import TurtleGraphics.Pen;
import TurtleGraphics.StandardPen;

public class ShapeRunner {
    public static void main (String[] argv) {
        Pen p1 = new StandardPen();		// create a Pen to use to draw multiple Rects
        Rect r1 = new Rect (0.0, 0.0, 10.0, 20.0); 	// create a new Rect
        r1.draw (p1);					// draw initial rectangle to the Pen
        r1.stretchBy (10.0);				// scale it to be 10x larger
        r1.draw (p1);					// draw it again (now shows 2 rectangles)
        r1.move (100.0, 100.0);			// move it to a new centerpoint
        r1.draw (p1);					// draw it a third time
        p1.up();					// lift Pen
        p1.move(-100, -100);				// move Pen to below the rectangles
        p1.drawString(""+r1);				// invoke Rect's toString - display it
        p1.move(-100, -115);				// move down
        p1.drawString(""+r1.area());			// display the Rect's area
        Pen p2 = new StandardPen ();		// Create a separate Pen window
        Circle c1 = new Circle (0.0, 0.0, 10.0); 	// Create a Circle instance
        c1.draw (p2);					// Draw the Circle with p2
        c1.stretchBy (10.0);
        c1.draw (p2);
        c1.move (100.0, 100.0);
        c1.draw (p2);
        p2.up();
        p2.move(-100, -100);
        p2.drawString(""+c1);
        p2.move(-100, -115);
        p2.drawString(""+c1.area());
        Pen p3 = new StandardPen ();
        Trifoil t1 = new Trifoil(0,0,100);
        t1.draw(p3);
        Pen p4 = new StandardPen ();
        Sun s1 = new Sun(0,0,300, 1.9);
        s1.draw(p4);
    }

}
