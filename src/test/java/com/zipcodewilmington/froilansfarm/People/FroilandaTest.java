package com.zipcodewilmington.froilansfarm.People;

import com.zipcodewilmington.froilansfarm.edibles.Potatos;
import com.zipcodewilmington.froilansfarm.mainFarm.Field;
import com.zipcodewilmington.froilansfarm.people.Froilanda;
import com.zipcodewilmington.froilansfarm.sandyPantry.FoodOrganizer;
import com.zipcodewilmington.froilansfarm.sandyPantry.SandyPantry;
import com.zipcodewilmington.froilansfarm.vehicles.CropDuster;
import com.zipcodewilmington.froilansfarm.vehicles.Tractor;
import org.junit.Assert;
import org.junit.Test;

public class FroilandaTest {

    @Test
    public void froilandaEatTest()  {
        Froilanda froilanda = new Froilanda("Froilanda");
        Potatos potatos = new Potatos();
        FoodOrganizer foodOrganizer = new FoodOrganizer();
        foodOrganizer.add(potatos, 4);
        froilanda.eat(potatos, 3);

        Integer expected = 1;
        Integer actual = foodOrganizer.getNumOfEdibles(potatos);
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
