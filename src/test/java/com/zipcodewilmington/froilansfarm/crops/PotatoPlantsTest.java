package com.zipcodewilmington.froilansfarm.crops;

import com.zipcodewilmington.froilansfarm.edibles.Edibles;
import com.zipcodewilmington.froilansfarm.edibles.Potatos;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PotatoPlantsTest {
    @Test
    public void yieldPotatoTest(){
        PotatoPlants potatoPlants = new PotatoPlants();
        Potatos[] potato = potatoPlants.yield();
        Assert.assertTrue(potato[0] instanceof Edibles);
    }

}