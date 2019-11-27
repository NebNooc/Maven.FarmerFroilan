package com.zipcodewilmington.froilansfarm.people;

import com.zipcodewilmington.froilansfarm.edibles.Edibles;
import com.zipcodewilmington.froilansfarm.interfaces.Eater;
import com.zipcodewilmington.froilansfarm.interfaces.Rideable;
import com.zipcodewilmington.froilansfarm.interfaces.Rider;

public class Froilanda extends Pilot {
    public Froilanda(String name) {
        super(name);
    }

    @Override
    public void eat(Edibles edible) {
        super.eat(edible);
    }

    public void mount(Rideable rideable) {
        rideable.mounted();
    }

}
