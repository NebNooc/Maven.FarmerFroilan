package com.zipcodewilmington.froilansfarm.people;

import com.sun.scenario.effect.Crop;

import java.util.ArrayList;

public class Botonist extends Farmer{

    private String name;
    private Integer plantsInCropRow;
    private Crop cropType;



    Botonist(String name) {
        super(name);
    }

    public Crop newCrop(Crop cropType) {
        Crop crop = new Crop(cropType);
        return crop;
    }

    public void setPlantsInCropRow(Integer num)    {
        this.plantsInCropRow = num;
    }

    public ArrayList<Crop> produce(Integer num)    {
        ArrayList<Crop> edibles = new ArrayList<Crop>();
        return edibles;
    }





}
