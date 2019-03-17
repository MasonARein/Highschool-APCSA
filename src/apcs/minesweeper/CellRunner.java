package apcs.minesweeper;

import info.gridworld.actor.ActorWorld;

public class CellRunner {
    public static void main(String[] args) {
        MineWorld w = new MineWorld();
        w.add(new Cell());
        w.show();
    }
}
