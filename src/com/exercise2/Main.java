package com.exercise2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int min = 0;
        int max = 10;
        double target = Math.random() * (max - min + 1);
        double num = Math.floor(target) + min;
        int guess = 0;
        Scanner scanner = new Scanner(System.in);


        while (guess != num) {
            System.out.print("Enter a number between " + min + " and " + max + "==>");
            guess = scanner.nextInt();
            if (guess == num) {
                System.out.println("Great!");
            } else if (guess < num) {
                System.out.println("too low!");
            } else {
                System.out.println("too high!");
            }
        }
    }

}

