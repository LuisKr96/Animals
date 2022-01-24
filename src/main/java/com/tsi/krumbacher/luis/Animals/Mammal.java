package com.tsi.krumbacher.luis.Animals;

public abstract class Mammal extends Animal {

    private int sizeInLength;
    private int weight;
    private String name;
    private int size = 100;

    public void animalSound(){
        System.out.println("The decible levels go up");
    }


    public int getSize(){
        return size;
    }

    public void setSize(int size){
        this.size = size;
    }



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

    public Mammal(String mammalName, int weightInKg){
        name = mammalName;
        weight = weightInKg;
    }







}
