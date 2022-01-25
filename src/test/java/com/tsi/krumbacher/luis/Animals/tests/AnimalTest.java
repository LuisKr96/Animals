package com.tsi.krumbacher.luis.Animals.tests;

import com.tsi.krumbacher.luis.Animals.Cat;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class AnimalTest {

    @Test
    void testGetSize() {
        Cat newCat = new Cat();
        newCat.eat();
        assertEquals(100, newCat.getSize(), "TESTING");
    }






}




