package com.codecool.oopws3;

import java.util.List;

public class Owner {
    List<Animal> animals;
    public Owner(List<Animal> animals){
        this.animals = animals;
    }





    public void feed(){
        //calls all the animal-s feed() method
        for (Animal animal:animals) {
            animal.feed();
        }
    }
}
