package com.zipcodewilmington.froilansfarm.crops;

import com.zipcodewilmington.froilansfarm.edibles.Corn;
import com.zipcodewilmington.froilansfarm.interfaces.Produces;

import java.util.Arrays;

public class CornStalk extends Crop implements Produces {

    public CornStalk() {
        super();
    }

    public Corn[] yield() {
        if (hasBeenFertilized && hasBeenHarvested) {
            int yieldAmount = (int) (Math.random() * ((2 - 1) + 1)) + 1;
            Corn[] yieldGroup = new Corn[yieldAmount];
            Arrays.fill(yieldGroup, new Corn());
            return yieldGroup;
        }
        return null;
    }
}
