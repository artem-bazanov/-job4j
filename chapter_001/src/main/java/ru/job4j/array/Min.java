package ru.job4j.array;

public class Min {
    public static int findMin(int[] array) {
        int min = array[0];
        for (int value : array) {
            if (min >= value) {
                min = value;
            }
        }
        return min;
    }
}
