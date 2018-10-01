package apcs.gridWorld;

import info.gridworld.actor.Bug;
import info.gridworld.grid.Location;

public class LeftyBug extends Bug {
		 public void turn()  {
			        setDirection(getDirection() - Location.HALF_RIGHT);
		    }
		  public String toString () {
			  return super.toString() + "Hi, I'm a lefty bug, I like socialism";
		  }

}
