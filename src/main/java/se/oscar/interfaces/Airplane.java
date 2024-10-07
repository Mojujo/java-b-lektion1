package se.oscar.interfaces;

public class Airplane implements Flyable, Soundable {
    @Override
    public void fly() {
        System.out.println("Airplane is flying");
    }
    public void makeSound() {
        System.out.println("The Engines are roaring");
    }
}
