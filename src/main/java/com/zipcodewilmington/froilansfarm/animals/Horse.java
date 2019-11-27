package com.zipcodewilmington.froilansfarm.animals;

import com.zipcodewilmington.froilansfarm.edibles.Edibles;
import com.zipcodewilmington.froilansfarm.interfaces.Rideable;
import com.zipcodewilmington.froilansfarm.sandyPantry.FoodOrganizer;

public class Horse extends Animals implements Rideable {
    private Boolean wasRidden;
    private Edibles edible;
    private FoodOrganizer foodOrganizer;

    public void Eat(Edibles edible) {

    }

    public String makeNoise(){
        return "Neigh";
    }

    public Boolean mounted() {
        wasRidden = true;
        return wasRidden;
    }

    public Boolean dismounted() {
        wasRidden = false;
        return wasRidden;
    }

    @Override
    public void eat(Edibles edible, Integer num) {
        this.edible = edible;
        foodOrganizer.take(edible, num);
    }
}
