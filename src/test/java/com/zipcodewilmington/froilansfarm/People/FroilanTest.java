package com.zipcodewilmington.froilansfarm.People;

import com.zipcodewilmington.froilansfarm.edibles.Eggs;
import com.zipcodewilmington.froilansfarm.people.Froilan;
import com.zipcodewilmington.froilansfarm.sandyPantry.FoodOrganizer;
import org.junit.Assert;
import org.junit.Test;

public class FroilanTest {

    @Test
    public void froilanEatTest()    {
        Froilan froilan = new Froilan("Froilan");
        Eggs eggs = new Eggs();
        FoodOrganizer foodOrganizer = new FoodOrganizer();
        foodOrganizer.add(eggs, 4);
        froilan.eat(eggs, 3);

        Integer expected = 1;
        Integer actual = foodOrganizer.getNumOfEdibles(eggs);
        Assert.assertEquals(expected, actual);


        Assert.assertEquals(expected, actual);
    }

}
