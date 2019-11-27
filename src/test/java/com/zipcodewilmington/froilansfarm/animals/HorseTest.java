package com.zipcodewilmington.froilansfarm.animals;
import com.zipcodewilmington.froilansfarm.interfaces.Rideable;
import org.junit.Assert;
import org.junit.Test;

public class HorseTest {

    @Test
    public void inheritanceTest(){
        Horse horse = new Horse();
        Assert.assertTrue(horse instanceof Animals);
    }

    @Test
    public void implementationTest(){
        Horse horse = new Horse();
        Assert.assertTrue(horse instanceof Rideable);
    }

    @Test
    public void makeNoiseTest(){
        Horse horse = new Horse();
        String expected = "Neigh";
        String actual = horse.makeNoise();

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void wasRiddenTest(){
        Horse horse = new Horse();
        Assert.assertTrue(horse.mounted());
    }

    @Test
    public void wasDismountedTest(){
        Horse horse = new Horse();
        Assert.assertFalse(horse.mounted());
    }
}