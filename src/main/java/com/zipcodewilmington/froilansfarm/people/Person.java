package com.zipcodewilmington.froilansfarm.people;

import com.zipcodewilmington.froilansfarm.edibles.Edibles;
import com.zipcodewilmington.froilansfarm.interfaces.Eater;
import com.zipcodewilmington.froilansfarm.interfaces.NoiseMaker;
import com.zipcodewilmington.froilansfarm.interfaces.Rideable;
import com.zipcodewilmington.froilansfarm.sandyPantry.FoodOrganizer;

public class Person implements NoiseMaker, Eater {

    private Pilot pilot;
    private String name;
    private  Edibles edible;
    private FoodOrganizer foodOrganizer;


    public String getName() {
        return this.name;
    }

    public Person(String name) {
        this.name = name;
    }


    public void eat(Edibles edible, Integer num) {
        this.edible = edible;
        foodOrganizer.take(edible, num);

    }

    public String makeNoise() {
        return null;
    }
}
