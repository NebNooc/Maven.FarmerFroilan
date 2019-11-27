package com.zipcodewilmington.froilansfarm.people;

import com.zipcodewilmington.froilansfarm.edibles.Edibles;
import com.zipcodewilmington.froilansfarm.interfaces.Eater;
import com.zipcodewilmington.froilansfarm.interfaces.Rideable;

public class Farmer extends Person {

    private Botonist botonist;




    public Farmer(String name) {
        super(name);
    }

    public String getFarmerName()   {
        return super.getName();

    }

    @Override
    public void eat(Edibles edible, Integer num) {
        super.eat(edible, num);
    }
}
