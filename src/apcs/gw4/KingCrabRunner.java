package apcs.gw4;

import info.gridworld.actor.Actor;
import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Rock;
import info.gridworld.grid.BoundedGrid;
import info.gridworld.grid.Grid;

public class KingCrabRunner {
    public static void main(String[] args) {
        Grid<Actor> grid = new BoundedGrid<Actor>(10, 10);
        ActorWorld world = new ActorWorld(grid);
        for(int v = 0; v < 20; v++){
            world.add(new Rock());
        }
        world.add(new KingCrab());
        world.show();
    }
}
