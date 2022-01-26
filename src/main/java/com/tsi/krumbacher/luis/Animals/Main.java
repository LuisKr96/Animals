package com.tsi.krumbacher.luis.Animals;


public class Main {



    public static void main(String[] args){
        Cat cat = new Cat("Ricardo");
        cat.foodToEat = "Mice";
        cat.colour ="Ginger";
        cat.sizeInCm = 80;
        cat.animalSound();
        cat.setAge(15);

        System.out.println(cat.getAge());

        System.out.println("The Cat likes to eat "+ cat.foodToEat + ", is " + cat.colour + " and is " +cat.sizeInCm + " CM");


        Bat newBat = new Bat("Vampire");
        newBat.foodToEat = "insects";
        newBat.colour = "red";
        newBat.sound = "Dont know";


        System.out.println(newBat.foodToEat + " " + newBat.colour + " " + newBat.sound);

        newBat.name = "Gary";
        newBat.printName();

        newBat.colour();

        newBat.makeASound();
        newBat.sleep();
        newBat.eatFood();

        newBat.setAge(16);
        System.out.println("The Bats age is " + newBat.getAge());

         /* + " " + newBat.animalSound() + " " + newBat.eat()); */


    }

}
