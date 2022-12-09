package ru.job4j.array;

public class Turn {
    public static int[] back(int[] array) {
        int temp;
        int countI = array.length % 2 == 0 ? array.length / 2 : (array.length - 1) / 2;
        for (int i = 0; i < countI; i++) {
            temp = array[i];
            array[i] = array[array.length - (1 + i)];
            array[array.length - (1 + i)] = temp;
        }
        return array;
    }
}
