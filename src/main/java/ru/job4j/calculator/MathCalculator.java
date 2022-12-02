package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {
    public static double sumAndMultiply(double first, double second) {
        return sum(first, second)
                + multiply(first, second);
    }

    public static double sumAllOperations(double first, double second) {
        return sum(first, second)
                + multiply(first, second)
                + diff(first, second)
                + div(first, second);
    }

    public static  double sumDivAndDiff(double first, double seocnd) {
        return div(first, seocnd)
                + diff(first, seocnd);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета равен: " + sumAndMultiply(10, 20));
        System.out.println("Результат расчета равен: " + sumAllOperations(10, 20));
        System.out.println("Результат расчета равен: " + sumDivAndDiff(10, 20));
    }
}
