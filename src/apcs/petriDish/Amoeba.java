package apcs.petriDish;

import info.gridworld.actor.Actor;
import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;

import java.awt.*;
import java.util.ArrayList;

public class Amoeba extends Actor {
    private double probDie;
    private double probSplit;
    private int slimeLife;
    private int amoebaLife;

    public Amoeba(Color color, double probDie, double probSplit, int slimeLife, int amoebaLife){
        this.setColor(color);
        this.probDie = probDie;
        this.probSplit = probSplit;
        this.slimeLife = slimeLife;
        this.amoebaLife = amoebaLife;
    }

    private void movin() {
        Grid<Actor> gr = this.getGrid();
        if (gr != null) {
            Location loc = this.getLocation();
            ArrayList <Location> exe = gr.getEmptyAdjacentLocations(loc);
            int rand = (int)(Math.random() * exe.size());
            if(rand != 0){
                Location next = exe.get(rand);
                if (gr.isValid(next)) {
                    this.moveTo(next);
                }
                Slime slime = new Slime(this.getColor(), slimeLife);
                slime.putSelfInGrid(gr, loc);
            }
        }
    }
    private void split(){
        Grid<Actor> gr = this.getGrid();
        if (gr != null) {
            Location loc = this.getLocation();
            ArrayList <Location> exe = gr.getEmptyAdjacentLocations(loc);
            int rand = (int)(Math.random() * exe.size());
            if(rand != 0) {
                Location next = exe.get(rand);
                Amoeba amoe = new Amoeba(this.getColor(), probDie, probSplit, slimeLife, amoebaLife);
                amoe.putSelfInGrid(gr, next);
            }
        }
    }

    public void act(){
        double chance = Math.random();
        if(chance <= probDie){
            removeSelfFromGrid();
        }
        else if(chance <= probDie+probSplit){
            split();
            //increases the chances of dying for every action other than dying
            probDie = (probDie)/amoebaLife + probDie;
        }
        else{
            movin();
            probDie = (probDie)/amoebaLife + probDie;
        }

    }
}
