package com.tsi.krumbacher.luis.Animals.tests;

import com.tsi.krumbacher.luis.Animals.Cat;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CatTest {
    @Test
    public void testAnimalSounds(){
        Cat newCat = new Cat();
        String result = newCat.animalSound();
        assertEquals("The cat meows", result, "test failed");
    }

}