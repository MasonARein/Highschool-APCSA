package apcs.turtles;

import TurtleGraphics.Pen;

public class Sun implements Shape {
    private double xPos;
    private double yPos;
    private double size;
    private double complexity;
    public Sun(double x, double y, double s, double c) {
        this.xPos = x;
        this.yPos = y;
        this.size = s;
        this.complexity = c;
    }
    public Sun() {
        this.xPos = 0;
        this.yPos = 0;
        this.size = 150;
        this.complexity = 1.3;
    }
    @Override
    public double area() {
        return 2.5980762113 * size * size;
    }

    @Override
    public void draw(Pen p) {
        p.up();
        p.move(xPos, yPos);
        p.setDirection(0);
        p.move(.42261826 * size);
        p.down();
        for(int x = 0; x < 1000; x++){
            double v = 50;
            v = (v * complexity);
            p.turn(v);
            p.move(size);

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
}
