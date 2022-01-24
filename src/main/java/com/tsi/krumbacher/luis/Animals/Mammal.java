package com.tsi.krumbacher.luis.Animals;

public abstract class Mammal extends Animal {

    private int sizeInLength;
    private int weight;
    private String name;




    public String Breathe(){
        return "this animal is breathing";
    }

    public int getMammalSize(){
        return sizeInLength;
    }

    public Mammal(){
        sizeInLength = 20;
        weight = 50;
        name = "Tiger";

    }


}
