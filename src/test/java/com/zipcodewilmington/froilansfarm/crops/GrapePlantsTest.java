package com.zipcodewilmington.froilansfarm.crops;

import com.zipcodewilmington.froilansfarm.edibles.Edibles;
import com.zipcodewilmington.froilansfarm.edibles.Grapes;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class GrapePlantsTest {

    @Test
    public void yieldGrapeTest(){
        GrapePlants grapePlants = new GrapePlants();
        Grapes grape = GrapePlants.yield();
        Assert.assertTrue(grape instanceof Edibles);
    }
}