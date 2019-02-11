package apcs.turtles;

import TurtleGraphics.Pen;

public class Rect implements Shape {
    protected double xPos;
    protected double yPos;
    protected double height;
    protected double width;

    public Rect(){
        this.xPos = 0;
        this.yPos = 0;
        this.width = 1.0;
        this.height = 1.0;
    }
    public Rect (double x, double y, double h, double w) {
        this.xPos = x;
        this.yPos = y;
        this.height = h;
        this.width = w;
    }
        @Override
    public double area() {
        return height * width;
    }

    @Override
    public void draw(Pen p) {
        p.up();
        p.move(xPos, yPos);
        p.setDirection(0);
        p.move(width/2);
        p.turn(90);
        p.move(height/2);
        p.down();
        for(int x = 0; x < 2; x++){
            p.turn(90);
            p.move(width);
            p.turn(90);
            p.move(height);
        }
        p.up();
        p.move(xPos, yPos);
        p.setDirection(0);
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
        width = this.width * factor;
        height = this.height * factor;
    }
    public String toString (){
        String str;
        str = "Rect Center=(" + xPos + ", " + yPos + "); height=" + height + "; width="+ width + ";";
        return str;
    }
}
