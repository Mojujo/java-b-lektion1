package se.oscar.interfaces;

public class Bird implements Flyable, Soundable {

    @Override
    public void fly() {
        System.out.println("The bird flies");
    }
    public void makeSound() {
        System.out.println("The bird tweets");
    }
}
