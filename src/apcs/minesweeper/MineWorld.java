package apcs.minesweeper;

import info.gridworld.actor.Actor;
import info.gridworld.actor.ActorWorld;
import info.gridworld.grid.Grid;

import info.gridworld.grid.Location;
import java.util.ArrayList;

public class MineWorld extends ActorWorld {
    private static int hidden;
    private static boolean game;

    public MineWorld() {
        super();
        game = false;
        hidden = (int) (getGrid().getNumCols() * getGrid().getNumRows() * .9);

    }

    public MineWorld(Grid<Actor> g) {
        super(g);
        game = false;
        hidden = (int) (getGrid().getNumCols() * getGrid().getNumRows() * .9);
    }

    public boolean locationClicked(Location loc) {
        if (game == true) {
            this.setMessage("GAME OVER!");
            return true;
        }
        Actor inst = getGrid().get(loc);
        if (inst instanceof Mine) {
            game = true;
            ((Mine) inst).setShow(true);
            this.setMessage("GAME OVER!");

        }
        if (inst instanceof Cell) {
            int amoun = 0;
            ArrayList<Actor> all = getGrid().getNeighbors(loc);
            for (int a = 0; a < all.size(); a++) {
                if (all.get(a) instanceof Mine) {
                    amoun++;
                }
            }
            ((Cell) inst).setCount(amoun);
            if (amoun == 0) {
                ArrayList<Actor> ava = getGrid().getNeighbors(loc);
                for (int a = ava.size() - 1; a > -1; a--) {
                    if (ava.get(a) instanceof Mine) {
                        ava.remove(a);
                    }
                    if (ava.get(a) instanceof Cell) {
                        if (((Cell) (ava.get(a))).getCount() >= 0) {
                            ava.remove(a);
                        }
                    }
                }
                for (int b = 0; b < ava.size(); b++) {
                    locationClicked(ava.get(b).getLocation());
                }
            }
                this.setMessage("Remaining Squares: " + hidden);
                hidden--;
            }
            return true;
        }

    }
