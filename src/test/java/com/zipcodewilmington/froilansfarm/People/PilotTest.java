package com.zipcodewilmington.froilansfarm.People;

import com.zipcodewilmington.froilansfarm.edibles.Potatos;
import com.zipcodewilmington.froilansfarm.edibles.Tomatos;
import com.zipcodewilmington.froilansfarm.mainFarm.Field;
import com.zipcodewilmington.froilansfarm.people.Froilanda;
import com.zipcodewilmington.froilansfarm.people.Pilot;
import com.zipcodewilmington.froilansfarm.sandyPantry.FoodOrganizer;
import com.zipcodewilmington.froilansfarm.vehicles.Aircraft;
import com.zipcodewilmington.froilansfarm.vehicles.CropDuster;
import org.junit.Assert;
import org.junit.Test;

public class PilotTest {



    @Test
    public void testFly() {
        Pilot pilot = new Pilot("Mac");
        CropDuster cropDuster = new CropDuster();
        Field field = new Field();

        Assert.assertTrue(cropDuster.fly(field));

    }

    @Test
    public void testLand() {
        Pilot pilot = new Pilot("Mac");
        CropDuster cropDuster = new CropDuster();
        Field field = new Field();

        Assert.assertFalse(cropDuster.land());
    }

}
