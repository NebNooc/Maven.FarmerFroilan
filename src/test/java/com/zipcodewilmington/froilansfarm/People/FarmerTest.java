package com.zipcodewilmington.froilansfarm.People;

import com.zipcodewilmington.froilansfarm.edibles.Corn;
import com.zipcodewilmington.froilansfarm.edibles.Edibles;
import com.zipcodewilmington.froilansfarm.people.Farmer;
import com.zipcodewilmington.froilansfarm.sandyPantry.FoodOrganizer;
import org.junit.Assert;
import org.junit.Test;

public class FarmerTest {


    @Test
    public void testFarmerEat() {
        Farmer farmer = new Farmer("Joe");
        Corn corn = new Corn();
        FoodOrganizer foodOrganizer = new FoodOrganizer();
        foodOrganizer.add(corn, 4);
        farmer.eat(corn, 3);

        Integer expected = 1;
        Integer actual = foodOrganizer.getNumOfEdibles(corn);
        Assert.assertEquals(expected, actual);

        Assert.assertEquals(expected, actual);


    }

}
