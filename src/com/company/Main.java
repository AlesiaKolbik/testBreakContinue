package com.company;

public class Main {

    public static void main(String[] args) {
        int number = 7;
        while (number % 1 == 0) {
            while (number % number == 0) {
                System.out.println("Простое.");
            }
        }

        System.out.println("Не простое.");

    }
}
