package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        int diffX = x2 - x1;
        int diffY = y2 - y1;
        double stepenX = Math.pow(diffX, 2);
        double stepenY = Math.pow(diffY, 2);
        double sumXY = stepenX + stepenY;
        double rsl = Math.sqrt(sumXY);
        return rsl;
    }

    public static void main(String[] args) {
        double result = Point.distance(0, 0, 2, 0);
        System.out.println("result (0, 0) to (2, 0) " + result);
        double result2 = Point.distance(1, 2, 3, 4);
        System.out.println("result2 (1, 2) to (3, 4) " + result2);
    }
}
