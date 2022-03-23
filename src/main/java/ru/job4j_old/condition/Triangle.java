package ru.job4j_old.condition;

public class Triangle {
    public static boolean exist(double ab, double ac, double bc) {
        boolean step1 = ab + ac > bc;
         boolean step2 = ac + bc > ab;
         boolean step3 = ab +bc > ac;
        return step1 && step2 && step3 ;

    }
}
