package com.zipcodewilmington.froilansfarm.People;

import com.zipcodewilmington.froilansfarm.people.Person;
import org.junit.Assert;
import org.junit.Test;

public class PersonTest {

    @Test
    public void testPersonConstructor(String name)  {
        Person bob = new Person("Bob");
        String expected = "Bob";
        String actual = bob.getName();

        Assert.assertEquals(expected, actual);
    }

}
