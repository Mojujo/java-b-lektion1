package se.oscar.interfaces;

public class Bicycle implements Movable {

    @Override
    public void move() {
        System.out.println("Bicycle moved");
    }
}
