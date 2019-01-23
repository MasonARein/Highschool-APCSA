package apcs.petriDish;

import info.gridworld.actor.Actor;

import java.awt.*;

public class Slime extends Actor {
    private int lifeTime;
    private int redReduce;
    private int blueReduce;
    private int greenReduce;
    public Slime(Color color, int lifeTime){
        this.lifeTime = lifeTime;
        this.setColor(color);
        if(lifeTime > 0) {
            redReduce = (255 - getColor().getRed()) / lifeTime;
            blueReduce = (255 - getColor().getBlue()) / lifeTime;
            greenReduce = (255 - getColor().getGreen()) / lifeTime;
        }
        else{
            redReduce = (255 - getColor().getRed());
            blueReduce = (255 - getColor().getBlue());
            greenReduce = (255 - getColor().getGreen());
        }
    }
    public void act() {
        lifeTime = lifeTime - 1;
        if(lifeTime <= 0){
            removeSelfFromGrid();
        }
        this.setColor(new Color(this.getColor().getRed()+redReduce,this.getColor().getGreen()+greenReduce,this.getColor().getBlue()+blueReduce));
    }
}
