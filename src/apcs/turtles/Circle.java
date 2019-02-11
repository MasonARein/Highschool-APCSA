package apcs.turtles;

import TurtleGraphics.Pen;

import static java.lang.Math.PI;

public class Circle implements Shape {
    protected double xPos;
    protected double yPos;
    protected double radius;
    public Circle (double x, double y, double r) {
        this.xPos = x;
        this.yPos = y;
        this.radius = r;
    }
    public Circle () {
        this.xPos = 0;
        this.yPos = 0;
        this.radius = 50;
    }
    @Override
    public double area() {
        return PI * radius * radius;
    }

    @Override
    public void draw(Pen p) {
        p.up();
        p.move(xPos, yPos);
        p.setDirection(90);
        p.move(radius);
        p.turn(90);
        p.down();
        for(int g = 0; g < 360; g++){
            p.move((2*PI*radius)/360);
            p.turn(1);
        }
        p.up();
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
        radius = radius * factor;
    }
    public String toString (){
        String str;
        str = "Rect Center=(" + xPos + ", " + yPos + "); radius=" + radius + ";";
        return str;
    }
}
