package apcs.gw3;

import info.gridworld.actor.Bug;
import info.gridworld.actor.Flower;
import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;
import info.gridworld.actor.Actor;

//Take note that this bug operates similar to dancing bug to prevent inf loops


public class Jumper extends Bug{

    private int direct;

    public Jumper(){

        direct = 0;
        setDirection(Location.EAST);
    }

    public void jump()
    {
        Grid<Actor> gr = getGrid();
        if (gr == null)
            return;
        Location loc = getLocation();
        Location next = loc.getAdjacentLocation(getDirection());
        Location link = next.getAdjacentLocation(getDirection());
        if (gr.isValid(link))
            moveTo(link);
        else
            removeSelfFromGrid();
    }

    public boolean canMove()
    {
        Grid<Actor> gr = getGrid();
        if (gr == null)
            return false;
        Location loc = getLocation();
        Location next = loc.getAdjacentLocation(getDirection());
        Location link = next.getAdjacentLocation(getDirection());
        if (!gr.isValid(link))
            return false;
        Actor neighbor = gr.get(link);
        return (neighbor == null) || (neighbor instanceof Flower);
// ok to move into empty location or onto flower
// not ok to move onto any other actor
    }

    public void act()
    {
        direct = (int)((Math.random() * 180)-90);
        setDirection(getDirection() + direct);
        if (canMove())
        {
            jump();

        }
        else {
            setDirection(getDirection() + 90);
        }
    }
}

