package apcs.recTurtles;

import TurtleGraphics.*;

import java.awt.*;
import java.util.Scanner;

public class KochRunner {
    public static void main (String[] argv) {
        Scanner reader = new Scanner(System.in);
        Pen p1;
        System.out.println("Select type of Pen: Standard-1, Rainbow-2, Wiggle-3");
        int intake = reader.nextInt();
        if(intake == 2){
            p1 = new RainbowPen();
        }
        else if(intake == 3){
            p1 = new WigglePen();
        }
        else{
            p1 = new StandardPen();
        }
        System.out.println("Input length(0-600):");
        int lena = reader.nextInt();
        System.out.println("Input compexity(0-10):");
        int dega = reader.nextInt();

        p1.up();
        p1.setDirection(90);
        p1.move(lena/2);
        p1.turn(90);
        p1.move(lena /2);
        p1.turn(180);
        p1.down();
        for(int b =0; b < 3; b++){
            drawKochCurve(p1, lena, dega);
            p1.turn(-120);
        }
        Pen p2;
        System.out.println("Select type of Pen: Standard-1, Rainbow-2, Wiggle-3");
        int intak = reader.nextInt();
        if(intak == 2){
            p2 = new RainbowPen();
        }
        else if(intak == 3){
            p2 = new WigglePen();
        }
        else{
            p2 = new StandardPen();
        }
        System.out.println("Input length(0-600):");
        int lenb = reader.nextInt();
        System.out.println("Input compexity(0-20):");
        int degb = reader.nextInt();
        p2.up();
        p2.setDirection(180);
        p2.move(lenb/2);
        p2.setDirection(-1*(45 * degb) % 360);
        p2.down();
        drawDragonCurve(p2, lenb, degb, 1);
    }
    public static void drawKochCurve (Pen p, double  len, int deg){
        if(deg == 0){
            p.move(len);
        }
        else{
                drawKochCurve(p, len / 3, deg - 1);
                p.turn(60);
                drawKochCurve(p, len / 3, deg - 1);
                p.turn(-120);
                drawKochCurve(p, len / 3, deg - 1);
                p.turn(60);
                drawKochCurve(p, len / 3, deg - 1);


        }
    }
    public static void drawDragonCurve (Pen p, double len, int deg, int v){
        if(deg == 0){
            p.move(len);
        }
        else {
            p.setColor(Color.YELLOW);
            drawDragonCurve(p, len * 0.70710678118, deg - 1, 1);
            p.turn(90 * v);
            p.setColor(Color.BLUE);
            drawDragonCurve(p, len * 0.70710678118, deg - 1, -1);
        }
    }
}
