package ru.job4j.calculator;

/**
 * Class Calculator для вычисления арифметических операций + - * /
 * @author Artem Bazanov (atremjava@gmail.com)
 * since 12.01.2020
 * @version 1.1
 */
public class Calculator {
    /**
     * add - операция сложения первого аргумента с вторым
     * @param first - первый аргумент
     * @param second - второй аргумент
     * @return result - результат
     */
    public static void add(double first, double second) {
        double result =  first + second;
        System.out.println(first + " + " + second + " = " + result);
    }
    /**
     * div - операция деления первого аргумента на второй
     * @param first - первый аргумент
     * @param second - второй аргумент
     * @return result - результат
     */
    public static void div(double first, double second) {
        double result = first / second;
        System.out.println(first + " / " + second + " = " + result);
    }
    /**
     * multiply - операция умножения первого аргумента на второй
     * @param first - первый аргумент
     * @param second - второй аргумент
     * @return result - результат
     */
    public static void multiply(double first, double second) {
        double result = first * second;
        System.out.println(first + " * " + second + " = " + result);
    }
    /**
     * subtrack - операция вычитания первого элемента из второго
     * @param first - первый аргумент
     * @param second - второй аргумент
     * @return result - результат
     */
    public static void subtrack(double first, double second) {
        double result = first - second;
        System.out.println(first + " - " + second + " = " + result);
    }
    /**
     * main
     * @param args - args
     */
    public static void main(String[] args) {
        add(2, 1);
        div(4, 2);
        multiply(2, 1);
        subtrack(10, 5);

    }
}
