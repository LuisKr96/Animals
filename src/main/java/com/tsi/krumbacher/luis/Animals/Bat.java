package com.tsi.krumbacher.luis.Animals;

public class Bat extends Mammal implements Flying{
    String nameOfBat;
    int lifeExpectancy;
    int insectsEaten;

    public Bat(String name){
        nameOfBat = name;
        insectsEaten = 5;
        lifeExpectancy =30;
    }

    public void makeASound(){
        System.out.println("clicks");
    }

    public void sleep() {
        System.out.println("ZZZZZZZ");
    }

    public void takeoff() {
        System.out.println("The bat is taking off");
    }

    public void landing() {
        System.out.println("The bat is landing");

    }

    public void flight() {
        System.out.println("The bat is flying");
    }

}
