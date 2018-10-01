package apcs.gridWorld;

import java.awt.Color;

import info.gridworld.actor.Actor;

public class MyActor extends Actor {
	public String toString () {
		return super.toString() + "Hi, I'm a \"MyActor\"!";
	}
	public MyActor () {
		super ();					// must come first!
		setColor (Color.RED);
}

}
