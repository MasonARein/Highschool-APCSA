package apcs.petriDish;

import info.gridworld.actor.Actor;

import java.awt.*;

public class Amoeba extends Actor {
    private double probDie;
    private double probSplit;
    private int slimeLife;

    public Amoeba(Color color, double probDie, double probSplit){
        this.setColor(color);
        this.probDie = probDie;
        this.probSplit = probSplit;
    }

    public void Act(){
        double chance = Math.random();
        if(chance <= probDie){
            removeSelfFromGrid();
        }
        else if(chance <= probDie+probSplit){
            
        }
        else{

        }

    }
}
