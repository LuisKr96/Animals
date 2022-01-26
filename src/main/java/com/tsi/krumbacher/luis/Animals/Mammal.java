package com.tsi.krumbacher.luis.Animals;

public abstract class Mammal extends Animal {

    private int sizeInLength;
    private int weight;
    private int size = 100;


    public Mammal(){
        int sizeInLength;
        int weight;
        String name;

    }


    public int getSize(){
        return size;
    }

    public int setSize(int size){
        this.size = size;
        return size;
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
