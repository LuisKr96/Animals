package com.tsi.krumbacher.luis.Animals;

public abstract class Mammal extends Animal {

    private int sizeInLength;
    private int weight;
    private String name;
    private int size = 10;




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

    public int getSize(){
        return size;
    }

    public void setSize(int size){
        this.size = size;
    }


}
