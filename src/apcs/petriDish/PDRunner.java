package apcs.petriDish;

import info.gridworld.actor.Actor;
import info.gridworld.actor.ActorWorld;
import info.gridworld.grid.BoundedGrid;
import info.gridworld.grid.Grid;

import java.awt.*;


public class PDRunner {
    public static void main(String[] args) {
        Grid<Actor> grid = new BoundedGrid<Actor>(20, 20);
        ActorWorld world = new ActorWorld (grid);
        world.add(new Slime(Color.GREEN, 5));
        world.add(new Amoeba(Color.GREEN, 0, 0, 10));
        world.add(new Amoeba(Color.RED, 0, 0, 10));
        world.show();
    }
}
