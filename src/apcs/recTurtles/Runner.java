package apcs.recTurtles;

import TurtleGraphics.Pen;
import TurtleGraphics.RainbowPen;
import TurtleGraphics.SketchPadWindow;
import TurtleGraphics.StandardPen;

public class Runner {
    public static void main (String[] argv) {
        SketchPadWindow a = new SketchPadWindow(500, 500);
        Pen p1 = new RainbowPen();
        spike(p1, 500);
    }
    public static void spiral(Pen p, int dist) {
        if (dist > 0) {
            p.move(dist);
            p.turn(45);
            spiral(p, dist - 1);
        }
    }
    public static void zigzag(Pen p, int dist) {
        if (dist > 0) {
            p.setDirection(-88);
            p.move(dist);
            p.turn(176);
            p.move(dist-1);
            zigzag(p, dist - 2);
        }
    }
    public static void triangle(Pen p, int dist) {
        if (dist > 0) {
                p.move(dist);
                p.turn(120);
            triangle(p, dist - 1);
        }
    }
    public static void circle(Pen p, double dist) {
        if (dist > 0) {
            p.move(dist);
            p.turn(2*dist);
            circle(p, dist - 0.1);
        }
    }
    public static void spike(Pen p, int dist) {
        if (dist > 0) {
            p.move(dist);
            p.turn(170);
            spike(p, dist - 1);
        }
    }

}

