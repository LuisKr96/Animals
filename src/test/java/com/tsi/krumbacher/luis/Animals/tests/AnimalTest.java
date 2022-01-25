package com.tsi.krumbacher.luis.Animals.tests;

import com.tsi.krumbacher.luis.Animals.Bat;
import com.tsi.krumbacher.luis.Animals.Cat;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class AnimalTest {

    @Test
    public void testGetSize() {
        Cat newCat = new Cat();
       assertEquals(100, newCat.getSize(), "TESTING");
    }

    @Test
    public void testAnimalSound(){
        Bat newBat = new Bat("John", 40);
        Cat newCat = new Cat();

        String resultOfSound = newBat.animalSound();
        assertEquals("BIG SOUND", resultOfSound,"Test failed");

        String result = newCat.animalSound();
        assertEquals("The cat meows", result, "test failed");
    }

    @Test
    public void testSetSize(){
        Bat newBat = new Bat("Gareth", 100);

        int sizeInCm = newBat.setSize(30);
        assertEquals(30, sizeInCm, "error");
    }








}




