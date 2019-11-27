package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.animals.Horse;
import com.zipcodewilmington.froilansfarm.crops.TomatoPlants;
import com.zipcodewilmington.froilansfarm.mainFarm.Field;
import com.zipcodewilmington.froilansfarm.people.Froilan;
import com.zipcodewilmington.froilansfarm.people.Froilanda;
import com.zipcodewilmington.froilansfarm.vehicles.CropDuster;
import com.zipcodewilmington.froilansfarm.vehicles.Tractor;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class DaysOfTheWeekTests {

    private Froilan froilan = new Froilan("Froilan");
    private Froilanda froilanda = new Froilanda("Froilanda");
    private Horse horse1 = new Horse();
    private Horse horse2 = new Horse();
    private CropDuster cropDuster = new CropDuster();
    private Field field = new Field();
    private Tractor tractor = new Tractor();
    private TomatoPlants tomatoes;



    @Test
    public void SundayTest(){
        froilan.mount(horse1);
        froilanda.mount(horse2);
        Assert.assertTrue(horse1.mounted());
        Assert.assertTrue(horse2.mounted());

        froilan.dismount(horse1);
        froilanda.dismount(horse2);
        Assert.assertFalse(horse1.dismounted());
        Assert.assertFalse(horse2.dismounted());

        froilan.setPlantsInCropRow(1);
        froilan.setPlantsInCropRow(2);
        froilan.setPlantsInCropRow(3);
    }

    @Test
    public void MondayTest(){
        froilan.mount(horse1);
        froilanda.mount(horse2);
        Assert.assertTrue(horse1.mounted());
        Assert.assertTrue(horse2.mounted());

        froilan.dismount(horse1);
        froilanda.dismount(horse2);
        Assert.assertFalse(horse1.dismounted());
        Assert.assertFalse(horse2.dismounted());


        cropDuster.fly(field);

    }

    @Test
    public void TuesdayTest(){
        froilan.mount(horse1);
        froilanda.mount(horse2);
        Assert.assertTrue(horse1.mounted());
        Assert.assertTrue(horse2.mounted());

        froilan.dismount(horse1);
        froilanda.dismount(horse2);
        Assert.assertFalse(horse1.dismounted());
        Assert.assertFalse(horse2.dismounted());

        froilan.mount(tractor);
        tractor.harvest();

    }

    @Test
    public void WednesdayTest(){
        froilan.mount(horse1);
        froilanda.mount(horse2);
        Assert.assertTrue(horse1.mounted());
        Assert.assertTrue(horse2.mounted());

        froilan.dismount(horse1);
        froilanda.dismount(horse2);
        Assert.assertFalse(horse1.dismounted());
        Assert.assertFalse(horse2.dismounted());

    }

    @Test
    public void ThursdayTest(){
        froilan.mount(horse1);
        froilanda.mount(horse2);
        Assert.assertTrue(horse1.mounted());
        Assert.assertTrue(horse2.mounted());

        froilan.dismount(horse1);
        froilanda.dismount(horse2);
        Assert.assertFalse(horse1.dismounted());
        Assert.assertFalse(horse2.dismounted());

    }

    @Test
    public void FridayTest(){
        froilan.mount(horse1);
        froilanda.mount(horse2);
        Assert.assertTrue(horse1.mounted());
        Assert.assertTrue(horse2.mounted());

        froilan.dismount(horse1);
        froilanda.dismount(horse2);
        Assert.assertFalse(horse1.dismounted());
        Assert.assertFalse(horse2.dismounted());

    }

    @Test
    public void SaturdayTest(){
        froilan.mount(horse1);
        froilanda.mount(horse2);
        Assert.assertTrue(horse1.mounted());
        Assert.assertTrue(horse2.mounted());

        froilan.dismount(horse1);
        froilanda.dismount(horse2);
        Assert.assertFalse(horse1.dismounted());
        Assert.assertFalse(horse2.dismounted());

    }
}
