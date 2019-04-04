package apcs.gw4;

import info.gridworld.actor.Actor;
import info.gridworld.actor.ActorWorld;
import info.gridworld.grid.BoundedGrid;
import info.gridworld.grid.Grid;

import java.awt.*;

public class ChameleonRunner {
    public static void main(String[] args) {
        Grid<Actor> grid = new BoundedGrid<Actor>(10, 10);
        ActorWorld world = new ActorWorld(grid);
        world.add(new ChameleonCritter());
        Actor gi = new Actor();
        Actor gl = new Actor();
        Actor gv = new Actor();
        gi.setColor(Color.RED);
        world.add(gi);
        gl.setColor(Color.GREEN);
        world.add(gl);
        gv.setColor(Color.BLUE);
        world.add(gv);
        world.show();
    }
}
