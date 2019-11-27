package com.zipcodewilmington.froilansfarm.crops;

import com.zipcodewilmington.froilansfarm.edibles.Edibles;
import com.zipcodewilmington.froilansfarm.edibles.Tomatos;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class TomatoPlantsTest {
    @Test
    public void yieldTomatoTest1(){
        TomatoPlants tomatoPlants = new TomatoPlants();
        tomatoPlants.hasBeenFertilized = true;
        tomatoPlants.hasBeenHarvested = true;
        Tomatos[] tomato = tomatoPlants.yield();
        Assert.assertTrue(tomato[0] instanceof Edibles);
    }

    @Test
    public void yieldTomatoTest2(){
        TomatoPlants tomatoPlants = new TomatoPlants();
        tomatoPlants.hasBeenFertilized = true;
        tomatoPlants.hasBeenHarvested = false;
        Tomatos[] tomato = tomatoPlants.yield();
        Assert.assertNull(tomato);
    }

    @Test
    public void yieldTomatoTest3(){
        TomatoPlants tomatoPlants = new TomatoPlants();
        tomatoPlants.hasBeenFertilized = false;
        tomatoPlants.hasBeenHarvested = true;
        Tomatos[] tomato = tomatoPlants.yield();
        Assert.assertNull(tomato);
    }


}