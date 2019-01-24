package apcs.cockroach;

import info.gridworld.actor.Actor;
import info.gridworld.actor.Bug;
import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;


import java.awt.*;
import java.util.ArrayList;

public class Cockroach extends Bug {
    private static boolean scatter = false;
    private static double yax = Math.random();
    private static double xax = Math.random();
    public static void changeCorner(){
        yax = Math.random();
        xax = Math.random();
    }
    public static boolean getScatter() {
        return Cockroach.scatter;
    }
    public static void setScatter(boolean scatter) {
        Cockroach.scatter = scatter;
    }
    public void move() {
        Grid<Actor> gr = this.getGrid();
        if (gr != null) {
            Location loc = this.getLocation();
            Location next = loc.getAdjacentLocation(this.getDirection());
            if (gr.isValid(next)) {
                this.moveTo(next);
            } else {
                this.removeSelfFromGrid();
            }
        }
    }
    public void act(){
        Grid<Actor> gr = this.getGrid();
        if (Cockroach.getScatter() == true) {

            this.setColor (Color.ORANGE);
            Location loc = getLocation();
            ArrayList <Location> ava = gr.getEmptyAdjacentLocations(loc);
            int rand = (int)(Math.random() * ava.size());
            if(rand != 0){
                Location next = ava.get(rand);
                int direct = loc.getDirectionToward(next);
                this.setDirection(direct);
                if (gr.isValid(next)) {
                    this.moveTo(next);
                }
            }
        }
        else {
            this.setColor (Color.RED);
            Location loc = getLocation();
            Location goal;
           if(yax >= .5){
               if(xax >= .5){
                   goal = new Location(24,39);
              }
               else{
                goal = new Location(0,39);
              }
           }
           else{
                if(xax >= .5){
                    goal = new Location(24,0);
               }
               else{
                    goal = new Location(0,0);
               }
           }
            int direct = loc.getDirectionToward(goal);
            ArrayList <Location> cvc = gr.getEmptyAdjacentLocations(loc);
            int directAva = 359;
            Location next = null;
            for(int i = 0; i < cvc.size(); i++){
                if(Math.abs(direct - loc.getDirectionToward(cvc.get(i))) < directAva){
                    directAva = Math.abs(direct - loc.getDirectionToward(cvc.get(i)));
                    next = cvc.get(i);
                }
            }
            if(next != null) {
                this.moveTo(next);
                this.setDirection(loc.getDirectionToward(next));
            }
        }

    }

}
