package apcs.turtles;

import TurtleGraphics.Pen;

public class Trifoil implements Shape {
    private double xPos;
    private double yPos;
    private double size;
    public Trifoil () {
        this.xPos = 0;
        this.yPos = 0;
        this.size = 150;
    }
    public Trifoil (double x, double y, double s) {
        this.xPos = x;
        this.yPos = y;
        this.size = s;
    }
    @Override
    public double area() {
        return 0;
    }

    @Override
    public void draw(Pen p) {
        p.up();
        p.move(xPos, yPos);
        p.setDirection(90);
        p.move(1.25 * size);
        p.setDirection(220);
        p.down();
        for(int t = 0; t < 3; t++){
            for(int f = 0; f < 160; f++){
                p.move(1*size/100);
                p.turn(1);
            }
            p.turn(80);
        }
        p.up();
        p.move(xPos, yPos);
        p.setDirection(90);
        p.move(1.1 * size);
        p.setDirection(220);
        p.down();
        for(int t = 0; t < 3; t++){
            for(int f = 0; f < 160; f++){
                p.move(1*size/130);
                p.turn(1);
            }
            p.turn(80);
        }
    }

    @Override
    public double getXPos() {
        return xPos;
    }

    @Override
    public double getYPos() {
        return yPos;
    }

    @Override
    public void move(double xPos, double yPos) {
        this.xPos = xPos;
        this.yPos = yPos;
    }

    @Override
    public void stretchBy(double factor) {
        size = size * factor;
    }
    public String toString (){
        String str;
        str = "Rect Center=(" + xPos + ", " + yPos + "); Size=" + size + ";";
        return str;
    }
}
