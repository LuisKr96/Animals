package com.tsi.krumbacher.luis.Animals;


public class Main {



    public static void main(String[] args){
        Cat cat = new Cat();
        cat.foodToEat = "Mice";
        cat.colour ="Ginger";
        cat.sizeInCm = 80;
        cat.animalSound();

        System.out.println("The Cat likes to eat "+ cat.foodToEat + ", is " + cat.colour + " and is " +cat.sizeInCm + " CM");

        cat.eat();

        Bat newBat = new Bat();
        newBat.foodToEat = "insects";
        newBat.colour = "grey";
        newBat.animalSound();
        newBat.eat();
        newBat.colour();






















    }

}
