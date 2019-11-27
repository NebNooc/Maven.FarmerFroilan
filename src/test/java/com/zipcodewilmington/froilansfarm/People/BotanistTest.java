package com.zipcodewilmington.froilansfarm.People;

import com.zipcodewilmington.froilansfarm.people.Botonist;
import org.junit.Assert;
import org.junit.Test;

public class BotanistTest {


    @Test
    public void setPlantsInCropRowTest(Integer num){
        Botonist botonist = new Botonist("Phil");
        botonist.setPlantsInCropRow(5);

        Integer expected = 5;
        Integer actual = botonist.getPlantsInCropRow();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void produceTest(Integer num)    {
        Botonist botonist = new Botonist("Phil");

        Integer expected = 3;
        Integer actual = botonist.produce(3).size();

        Assert.assertEquals(expected, actual);
    }

}
