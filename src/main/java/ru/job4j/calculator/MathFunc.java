package ru.job4j.calculator;

public class MathFunc {
    public static int parabola(int x) {
        int y = x * x + 1;
        return y;
    }

    public static int hyperbola(int x) {
        int y = 1 / x;
        return y;
    }

    public static void main(String[] args) {
        int result2 = MathFunc.parabola(5);
        int result1 = MathFunc.hyperbola(3);
        int result3 = MathFunc.parabola(100);
        int total = result1 + result2;
        System.out.println(total);
    }
}
