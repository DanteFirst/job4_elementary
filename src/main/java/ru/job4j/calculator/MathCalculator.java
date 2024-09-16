package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {

    public static double sumAndMultiply(double first, double second) {
        return sum(first, second)
                + multiply(first, second);
    }

    public static double substractionAndDivision(double first, double second) {
        return subtraction(first, second)
                + division(first, second);
    }

    public static double sumAll(double first, double second) {
        return sumAndMultiply(first, second) + substractionAndDivision(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета равен: " + sumAndMultiply(10, 20));
        System.out.println("Сумма разности и деления: " + substractionAndDivision(100, 20));
        System.out.println("Сумма всех операций: " + sumAll(20, 4));
    }
}
