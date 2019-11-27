package com.zipcodewilmington.froilansfarm.animals;

import com.zipcodewilmington.froilansfarm.edibles.Edibles;
import com.zipcodewilmington.froilansfarm.edibles.Eggs;
import com.zipcodewilmington.froilansfarm.sandyPantry.FoodOrganizer;

public class Chicken extends Animals {
    private Edibles edible;
    private FoodOrganizer foodOrganizer;

    public Eggs layEgg(){
        Eggs egg = new Eggs();
        return egg;
    }

    public String makeNoise(){
        return "Cluck cluck";
    }

    @Override
    public void eat(Edibles edible, Integer num) {
        this.edible = edible;
        foodOrganizer.take(edible, num);
    }
}
