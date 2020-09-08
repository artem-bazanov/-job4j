package ru.job4j.condition;

public class Max {
    public static int max(int first, int second) {
        boolean condition = first >= second;
        return condition ? first : second;
    }
    public static int max(int first, int second, int third) {
        int condition = max(first, second);
        return max(condition, third);
    }
    public static int max(int first, int second, int third, int fourth) {
        return max( max(first,second), max(third,fourth) );
    }
}
