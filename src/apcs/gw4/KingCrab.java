package apcs.gw4;

import info.gridworld.actor.Actor;
import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;

import java.util.ArrayList;

public class KingCrab extends CrabCritter {
    public void processActors(ArrayList<Actor> actors){
        for (Actor a : actors){
            if(getGrid().get(a.getLocation().getAdjacentLocation(getDirection())) == null){
                a.moveTo(a.getLocation().getAdjacentLocation(getDirection()));
            }
            else{
                a.removeSelfFromGrid();
            }
        }
    }
}

