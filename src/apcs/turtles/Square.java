package apcs.turtles;

public class Square extends Rect {
    public Square(){
        this.xPos = 0;
        this.yPos = 0;
        this.height = 1.0;
        this.width = 1.0;
    }
    public Square (double x, double y, double h) {
        super(x,y,h,h);

    }
}
