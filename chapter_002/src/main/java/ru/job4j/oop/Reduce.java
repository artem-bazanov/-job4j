package ru.job4j.oop;

public class Reduce {
    private int[] arrayOne;

    public void to(int[] array) {
        arrayOne = array;
    }

    public void print() {
        for (int index = 0; index < arrayOne.length; index++) {
            System.out.println(arrayOne[index]);
        }
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3};
        Reduce reduce = new Reduce();
        reduce.to(array);
        reduce.print();
    }
}
