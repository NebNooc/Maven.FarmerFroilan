package com.zipcodewilmington.froilansfarm.People;

import com.zipcodewilmington.froilansfarm.people.Botonist;
import org.junit.Assert;
import org.junit.Test;

public class BotanistTest {


    @Test
    public void setPlantsInCropRowTest() {
        Botonist botonist = new Botonist("Phil");
        botonist.setPlantsInCropRow(5);

        Integer expected = 5;
        Integer actual = botonist.getPlantsInCropRow();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void produceTest() {
        Botonist botonist = new Botonist("Phil");

        Integer expected = 3;
        botonist.produce(3);
        Integer actual = 3;

        Assert.assertEquals(expected, actual);
    }

}
