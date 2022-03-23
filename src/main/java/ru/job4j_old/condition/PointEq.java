package ru.job4j_old.condition;

public class PointEq {
    public static boolean eq(int x1, int y1, int x2, int y2) {

//        boolean eqX = x1 == x2;
//        boolean eqY = y1 == y2;
//        if (eqX && eqY) {
//            return true;
//        } else {
//            return false;
//        }
        return (x1 == x2) && (y1 == y2);
    }

    public static void main(String[] args) {
        System.out.println(eq(1, 1, 2, 2));
        System.out.println(eq(10, 10, 10, 10));

//        int a;
        boolean a = true;
        a = (2 + 2) == 4;
        a = getValue();
//        a = 7 + 9;

        String example;
        example = "sout = ";
        example += 17 * 4;
//        example = getStr();
//        System.out.println(example);





    }

    public static boolean getValue() {
        return false;
    }
    public static String getStr() {
        return "";
    }
}
