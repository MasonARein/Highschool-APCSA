package apcs.turtles;

import TurtleGraphics.*;

public class TurtleRunner {
    public static void main(String[] args){
        StandardPen pen = new StandardPen();
        int x = 25;
        int y =50;
        for(int b = 0; b < 9; b++){
        pen.up();
        pen.move(25);
        pen.turn(90);
        pen.move(x);
        pen.down();
        for(int a = 0; a < 4;a++){
            pen.turn(90);
            pen.move(y);
        }
        x = x + 50;
        y =y + 50;
        }
        WigglePen pen2 = new WigglePen();
        int a = 25;
        int b = 50;
        int c = 22;
        for(int d = 0; d < 7; d++) {
            pen2.up();
            pen2.move(c);
            pen2.turn(90);
            pen2.move(a);
            pen2.down();
            for (int f = 0; f < 3; f++) {
                pen2.turn(120);
                pen2.move(b);
            }
            a = a + 22;
            b = b + 50;
            c = (int)(.433 * b);
        }
        RainbowPen pen3 = new RainbowPen();
        pen3.up();
        pen3.move(50);
        pen3.turn(162);
        pen3.down();
        for(int h = 0; h < 5; h++){
            pen3.move(100);
            pen3.turn(144);
        }

    }
}
