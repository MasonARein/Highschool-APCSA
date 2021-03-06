package apcs.gw4;

import info.gridworld.actor.Actor;
import info.gridworld.actor.ActorWorld;
import info.gridworld.grid.BoundedGrid;
import info.gridworld.grid.Grid;
import info.gridworld.actor.Rock;

public class RockHoundRunner {
    public static void main(String[] args) {
        Grid<Actor> grid = new BoundedGrid<Actor>(10, 10);
        ActorWorld world = new ActorWorld(grid);
        for(int v = 0; v < 30; v++){
            world.add(new Rock());
        }
        world.add(new RockHound());
        world.show();
    }
}
