package apcs.gridWorld;

import info.gridworld.actor.Actor;
import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Bug;
import info.gridworld.grid.BoundedGrid;
import info.gridworld.grid.Grid;

public class Exersises {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Grid<Actor> grid = new BoundedGrid<Actor>(100, 100);
		ActorWorld world = new ActorWorld (grid);
		world.add(new CircleBug(5));
		world.add(new SpiralBug(5));
		world.add(new ZBug(5));
		world.add(new DancingBug());
		world.add(new ZigZagBug(4));
		Bug buggy = new Bug();
		world.show();
	}

}
