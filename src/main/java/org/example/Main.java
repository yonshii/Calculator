package org.example;

import org.example.Calculator;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        System.out.println("Сума: " + calculator.sum(12, 8));
        System.out.println("Різниця: " + calculator.riznytsya(43, 12));
        System.out.println("Добуток: " + calculator.dobytok(2, 7));
        System.out.println("Поділ: " + calculator.podil(10, 5));
    }
}