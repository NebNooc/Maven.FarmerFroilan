package com.zipcodewilmington.froilansfarm.crops;

import com.zipcodewilmington.froilansfarm.edibles.Grapes;
import com.zipcodewilmington.froilansfarm.interfaces.Produces;

import java.util.Arrays;

public class GrapePlants extends Crop implements Produces {

    public GrapePlants(){
        super();
    }

    public Grapes[] yield(){
        if(this.hasBeenFertilized && this.hasBeenHarvested){
            int yieldAmount = (int)(Math.random() * ((30 - 20) + 1)) + 20;
            Grapes[] yieldGroup = new Grapes[yieldAmount];
            Arrays.fill(yieldGroup, new Grapes());
            return yieldGroup;
        }
        return null;
    }
}
