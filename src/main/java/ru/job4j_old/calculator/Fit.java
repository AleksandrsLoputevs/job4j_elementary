package ru.job4j_old.calculator;

public class Fit {

    public static double manWeight(int height) {
        double rsl = (height - 100) * 1.15;
        return rsl;
    }

    public static double womanWeight(int height) {
        double rsl = (height - 110) * 1.15;
        return rsl;
    }

    public static void main(String[] args) {
        int height = 187;
        double man = Fit.manWeight(height);
        System.out.println("Man 187 is " + man);
        double woman = Fit.womanWeight(height);
        System.out.println("Woman 187 is " + woman);
    }
}
