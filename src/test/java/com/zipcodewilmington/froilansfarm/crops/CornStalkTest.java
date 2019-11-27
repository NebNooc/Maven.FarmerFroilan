package com.zipcodewilmington.froilansfarm.crops;

import com.zipcodewilmington.froilansfarm.edibles.Corn;
import com.zipcodewilmington.froilansfarm.edibles.Edibles;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CornStalkTest {

    @Test
    public void yieldCornTest1(){
        CornStalk cornStalk = new CornStalk();
        cornStalk.hasBeenFertilized = true;
        cornStalk.hasBeenHarvested = true;
        Corn[] corn = cornStalk.yield();

        Assert.assertTrue(corn[0] instanceof Edibles);
    }

    @Test
    public void yieldCornTest2(){
        CornStalk cornStalk = new CornStalk();
        cornStalk.hasBeenFertilized = false;
        cornStalk.hasBeenHarvested = true;
        Corn[] corn = cornStalk.yield();
        Assert.assertNull(corn);
    }

    @Test
    public void yieldCornTest3(){
        CornStalk cornStalk = new CornStalk();
        cornStalk.hasBeenFertilized = true;
        cornStalk.hasBeenHarvested = false;
        Corn[] corn = cornStalk.yield();
        Assert.assertNull(corn);
    }

}