package com.zipcodewilmington.froilansfarm.crops;

import com.sun.org.apache.xpath.internal.operations.Bool;
import com.zipcodewilmington.froilansfarm.edibles.Edibles;
import com.zipcodewilmington.froilansfarm.interfaces.Produces;

abstract public class Crop implements Produces {

    Boolean hasBeenFertilized;
    Boolean hasBeenHarvested;

    protected Crop() {
        this.hasBeenFertilized = false;
        Boolean hasBeenHarvested = false;
    }

    abstract public Edibles[] yield();

    public Boolean getHasBeenFertilized() {
        return hasBeenFertilized;
    }

    public void setHasBeenFertilized(Boolean hasBeenFertilized) {
        this.hasBeenFertilized = hasBeenFertilized;
    }

    public Boolean getHasBeenHarvested() {
        return hasBeenHarvested;
    }

    public void setHasBeenHarvested(Boolean hasBeenHarvested) {
        this.hasBeenHarvested = hasBeenHarvested;
    }
}
