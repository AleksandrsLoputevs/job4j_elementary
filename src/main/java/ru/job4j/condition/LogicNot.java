package ru.job4j.condition;

public class LogicNot {
    public static boolean isEven(int num) {
        return num % 2 == 0;
    }

    public static boolean isPositive(int num) {
        return num > 0;
    }

    public static boolean notEven(int num) {
        return !isEven(num);
    }

    public static boolean notPositive(int num) {
        return num < 0;
    }

    public static boolean notEvenAndPositive(int num) {
        return notEven(num) && isPositive(num);
    }


    public static boolean evenOrNotPositive(int num) {
        return isEven(num) || notPositive(num);
    }

    public static void main(String[] args) {
        boolean isEven = isEven(3);
        System.out.println("isEven = " + isEven);
        boolean isPositive = isPositive(4);
        System.out.println("isPositive =" + isPositive);
        boolean notEvon = notEven(5);
        System.out.println("notEven =" + notEvon);
        boolean notPositive = notPositive(0);
        System.out.println("notPositive =" + notPositive);
        boolean notEvenAndPositive = notEvenAndPositive(4);
        System.out.println("notEvenAndPositive =" + notEvenAndPositive);
        boolean evenOrNotPositive = evenOrNotPositive(6);
        System.out.println("evenOrNotPositive =" + evenOrNotPositive);



    }
}
