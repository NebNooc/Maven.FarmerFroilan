package com.zipcodewilmington.froilansfarm.people;


import com.zipcodewilmington.froilansfarm.edibles.Edibles;
import com.zipcodewilmington.froilansfarm.interfaces.Rideable;
import com.zipcodewilmington.froilansfarm.interfaces.Rider;

public class Froilan extends Botonist implements Rider {
    public Froilan(String name) {
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



}
