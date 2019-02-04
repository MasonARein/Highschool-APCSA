package apcs.turtles;

import TurtleGraphics.Pen;
import TurtleGraphics.RainbowPen;
import TurtleGraphics.StandardPen;
import TurtleGraphics.WigglePen;

import java.awt.*;

public class TurtleRunner2 {
    public static void main(String[] args){
        RainbowPen p1 = new RainbowPen();
        drawSquare (90, new Color(50,200,190), p1);
        drawSquare (125, Color.YELLOW, p1);
        drawSquare (160, Color.GREEN, p1);
    }
    private static void drawSquare (double side, Color col, Pen p) {
        p.setColor(col);
        p.up();
        p.move(side/2);
        p.turn(90);
        p.move(side/2);
        p.down();
        for(int a = 0; a < 4; a++){
            p.turn(90);
            p.move(side);
        }
        p.home();
    }
}
