package com.zipcodewilmington.froilansfarm.people;

import com.zipcodewilmington.froilansfarm.edibles.Edibles;
import com.zipcodewilmington.froilansfarm.interfaces.Eater;
import com.zipcodewilmington.froilansfarm.interfaces.NoiseMaker;
import com.zipcodewilmington.froilansfarm.interfaces.Rideable;

public class Person implements NoiseMaker, Eater {

    private Pilot pilot;
    private String name;


    public String getName() {
        return this.name;
    }

    public Person(String name) {
        this.name = name;
    }


    public void Eat(Edibles edible) {

    }

    public String makeNoise() {
        return null;
    }
}
