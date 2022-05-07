package ru.job4j.condition;

public class Max {
    public static void main(String[] args) {
        int result1 = Max.max(15 , 10);

        System.out.println("leeft 15 , right 10,max" + result1);
    }
    public static int max(int left, int right) {
        int result;

        if (left >= right) {
            result = left;
        } else if (left <= right) {
            result = left;

        }

        result = left >= right ? left : right;

        return result;


    }

}
