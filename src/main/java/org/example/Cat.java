package org.example;

class Cat extends Animal {

    public Cat(String name, int age) {
        super(name, age);
    }

    public void makeSound() {
        System.out.println("мяу");
    }

    public void roarCat() {
        System.out.println("Защищай!\"шшшшшш\"");
    }
}