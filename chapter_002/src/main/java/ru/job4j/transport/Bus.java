package ru.job4j.transport;

public class Bus implements Vehicle{
    @Override
    public void move() {
        System.out.println(getClass().getSimpleName() + ": Can drives on the road");
    }
}
