package daniils.examples;

public class BooleanExpressionExplain {
    @Deprecated private final String name = "";

    public static void main(String[] args) {

        short one = 10;
        int two = 99999999;
        long three = 9999999;

        three = two; // int -> long
        one = (short) three; // int -> short
        System.out.println("one = " + one);
        System.out.println("two = " + two);
        System.out.println("three = " + three);

        int income = 90;

        if (income % 2 == 0) {
            System.out.println("4jotnoe");
        } else {
            System.out.println("ne 4jotnoe");
        }

        boolean rsl = false;
        rsl = true && true; // true
        rsl = true && false; // false
        rsl = false && true; // false
        rsl = false && false; // false

        rsl = true || true; // true
        rsl = true || false; // true
        rsl = false || true; // true
        rsl = false || false; // false

        // -73
        rsl = income > 0 && income < 100;

        int age = 17;
        String name = "Vasja Petrov";
        rsl = age > 18 || name.equals("Vasja Na6");

        if (income > 1) {
            System.out.println("A");
            System.out.println("B");
        }
    }
}
