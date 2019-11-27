package com.zipcodewilmington.froilansfarm.people;

import com.zipcodewilmington.froilansfarm.edibles.Edibles;
import com.zipcodewilmington.froilansfarm.interfaces.Rideable;
import com.zipcodewilmington.froilansfarm.mainFarm.Field;
import com.zipcodewilmington.froilansfarm.vehicles.Aircraft;

public class Pilot extends Person {
    Aircraft aircraft;
    Field field;


    public Pilot(String name) {
        super(name);
    }

    public void fly(Aircraft aircraft)    {
        this.aircraft.fly(field);
    }

    public void land(Aircraft aircraft)    {
        this.aircraft.land();
    }

    @Override
    public void eat(Edibles edible, Integer num) {
        super.eat(edible, num);
    }

}
