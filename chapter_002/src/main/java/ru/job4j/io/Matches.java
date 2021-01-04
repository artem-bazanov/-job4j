package ru.job4j.io;

import java.util.Scanner;

public class Matches {
    public static void main(String[] args) {
        int number = 11;
        boolean player = true;
        Scanner input = new Scanner(System.in);
        while (number > 0) {
            System.out.println("На столе " + number + " спичек, вытяните от 1 до 3");
            int select = Integer.parseInt(input.nextLine());
            player = !player;
            if (select < 1 || select > 3) {
                System.out.println("Вы ввели неверное число, можно вытянуть от 1 до 3 спичек ");
                continue;
            }
            number -= select;
            System.out.println();
        }
        if (player) {
            System.out.println("Победил первый игрок!");
        } else {
            System.out.println("Победил второй игрок!");
        }
    }
}
