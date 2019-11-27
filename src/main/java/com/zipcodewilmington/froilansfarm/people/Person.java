package com.zipcodewilmington.froilansfarm.people;

import com.zipcodewilmington.froilansfarm.edibles.Edibles;
import com.zipcodewilmington.froilansfarm.interfaces.Eater;
import com.zipcodewilmington.froilansfarm.interfaces.NoiseMaker;
import com.zipcodewilmington.froilansfarm.interfaces.Rideable;
import com.zipcodewilmington.froilansfarm.sandyPantry.FoodOrganizer;

import java.util.HashMap;

public class Person implements NoiseMaker, Eater {

    private Pilot pilot;
    private String name;

    //private FoodOrganizer food = new FoodOrganizer();


    public String getName() {
        return this.name;
    }

    public Person(String name) {
        this.name = name;
    }

    @Override
    public void eat(Edibles edible, Integer num) {
//        food.take(edible, num);

    }

    public String makeNoise() {
        return null;
    }
}
