package com.tsi.krumbacher.luis.Animals;

public class Cat extends Mammal {
    String foodToEat = "Mouse";
    int purrsPerDay = 100;
    String typeOfCat;

    public void eat(String food){
        this.setSize(this.getSize()+1);
    }
}
