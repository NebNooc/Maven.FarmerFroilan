package com.zipcodewilmington.froilansfarm.sandyPantry;

import com.zipcodewilmington.froilansfarm.calendar.Days;

import java.util.HashMap;
import java.util.Map;

public class SandyPantry {

    private Map<Days, FoodOrganizer> pantry;

    public SandyPantry() {
        this.pantry = new HashMap<Days, FoodOrganizer>();
        pantry.put(Days.SUNDAY, null);
        pantry.put(Days.MONDAY, null);
        pantry.put(Days.TUESDAY, null);
        pantry.put(Days.WEDNESDAY, null);
        pantry.put(Days.THURSDAY, null);
        pantry.put(Days.FRIDAY, null);
        pantry.put(Days.SATURDAY, null);
    }

    public void inventoryLoader(Days days, FoodOrganizer food) {
        pantry.replace(days, food);
    }
}
