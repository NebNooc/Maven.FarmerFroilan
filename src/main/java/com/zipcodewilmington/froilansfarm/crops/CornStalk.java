package com.zipcodewilmington.froilansfarm.crops;

import com.zipcodewilmington.froilansfarm.edibles.Corn;
import com.zipcodewilmington.froilansfarm.interfaces.Produces;

import java.util.Arrays;

public class CornStalk implements Produces {

    private Boolean hasBeenFertilized;

    public CornStalk(){
        this.hasBeenFertilized = false;
    }

    public Corn[] yield(){
        if(hasBeenFertilized){
            int yieldAmount = (int)(Math.random() * ((2 - 1) + 1)) + 1;
            Corn[] yieldGroup = new Corn[yieldAmount];
            Arrays.fill(yieldGroup, new Corn());
            return yieldGroup;
        }
        return null;
    }


    //getter and setter
    public Boolean getHasBeenFertilized() {
        return hasBeenFertilized;
    }

    public void setHasBeenFertilized(Boolean hasBeenFertilized) {
        this.hasBeenFertilized = hasBeenFertilized;
    }
}
