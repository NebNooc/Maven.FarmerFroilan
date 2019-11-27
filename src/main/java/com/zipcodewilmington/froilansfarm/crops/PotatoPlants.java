package com.zipcodewilmington.froilansfarm.crops;

import com.zipcodewilmington.froilansfarm.edibles.Potatos;
import com.zipcodewilmington.froilansfarm.interfaces.Produces;

import java.util.Arrays;

public class PotatoPlants extends Crop implements Produces {

    public PotatoPlants(){
        super();
    }

    public Potatos[] yield(){
        if(hasBeenFertilized && hasBeenHarvested){
            int yieldAmount = (int)(Math.random() * ((10 - 5) + 1)) + 5;
            Potatos[] yieldGroup = new Potatos[yieldAmount];
            Arrays.fill(yieldGroup, new Potatos());
            return yieldGroup;
        }
        return null;
    }
}
