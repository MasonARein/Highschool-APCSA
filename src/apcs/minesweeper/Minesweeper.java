package apcs.minesweeper;

import info.gridworld.actor.Actor;
import info.gridworld.actor.ActorWorld;
import info.gridworld.grid.BoundedGrid;
import info.gridworld.grid.Grid;

public class Minesweeper {
    public static void main(String[] args) {
            Grid<Actor> g = new BoundedGrid(15, 100);
            MineWorld w = new MineWorld(g);
            for(int a = 0; a < w.getGrid().getNumRows() * w.getGrid().getNumCols() * .05;a++){
            w.add(new Mine());
        }
        for(int b = 0; b < w.getGrid().getNumRows() * w.getGrid().getNumCols() * .95;b++){
            w.add(new Cell());
        }
        w.show();
    }
}


