package com.tsi.krumbacher.luis.Animals;

public class Cat extends Mammal  {
    int sizeInCm;
    String nameOfCat;

    public Cat(String name){
        nameOfCat = name;
    }

    /* public Cat(String mammalName, int weightInKg) {
        super(mammalName, weightInKg);
    } */




    /* public void eat(String food){
        this.setSize(this.getSize()+1);
    } */



    public String animalSound(){
        return "The cat meows";
    }

    public void makeASound(){
        System.out.println("meow");
    }

    public void sleep() {
        System.out.println("ZZZ");
    }




    /* public int getSize(){
        return size;
    }

    public void setSize(int size){
        this.size = size;
    }

     */



}
