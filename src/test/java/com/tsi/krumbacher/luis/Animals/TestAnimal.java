package com.tsi.krumbacher.luis.Animals;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class TestAnimal {

    @Test
    void testSizeMethod() {
        Cat newCat = new Cat();
        newCat.eat();
        assertEquals(100, newCat.getSize(), "TESTING");
    }






}




