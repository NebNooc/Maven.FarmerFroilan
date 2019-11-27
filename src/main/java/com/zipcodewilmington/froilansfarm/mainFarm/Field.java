package com.zipcodewilmington.froilansfarm.mainFarm;

import com.zipcodewilmington.froilansfarm.crops.Crop;

import java.util.ArrayList;
import java.util.List;

public class Field<E extends Crop> {

    private CropRow[] fieldRows;

    public Field(){
        fieldRows = new CropRow[10];
    }

    public void addRow(E cropType, int howManyPlants, int whichRow){
        if(whichRow - 1 >= 0 && whichRow - 1 <= 10){
            fieldRows[whichRow - 1] = new CropRow(cropType, howManyPlants);
        }
    }

    public CropRow[] getFieldRows() {
        return fieldRows;
    }

    public void setFieldRows(CropRow[] fieldRows) {
        this.fieldRows = fieldRows;
    }
}
