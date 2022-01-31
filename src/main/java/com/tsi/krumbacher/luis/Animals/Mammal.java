package com.tsi.krumbacher.luis.Animals;

public abstract class Mammal extends Animal {

    private int sizeInLength;
    private int weight;
    private String typeOfMammal;


    public Mammal(){
        int sizeInLength;
        int weight;
        String name;

    }

    public String getTypeOfMammal(){
        return typeOfMammal;
    }
    public void setTypeOfMammal(String newTypeOfMammal){
        this.typeOfMammal = newTypeOfMammal;
    }

    public String Breathe(){
        return "this animal is breathing";
    }

    public int getMammalSize(){
        return sizeInLength;
    }

    public Mammal(String mammalName, int weightInKg){
        name = mammalName;
        weight = weightInKg;
    }







}
