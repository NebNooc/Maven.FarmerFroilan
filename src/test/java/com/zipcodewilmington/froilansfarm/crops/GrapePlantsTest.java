package com.zipcodewilmington.froilansfarm.crops;

import com.zipcodewilmington.froilansfarm.edibles.Edibles;
import com.zipcodewilmington.froilansfarm.edibles.Grapes;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class GrapePlantsTest {

    @Test
    public void yieldGrapeTest1(){
        GrapePlants grapePlants = new GrapePlants();
        grapePlants.hasBeenFertilized = true;
        grapePlants.hasBeenHarvested = true;
        Grapes[] grape = grapePlants.yield();
        Assert.assertTrue(grape[0] instanceof Edibles);
    }

    @Test
    public void yieldGrapeTest2(){
        GrapePlants grapePlants = new GrapePlants();
        grapePlants.hasBeenFertilized = true;
        grapePlants.hasBeenHarvested = false;
        Grapes[] grape = grapePlants.yield();
        Assert.assertNull(grape);
    }

    @Test
    public void yieldGrapeTest3(){
        GrapePlants grapePlants = new GrapePlants();
        grapePlants.hasBeenFertilized = false;
        grapePlants.hasBeenHarvested = true;
        Grapes[] grape = grapePlants.yield();
        Assert.assertNull(grape);
    }
}