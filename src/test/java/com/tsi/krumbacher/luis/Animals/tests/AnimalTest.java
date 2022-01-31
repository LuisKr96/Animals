package com.tsi.krumbacher.luis.Animals.tests;

import com.tsi.krumbacher.luis.Animals.Bat;
import com.tsi.krumbacher.luis.Animals.Cat;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class AnimalTest {

    @Test
    public void testGetSize() {
        Cat newCat = new Cat("Daisy");
        newCat.setSize(100);
       assertEquals(100, newCat.getSize(), "TESTING");
    }

    @Test
    public void testAnimalSound(){
        Cat newCat = new Cat("Harry");

        String result = newCat.animalSound();
        assertEquals("The cat meows", result, "test failed");
    }

    @Test
    public void testSetSize(){
        Bat newBat = new Bat("Gareth");

        int sizeInCm = newBat.setSize(30);
        assertEquals(30, sizeInCm, "error");
    }

    @Test
    public void testSetAge(){
        Cat newCat = new Cat("Daisy");
        int catAge = newCat.setAge(20);
        if(catAge == 20){
            System.out.println("The age is correct");
        }else{
            System.out.println("The age is incorrect");
        }
        assertEquals(20, catAge, "failed");
    }

}




