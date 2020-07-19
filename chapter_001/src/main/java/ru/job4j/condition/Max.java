package ru.job4j.condition;

public class Max {
    public static int max(int first, int second) {
        boolean condition = first >= second;
        return condition ? first : second;
    }
}
