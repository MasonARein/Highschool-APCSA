package apcs.minesweeper;

import info.gridworld.actor.Actor;

public class Mine extends Actor {
    private static boolean show;
    public Mine(){
        show = false;
        setColor(null);
    }

    @Override
    public void act() {
    }

    public static void setShow(boolean boom){
        show = boom;
    }
    public String toString(){
        return "";
    }
    public String getImageSuffix() {
        if (show == true)
            return "-show";
        return "-hide";

    }

}
