package com.tsi.krumbacher.luis.Animals;

public class Cat extends Mammal {
    String foodToEat = "mice";
    String colour;
    int sizeInCm;



    public void eat(String food){
        this.setSize(this.getSize()+1);
    }

    public void drink(){
        System.out.println("Likes to eat " + foodToEat);
    }

    public void animalSound(){
        System.out.println("The cat meows");
    }




    /* public int getSize(){
        return size;
    }

    public void setSize(int size){
        this.size = size;
    }

     */



}
