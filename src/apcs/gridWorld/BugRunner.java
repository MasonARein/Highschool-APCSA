package apcs.gridWorld;

import info.gridworld.actor.Actor;
import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Bug;
import info.gridworld.actor.Rock;
import info.gridworld.grid.BoundedGrid;
import info.gridworld.grid.Grid;

public class BugRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Grid<Actor> grid = new BoundedGrid<Actor>(100, 100);
		ActorWorld world = new ActorWorld (grid);
		MyActor tim = new MyActor ();
		world.add (tim);
		world.add(new LeftyBug());
		world.add(new BoxBug(5));
		world.add(new CircleBug(5));
		Bug buggy = new Bug();
		world.add(buggy);
		Rock rocky = new Rock();
		world.add(rocky);
		world.show();

	}

}
