package apcs.turtles;

import TurtleGraphics.Pen;

public class Bullseye extends Circle {
    protected int rings;
    public Bullseye () {
        this.xPos = 0;
        this.yPos = 0;
        this.radius = 50;
        this.rings = 4;
    }
    public Bullseye (double x, double y, double r, int ri) {
         super(x,y,r);
         this.rings = ri;
    }
    public void draw(Pen p) {
        double decrease = radius/rings;
        for(int y = 0; y < rings; y++ ){
            super.draw(p);
            radius = radius - decrease;
            p.down();
        }
    }
}
