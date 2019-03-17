package apcs.minesweeper;

import info.gridworld.actor.Actor;
import info.gridworld.actor.ActorWorld;
import info.gridworld.grid.Grid;

import info.gridworld.grid.Location;
import java.util.ArrayList;

public class MineWorld extends ActorWorld {
    private static int hidden;
    private static boolean game;
    public MineWorld(){
        game = false;
        hidden =(int)( getGrid().getNumCols() * getGrid().getNumRows() * .9);

    }
    public MineWorld(Grid<Actor> g){
        super(g);
        game = false;
    }
    public boolean locationClicked(Location loc){
        if(game == true)
            return true;
        Actor inst = getGrid().get(loc);
        if(inst instanceof Mine){
            game = true;
            ((Mine) inst).setShow(true);
        }
        if(inst instanceof Cell){
            int amoun = 0;
            ArrayList<Actor> all = getGrid().getNeighbors(loc);
            for(int a = 0; a < all.size(); a++){
                if( all.get(a) instanceof Mine){
                    amoun++;
                }
            }
            ((Cell) inst).setCount(amoun);
            if(amoun == 0){
                ArrayList<Location> ava = getGrid().getValidAdjacentLocations(loc);
                for(int a = 0; a < all.size(); a++){
                    locationClicked(ava.get(a));
                }
                int
            }
        }
        return true;
    }

}
