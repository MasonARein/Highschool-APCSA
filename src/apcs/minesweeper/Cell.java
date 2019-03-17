
package apcs.minesweeper;

import info.gridworld.actor.Actor;
import info.gridworld.grid.Location;

import java.util.ArrayList;

public class Cell extends Actor {
    private int count;
    public Cell(){
        this.count = -1;
        setColor(null);
    }

    @Override
    public void act() {
    }

    public void setCount(int input){
        count = input;
    }

    public String toString(){
        return "" + count;
    }
    public String getImageSuffix() {
        if (count == -1)
            return "";
            return "-" + count;

    }


}
