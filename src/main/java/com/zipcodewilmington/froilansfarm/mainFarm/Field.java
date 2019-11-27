package com.zipcodewilmington.froilansfarm.mainFarm;

import com.zipcodewilmington.froilansfarm.crops.Crop;

import java.util.ArrayList;
import java.util.List;

public class Field<E extends Crop> {

    private List<CropRow> fieldRows;

    public Field(){
        fieldRows = new ArrayList<CropRow>();
    }

    public void addRow(E cropType, int howManyPlants){
        fieldRows.add(new CropRow(cropType,howManyPlants));
    }


    public List<CropRow> getFieldRows() {
        return fieldRows;
    }

    public void setFieldRows(List<CropRow> fieldRows) {
        this.fieldRows = fieldRows;
    }
}
