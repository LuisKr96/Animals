package com.tsi.krumbacher.luis.Animals;

public class Bat extends Mammal{
    String nameOfBat;
    int lifeExpectancy;
    private int age;



    public Bat(String name){
        nameOfBat = name;
    }

    public void makeASound(){
        System.out.println("clicks");
    }

    public void sleep() {
        System.out.println("ZZZZZZZ");
    }

    public int setAge(int age){
        this.age = age;
        return age;
    }
    public int getAge(){
        return age;
    }



    public String animalSound(){
        return "BIG SOUND";
    }


    /* public int setSize(int size) {
        return 5;
    }*/
}
