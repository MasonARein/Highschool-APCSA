package apcs.turtles3;

import TurtleGraphics.Pen;

import static java.lang.Math.PI;

public class Circle extends AbstractShape {
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
    public void stretchBy(double factor) {
        radius = radius * factor;
    }
    public String toString (){
        String str;
        str = "Circle Center=(" + xPos + ", " + yPos + "); radius=" + radius + ";";
        return str;
    }
}
