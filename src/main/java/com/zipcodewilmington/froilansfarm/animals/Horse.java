package com.zipcodewilmington.froilansfarm.animals;

import com.zipcodewilmington.froilansfarm.edibles.Edibles;
import com.zipcodewilmington.froilansfarm.interfaces.Rideable;

public class Horse extends Animals implements Rideable {
    private Boolean wasRidden;

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

    }
}
