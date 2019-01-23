package apcs.cockroach;

import info.gridworld.actor.Actor;
import info.gridworld.grid.Location;


import java.awt.*;
import java.util.ArrayList;

public class Cockroach extends Actor {
    private static boolean scatter = false;

    public static boolean getScatter() {
        return Cockroach.scatter;
    }
    public static void setScatter(boolean scatter) {
        Cockroach.scatter = scatter;
    }
    public void act(){
        if (Cockroach.getScatter() == true) {
            this.setColor (Color.ORANGE);
            Location loc = getLocation();
            Location goal = new Location (0,0);

        }
        else {
            this.setColor (Color.RED);
            Location loc = getLocation();

        }

    }

}
