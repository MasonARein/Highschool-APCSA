package apcs.turtles;

import TurtleGraphics.Pen;
import TurtleGraphics.StandardPen;

public class ExtTester {
    public static void main (String[] argv) {
        Pen p1 = new StandardPen();
        Wheel w1 = new Wheel (0.0, 0.0, 10., 8);
        w1.draw (p1);
        w1.stretchBy (10.0);
        w1.draw (p1);
        w1.move (100.0, 100.0);
        w1.draw (p1);
        System.out.println (w1 + " " + w1.area());
        Pen p2 = new StandardPen ();
        Square s1 = new Square (0.0, 0.0, 20.0);
        s1.draw (p2);
        s1.stretchBy (10.0);
        s1.draw (p2);
        s1.move (100.0, 100.0);
        s1.draw (p2);
        System.out.println (s1 + " " + s1.area());
        Pen p3 = new StandardPen ();
        Bullseye b1 = new Bullseye (0.0, 0.0, 80.0, 7);
        b1.draw(p3);

    }

}
