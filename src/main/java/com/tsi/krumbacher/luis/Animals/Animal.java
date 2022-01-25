package com.tsi.krumbacher.luis.Animals;

public abstract class Animal {


    private int animalLegs;
    private int animalYears;
    private String name;
    String foodToEat;
    String colour;

    public Animal(){
        animalLegs =4;
        animalYears =12;
    }

    public void eat(){
        System.out.println("Likes to eat " + foodToEat);
    }

    public void colour(){
        System.out.println("The colour of the animal is: " + colour);
    };

    /* public abstract void eat(String food); */

    public String getName(){
        return name;
    }
    public void setName(String newName){

    }





    }









