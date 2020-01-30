package ru.job4j.condition;

public class MultiMax {
    public int max(int first, int second, int third) {
        int condition = first >= second ? first : second;
        return condition >= third ? condition : third;
    }
}
