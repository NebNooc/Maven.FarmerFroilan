package com.zipcodewilmington.froilansfarm.animals;

import com.zipcodewilmington.froilansfarm.edibles.Eggs;

public class Chicken extends Animals {

    public Eggs layEgg(){
        Eggs egg = new Eggs();
        return egg;
    }

    public String makeNoise(){
        return "Cluck cluck";
    }
}
