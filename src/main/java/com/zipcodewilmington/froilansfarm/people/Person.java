package com.zipcodewilmington.froilansfarm.people;

import com.zipcodewilmington.froilansfarm.edibles.Edibles;
import com.zipcodewilmington.froilansfarm.interfaces.Eater;
import com.zipcodewilmington.froilansfarm.interfaces.NoiseMaker;
import com.zipcodewilmington.froilansfarm.interfaces.Rideable;

public class Person implements NoiseMaker, Eater {

    private Pilot pilot;
    private String name;
    private  Edibles edible;


    public String getName() {
        return this.name;
    }

    public Person(String name) {
        this.name = name;
    }


    public void eat(Edibles edible) {
        this.edible = edible;
        edible.remove(edible);

    }

    public String makeNoise() {
        return null;
    }
}
