package apcs.gw4;

import info.gridworld.actor.Actor;


import java.util.ArrayList;

public class RockHound extends Critter {
    public void processActors(ArrayList<Actor> actors)
    {
        for (Actor a : actors)
        {
            if (!(a instanceof Critter))
                a.removeSelfFromGrid();
        }
    }
}
