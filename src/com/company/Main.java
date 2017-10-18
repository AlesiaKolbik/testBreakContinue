package com.company;

public class Main {

    public static void main(String[] args) {
        int number = 10;
        int deviderCount = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                deviderCount++;
            }
        }
        if (deviderCount == 2) {
            System.out.println("Простое.");
        } else {
            System.out.println("Не простое.");
        }
    }


}