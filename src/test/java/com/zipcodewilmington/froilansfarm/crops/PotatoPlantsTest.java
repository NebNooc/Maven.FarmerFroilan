package com.zipcodewilmington.froilansfarm.crops;

import com.zipcodewilmington.froilansfarm.edibles.Edibles;
import com.zipcodewilmington.froilansfarm.edibles.Potatos;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PotatoPlantsTest {
    @Test
    public void yieldPotatoTest1(){
        PotatoPlants potatoPlants = new PotatoPlants();
        potatoPlants.hasBeenFertilized = true;
        potatoPlants.hasBeenHarvested = true;
        Potatos[] potato = potatoPlants.yield();
        Assert.assertTrue(potato[0] instanceof Edibles);
    }

    @Test
    public void yieldPotatoTest2(){
        PotatoPlants potatoPlants = new PotatoPlants();
        potatoPlants.hasBeenFertilized = true;
        potatoPlants.hasBeenHarvested = false;
        Potatos[] potato = potatoPlants.yield();
        Assert.assertNull(potato);
    }

    @Test
    public void yieldPotatoTest3(){
        PotatoPlants potatoPlants = new PotatoPlants();
        potatoPlants.hasBeenFertilized = false;
        potatoPlants.hasBeenHarvested = true;
        Potatos[] potato = potatoPlants.yield();
        Assert.assertNull(potato);
    }

}