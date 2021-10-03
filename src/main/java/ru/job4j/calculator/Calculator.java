package ru.job4j.calculator;

public class Calculator {
    public static void plus(int first, int second) {
        int result = first + second;
        System.out.println(result);
    }

    public static void main(String[] args) {
        int size = 10;
        size = size + 100;
        size = size / 5;
        System.out.println(size / 5);
        Calculator.plus(1, 2);
        Calculator.plus(10, 11);
        Calculator.plus(100,400);
        Calculator.plus(4,9);
        Calculator.plus (60,90);


    }
};








