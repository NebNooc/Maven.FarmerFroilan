package com.zipcodewilmington.froilansfarm.crops;

import com.zipcodewilmington.froilansfarm.edibles.Edibles;
import com.zipcodewilmington.froilansfarm.edibles.Watermelon;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class WatermelonPlantsTest {
    @Test
    public void yieldWatermelonTest(){
        WatermelonPlants watermelonPlants = new WatermelonPlants();
        Watermelon watermelon = watermelonPlants.yield();
        Assert.assertTrue(watermelon instanceof Edibles);
    }

}