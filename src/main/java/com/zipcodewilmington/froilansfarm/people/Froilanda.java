package com.zipcodewilmington.froilansfarm.people;

import com.zipcodewilmington.froilansfarm.edibles.Edibles;
import com.zipcodewilmington.froilansfarm.interfaces.Eater;
import com.zipcodewilmington.froilansfarm.interfaces.Rideable;
import com.zipcodewilmington.froilansfarm.interfaces.Rider;
import com.zipcodewilmington.froilansfarm.vehicles.Aircraft;

public class Froilanda extends Pilot implements Rider{
    public Froilanda(String name) {
        super(name);
    }

    @Override
    public void eat(Edibles edible, Integer num) {
        super.eat(edible, num);
    }

    public void mount(Rideable rideable) {
        rideable.mounted();
    }

    public void dismount(Rideable rideable) {
        rideable.dismounted();
    }


    public void fly(Aircraft aircraft) {
        aircraft.fly(field);
    }
    public void land(Aircraft aircraft)    {
        this.aircraft.land();
    }




}
