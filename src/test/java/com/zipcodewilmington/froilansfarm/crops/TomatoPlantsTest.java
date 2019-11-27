package com.zipcodewilmington.froilansfarm.crops;

import com.zipcodewilmington.froilansfarm.edibles.Edibles;
import com.zipcodewilmington.froilansfarm.edibles.Tomatos;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class TomatoPlantsTest {
    @Test
    public void yieldTomatoTest(){
        TomatoPlants tomatoPlants = new TomatoPlants();
        Tomatos[] tomato = tomatoPlants.yield();
        Assert.assertTrue(tomato[0] instanceof Edibles);
    }

}