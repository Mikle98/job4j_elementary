package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        short[] ages = new short[10];
        String[] surname = new String[100500];
        float[] prices = new float[40];

        System.out.println(ages.length);
        System.out.println(surname.length);
        System.out.println(prices.length);

        String[] names = new String[5];
        names[0] = "Petr Arsentev";
        names[1] = "Stas Korobeinikov";
        names[2] = "Elena Kartashova ";
        names[3] = "Mikhail Lukonin";
        names[4] = "Andrei Hincu";

        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
    }
}
