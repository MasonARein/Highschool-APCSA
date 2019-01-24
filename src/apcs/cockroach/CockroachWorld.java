package apcs.cockroach;

import info.gridworld.actor.Actor;
import info.gridworld.actor.ActorWorld;
import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;

public class CockroachWorld extends ActorWorld {


    public CockroachWorld (Grid<Actor> grid) {
        super (grid);
    }
    public boolean keyPressed(String description, Location loc)	 {
        Cockroach.changeCorner();
        if (Cockroach.getScatter() == true) {
            Cockroach.setScatter (false);
        }
        else {
            Cockroach.setScatter (true);
        }
        return true;
    }


}
