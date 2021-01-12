package ru.job4j.transport;

public class Plane implements Vehicle{
    @Override
    public void move() {
        System.out.println(getClass().getSimpleName() + ": Can Fly");
    }
}
