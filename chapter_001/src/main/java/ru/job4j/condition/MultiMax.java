package ru.job4j.condition;

public class MultiMax {
    public int max(int first, int second, int third) {
        boolean firstCondition = first >= second;
        int firstResult = firstCondition ? first : second;

        boolean condition = firstResult >= third;

        return condition ? firstResult : third;
    }
}
