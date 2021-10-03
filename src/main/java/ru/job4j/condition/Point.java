package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        double stepOne = x2 - x1;
        double stepTwo = y2 - y1;
        double stepThree = Math.pow(stepOne, 2);
        double stepFour = Math.pow(stepTwo, 2);
        double stepFive = stepThree + stepFour;
        double stepSix = Math.sqrt(stepFive);
        return stepSix;
    }

    public static void main(String[] args) {
        double result = Point.distance(25, 25, 50, 50);
        System.out.println("result (0, 0) to (2, 0) " + result);
    }
}
