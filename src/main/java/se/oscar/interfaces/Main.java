package se.oscar.interfaces;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        Bicycle bicycle = new Bicycle();
        Motorcycle motorcycle = new Motorcycle();
        Airplane airplane = new Airplane();
        Bird bird = new Bird();

        car.move();
        bicycle.move();

        motorcycle.move();
        motorcycle.makeSound();

        bird.fly();
        bird.makeSound();

        airplane.fly();
        airplane.makeSound();
    }
}