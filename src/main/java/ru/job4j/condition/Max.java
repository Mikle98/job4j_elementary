package ru.job4j.condition;

import java.util.concurrent.locks.Condition;

public class Max {
    public static int max(int left, int right) {
        return left > right ? left : right;
    }

    public static void main(String[] args) {
        System.out.println(Max.max(5, 7));
    }
}
