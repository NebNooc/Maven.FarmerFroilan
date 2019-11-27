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

    @Test
    public void personEatTest() {
        Person person = new Person("Bill");
        FoodOrganizer foodOrganizer = new FoodOrganizer();
        Grapes grapes = new Grapes();
        foodOrganizer.add(grapes, 4);
        person.eat(grapes, 3);

        Integer expected = 1;
        Integer actual = foodOrganizer.getNumOfEdibles(grapes);
        Assert.assertEquals(expected, actual);

    }
}
