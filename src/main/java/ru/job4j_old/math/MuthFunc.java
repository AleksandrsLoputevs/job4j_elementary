package ru.job4j_old.math;

public class MuthFunc {
    public static int func1(int x) {
        int y = x * x + 1;
        return y;
    }

    public static int func2(int x) {
        int y = 1 / x;
        return  y;

    }

    public static void main(String[] args) {
        int result1 = MuthFunc.func1(3);
        int result2 = MuthFunc.func2(5);
        int result3 = MuthFunc.func1(100);
        int total = result1 + result2 + result3;
        System.out.println(total);
    }


}
