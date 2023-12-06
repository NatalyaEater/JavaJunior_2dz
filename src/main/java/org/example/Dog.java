package org.example;

class Dog extends Animal {


    public Dog(String name, int age) {
        super(name, age);
    }

    public void makeSound() {
        System.out.println("гав");
    }

    public void roarDog() {
        System.out.println("Защищай!\"рррррр\"");
    }
}
