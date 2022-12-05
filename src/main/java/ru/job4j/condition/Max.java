package ru.job4j.condition;

import java.util.concurrent.locks.Condition;

public class Max {
    public static int max(int left, int right) {
        int result = left > right ? left : right;
        return result;

    }

    public static void main(String[] args) {
        System.out.println(Max.max(5, 7));
    }
}
