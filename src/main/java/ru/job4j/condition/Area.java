package ru.job4j.condition;

public class Area {
    public static double square(double height, double width) {
    double rsl =     (height * width);
    return rsl;
}

    public static void main(String[] args) {
        double result1 = Area.square(4, 1);
        System.out.println(" height 4 * width 1 real = " + result1);
    }
}
