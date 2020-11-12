package ru.job4j.io;

import java.util.Scanner;

public class Matches {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = 11;
        String player1 = "Игрок 1";
        String player2 = "Игрок 2";
        String winner = "";
        while (number > 0 ){
            System.out.println("На столе " + number + " спичек, " + player1 + ", вытяните от 1 до 3");
            int select = Integer.parseInt(input.nextLine());
            if (select > 0 && select < 4){
                number = number - select;
                winner = player1;
            }
            System.out.println("На столе " + number + " спичек, " + player2 + ", вытяните от 1 до 3");
            int select1 = Integer.parseInt(input.nextLine());
            if (select1 > 0 && select1 < 4){
                number = number - select1;
                winner = player2;
            }
            else {
                System.out.println("Вы ввели неверное число, можно вытянуть от 1 до 3 спичек");
            }
        }
        System.out.println("Игра окончена, победил " + winner);
    }
}
