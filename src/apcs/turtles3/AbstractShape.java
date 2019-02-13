package apcs.turtles3;

import TurtleGraphics.Pen;

public abstract class AbstractShape implements Shape {
    protected double xPos;
    protected double yPos;
    public final void move(double xPos, double yPos) {
        this.xPos = xPos;
        this.yPos = yPos;
    }
    @Override
    public final double getXPos() {
        return xPos;
    }

    @Override
    public final double getYPos() {
        return yPos;
    }
    public abstract void draw(Pen p);
    public abstract String toString();
}
