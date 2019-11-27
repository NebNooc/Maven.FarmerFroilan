package com.zipcodewilmington.froilansfarm.People;

import com.zipcodewilmington.froilansfarm.edibles.Grapes;
import com.zipcodewilmington.froilansfarm.people.Person;
import com.zipcodewilmington.froilansfarm.sandyPantry.FoodOrganizer;
import org.junit.Assert;
import org.junit.Test;

public class PersonTest {
    FoodOrganizer food;

    @Test
    public void testPersonConstructor() {
        Person bob = new Person("Bob");
        String expected = "Bob";
        String actual = bob.getName();

        Assert.assertEquals(expected, actual);
    }


}
