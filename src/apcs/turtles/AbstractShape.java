package apcs.turtles;

public abstract class AbstractShape implements Shape {
    protected double xPos;
    protected double yPos;
    public void move(double xPos, double yPos) {
        this.xPos = xPos;
        this.yPos = yPos;
    }
    @Override
    public double getXPos() {
        return xPos;
    }

    @Override
    public double getYPos() {
        return yPos;
    }
}
