package com.codecool.oopws3;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();
        Cat cat = new Cat("Macsek", false);
        Dog dog = new Dog("Kutyimutyi", true);
        animals.add(cat);
        animals.add(dog);
        Owner owner = new Owner(animals);
        owner.feed();

    }
}
