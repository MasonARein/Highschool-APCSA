package apcs.gridWorld;

import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Bug;
import info.gridworld.actor.Rock;

public class BugRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ActorWorld world = new ActorWorld();
		Bug buggy = new Bug();
		world.add(buggy);
		Rock rocky = new Rock();
		world.add(rocky);
		world.show();

	}

}
