package com.tsi.krumbacher.luis.Animals;

public abstract class Animal {

    String name;
    String foodToEat;
    String colour;
    String sound;
    private int age;
    private int size;

    //int age;

    public void printName(){
        System.out.println("My name is " + name);
    }

    public void eatFood(){
        System.out.println("The animal is eating " + foodToEat);
    }

    public void colour(){
        System.out.println("The colour of the animal is: " + colour);
    }

    public abstract void makeASound();
    public abstract void sleep();

    public int setAge(int age){
        this.age = age;
        return age;
    }
    public int getAge(){
        return age;
    }

    public int setSize (int size){
        this.size = size;
        return size;
    }
    public int getSize (){
        return size;
    }
    }









