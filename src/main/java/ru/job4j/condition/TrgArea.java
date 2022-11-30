package ru.job4j.condition;

public class TrgArea {
    public static double area(double a, double b, double c) {
        double p = (a + b + c) / 2;
        double diffPA = p - a;
        double diffPB = p - b;
        double diffPC = p - c;
        double multiAll = p * diffPA * diffPB * diffPC;
        double rsl = Math.sqrt(multiAll);
        return rsl;
    }

    public static void main(String[] args) {
        double rsl = TrgArea.area(2, 2, 2);
        System.out.println("area (2, 2, 2) = " + rsl);
    }
}
