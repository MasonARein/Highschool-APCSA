package apcs.turtles3;

import TurtleGraphics.Pen;

public class Wheel extends Circle {

    protected int spokes;
    public Wheel() {
        this.xPos = 0;
        this.yPos = 0;
        this.radius = 50;
        this.spokes = 8;
    }
    public Wheel(double x, double y, double r, int s) {
        super(x, y, r);
        this.spokes = s;
    }
    public int getSpokes() {
        return spokes;
    }

    public void setSpokes(int spokes) {
        this.spokes = spokes;
    }
    public void draw(Pen p){
        int dire = 0;
        super.draw(p);
        p.up();
        p.move(xPos, yPos);
        p.setDirection(dire);
        p.down();
        for(int k = 0; k < spokes; k++){
            p.move(radius);
            p.up();
            p.move(xPos, yPos);
            dire = dire + 360/spokes;
            p.down();
            p.setDirection(dire);
        }
    }
    public String toString (){
        return super.toString() + " Spokes: "+ spokes;
    }

}
