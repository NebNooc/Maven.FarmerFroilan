package com.zipcodewilmington.froilansfarm.People;

import com.zipcodewilmington.froilansfarm.edibles.Potatos;
import com.zipcodewilmington.froilansfarm.mainFarm.Field;
import com.zipcodewilmington.froilansfarm.people.Froilanda;
import com.zipcodewilmington.froilansfarm.vehicles.CropDuster;
import com.zipcodewilmington.froilansfarm.vehicles.Tractor;
import org.junit.Assert;
import org.junit.Test;

public class FroilandaTest {

    @Test
    public void froilandaEatTest()  {
        Froilanda froilanda = new Froilanda("Froilanda");
        Potatos potatos = new Potatos();

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void flyTest() {
        Froilanda froilanda = new Froilanda("Froilanda");
        CropDuster cropduster = new CropDuster();
        Field field = new Field();


        Assert.assertTrue(cropduster.fly(field));

    }


    @Test
    public void landTest() {
        Froilanda froilanda = new Froilanda("Froilanda");
        CropDuster cropduster = new CropDuster();
        Field field = new Field();
        cropduster.fly(field);

        Assert.assertFalse(cropduster.land());
    }

    }
