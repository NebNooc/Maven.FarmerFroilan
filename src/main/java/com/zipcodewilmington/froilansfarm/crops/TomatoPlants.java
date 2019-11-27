package com.zipcodewilmington.froilansfarm.crops;

import com.zipcodewilmington.froilansfarm.edibles.Tomatos;
import com.zipcodewilmington.froilansfarm.interfaces.Produces;

import java.util.Arrays;

public class TomatoPlants extends Crop implements Produces {

    public TomatoPlants(){
        super();
    }

    public Tomatos[] yield(){
        if(hasBeenFertilized && hasBeenHarvested){
            int yieldAmount = (int)(Math.random() * ((5 - 4) + 1)) + 4;
            Tomatos[] yieldGroup = new Tomatos[yieldAmount];
            Arrays.fill(yieldGroup, new Tomatos());
            return yieldGroup;
        }
        return null;
    }
}
