package apcs.gw4;

import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Bug;
import info.gridworld.actor.Critter;
import info.gridworld.actor.Rock;
import info.gridworld.grid.BoundedGrid;
import info.gridworld.grid.Grid;

public class CritterRunner {
    public static void main(String[] args) {
        Grid g = new BoundedGrid(50, 50);
        ActorWorld world = new ActorWorld(g);
        for (int a = 0; a < 20; a++) {
            world.add(new Critter());
            world.add(new Bug());
            world.add(new Rock());
            world.add(new Rock());
        }
        world.show();
    }

}
