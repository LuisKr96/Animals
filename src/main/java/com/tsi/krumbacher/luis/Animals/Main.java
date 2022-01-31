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
        newBat.setTypeOfMammal("placental");
        System.out.println(newBat.getTypeOfMammal());

        newBat.lifeExpectancy = 30;
        System.out.println(newBat.lifeExpectancy);



        newBat.setAge(16);
        System.out.println("The Bats age is " + newBat.getAge());

        System.out.println(newBat.insectsEaten);

        System.out.println(newBat.getAge());

        newBat.takeoff();
        newBat.flight();
        newBat.landing();

        FoodDiet batDiet = FoodDiet.Omnivore;
        newBat.foodToEat = String.valueOf(batDiet);
        System.out.println(newBat.foodToEat);
        System.out.println(batDiet);


    }

}
