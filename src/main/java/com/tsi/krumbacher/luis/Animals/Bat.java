package com.tsi.krumbacher.luis.Animals;

public class Bat extends Mammal{
    String nameOfBat;
    int lifeExpectancyOfBat;


    public Bat(String name, int lifeExpectancy){
        nameOfBat = name;
        lifeExpectancyOfBat = lifeExpectancy;
    }


    public String animalSound(){
        return "BIG SOUND";
    }


    /* public int setSize(int size) {
        return 5;
    }*/
}
