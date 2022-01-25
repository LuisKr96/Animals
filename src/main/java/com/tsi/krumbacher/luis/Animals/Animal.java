package com.tsi.krumbacher.luis.Animals;

public abstract class Animal {

    private String name;
    String foodToEat;
    String colour;
    String sound;



    public String eat(){
        return "Animal is eating";
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









