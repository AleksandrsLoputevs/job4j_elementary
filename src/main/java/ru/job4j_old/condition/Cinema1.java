package ru.job4j_old.condition;

public class Cinema1 {
    public static void access(int age) {
        System.out.println("The age of the customer is : " + age);
        if (age == 21) {
            System.out.println("Welcome to the cinema.");
        } else {
            System.out.println("It is not for you.");
        }
    }

    public static void main(String[] args) {
        Cinema1.access(21);
        Cinema1.access(16);

    }
}
