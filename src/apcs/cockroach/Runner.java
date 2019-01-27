package apcs.cockroach;

import info.gridworld.actor.Actor;
import info.gridworld.actor.Rock;
import info.gridworld.grid.Grid;
import info.gridworld.grid.BoundedGrid;
import info.gridworld.actor.ActorWorld;


public class Runner {
    public static void main(String[] args) {
        Grid<Actor> grid = new BoundedGrid<Actor>(25, 40);
        CockroachWorld world = new CockroachWorld(grid);
        for(int i = 0; i < 80; i++){
            world.add(new Rock());
        }
        for(int i = 0; i < 30; i++){
            world.add(new Cockroach());
        }
        world.show();
    }
}
