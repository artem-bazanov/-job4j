package ru.job4j.poly;

public class Bus implements Transport {

    @Override
    public void go() {
        System.out.println("We can go");
    }

    @Override
    public void passengers(int passengers) {
        System.out.println("passengers number is " + passengers);
    }

    @Override
    public int fillUp(int price) {
        int fillUp = 40;
        price = 47 * fillUp;
        return price;
    }
}
