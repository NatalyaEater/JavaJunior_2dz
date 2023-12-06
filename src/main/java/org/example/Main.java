package org.example;
import java.lang.reflect.Method;

/*
* Задача 1:
Создайте абстрактный класс "Animal" с полями "name" и "age".
Реализуйте два класса-наследника от "Animal" (например, "Dog" и "Cat") с уникальными полями и методами.
Создайте массив объектов типа "Animal" и с использованием Reflection API выполните следующие действия:
Выведите на экран информацию о каждом объекте.
Вызовите метод "makeSound()" у каждого объекта, если такой метод присутствует.*/

public class Main {
    public static void main(String[] args) {
        Animal[] animals = new Animal[4];
        animals[0] = new Cat("Миса", 1);
        animals[1] = new Cat("Бася", 2);
        animals[2] = new Dog("Рекс", 3);
        animals[3] = new Dog("Дарик", 4);


        for (Animal animal : animals) {
            System.out.println("Вид живортного : " + animal.getClass().getSimpleName()+"\n"+"Имя:" + animal.name +"\n" +"Возраст: " + animal.age );
            Class<?> animalClass = animal.getClass();
            try {
                System.out.println("Голос!");
                Method makeSoundMethod = animalClass.getDeclaredMethod("makeSound");
                makeSoundMethod.invoke(animal);
                if (animal instanceof Cat) {
                    Method roarCatMethod = animalClass.getDeclaredMethod("roarCat");
                    roarCatMethod.invoke(animal);
                } else if (animal instanceof Dog) {
                    Method roarDogMethod = animalClass.getDeclaredMethod("roarDog");
                    roarDogMethod.invoke(animal);
                }
                System.out.println();
            } catch (Exception e) {
                System.out.println("Method not found: " + e.getMessage());
            }
        }
    }
}