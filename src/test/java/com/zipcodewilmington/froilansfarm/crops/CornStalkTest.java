package com.zipcodewilmington.froilansfarm.crops;

import com.zipcodewilmington.froilansfarm.edibles.Corn;
import com.zipcodewilmington.froilansfarm.edibles.Edibles;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CornStalkTest {

    @Test
    public void yieldCornTest(){
        CornStalk cornStalk = new CornStalk();
        Corn[] corn = cornStalk.yield();
        Assert.assertTrue(corn[0] instanceof Edibles);
    }

}