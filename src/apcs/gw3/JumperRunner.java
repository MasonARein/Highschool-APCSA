package apcs.gw3;

import info.gridworld.actor.Actor;
import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Bug;
import info.gridworld.actor.Rock;
import info.gridworld.grid.BoundedGrid;
import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;

public class JumperRunner {
    public static void main(String[] args) {
        Grid<Actor> grid = new BoundedGrid<Actor>(100, 100);
        ActorWorld world = new ActorWorld(grid);
        for(int i = 0; i < grid.getNumRows(); i++){
            for(int j = 0; j < grid.getNumCols(); j++){
                double m = Math.random();
                if(m < 0.3){
                    world.add(new Location(i, j), new Rock());
                }
            }
        }
        world.add(new Jumper());
        Bug buggy = new Bug();
        world.show();
    }
}
