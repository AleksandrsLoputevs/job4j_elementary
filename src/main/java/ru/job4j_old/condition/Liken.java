package ru.job4j_old.condition;

public class Liken {
    public static void main(String[] args) {
        int first = 1;
        int second = 10;

        boolean result = first > second;
        System.out.println(result);

        result = first < second;
        System.out.println(result);

        result = first == second;
        System.out.println(result);
        result = first != second;
        System.out.println(result);
    }
}
