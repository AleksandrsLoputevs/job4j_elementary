package ru.job4j.condition;

public class Counter {

    public static int sum(int start, int finish) {
        int rsl = 0;
        for (int sum = start; sum <= finish; sum++) {
            System.out.println("sum = " + rsl);
            rsl = rsl + sum;
        }
        return rsl;
    }

    public static void main(String[] args) {
        System.out.println(sum(0, 10));
        System.out.println(sum(3, 8));
        System.out.println(sum(1, 1));
    }

}
