package main;

public class App {
    public static void main(String[] args) {
        Animal animal = new Animal("Onni", "cat", 10);
        System.out.println(animal.name);
        System.out.println(animal.species);
        System.out.println(animal.age);
    }
}