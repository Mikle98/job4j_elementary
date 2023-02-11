package ru.job4j.condition;

import java.util.concurrent.locks.Condition;

public class Max {
    public static int max(int left, int right) {
        return left > right ? left : right;
    }

    public static int max(int first, int second, int third) {
        return first > max(second, third) ? first : max(second, third);
    }

    public static int max(int first, int second, int third, int fourth) {
        return first > max(second, third, fourth) ? first : max(second, third, fourth);
    }

    public static void main(String[] args) {
        System.out.println(Max.max(5, 7));
        System.out.println(max(4, 5, 3));
        System.out.println(max(6, 8, 7, 4));
    }
}
