package se.oscar.interfaces;

public class Motorcycle implements Movable, Soundable {
    @Override
    public void move() {
        System.out.println("Motorcycle moves");
    }
    public void makeSound() {
        System.out.println("Motorcycle goes vroom");
    }
}
