package com.zipcodewilmington.froilansfarm.sandyPantry;

import com.zipcodewilmington.froilansfarm.edibles.Edibles;

import java.util.HashMap;
import java.util.Map;

public class FoodOrganizer {

    private Map<Edibles, Integer> food;

    public FoodOrganizer() {
        this.food = new HashMap<Edibles, Integer>();
    }

    public void add(Edibles edibles, Integer num) {
        if(!food.containsKey(edibles))
            food.put(edibles, num);
        else {
            Integer newNum = food.get(edibles) + num;
            food.replace(edibles, newNum);
        }
    }

    public void take(Edibles edibles, Integer num) {
        if(!food.containsKey(edibles))
            System.out.println("You done fucked up");
        else if(food.get(edibles) < num)
            System.out.println("You done fucked up");
        else {
            Integer newNum = food.get(edibles) - num;
            food.replace(edibles, newNum);
        }
    }

    public Integer getNumOfEdibles(Edibles edibles) {
        return food.get(edibles);
    }
}
