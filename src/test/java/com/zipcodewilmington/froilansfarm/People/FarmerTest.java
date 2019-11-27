package com.zipcodewilmington.froilansfarm.People;

import com.zipcodewilmington.froilansfarm.edibles.Corn;
import com.zipcodewilmington.froilansfarm.edibles.Edibles;
import com.zipcodewilmington.froilansfarm.people.Farmer;
import org.junit.Assert;
import org.junit.Test;

public class FarmerTest {


    @Test
    public void testFarmerEat() {
        Farmer farmer = new Farmer("Joe");
        Corn corn = new Corn();

        Assert.assertEquals(expected, actual);


    }

}
