package ru.job4j;

public class ArgMethod {


    public static void main(String[] args) {
        String name = "Alik";
        int age =54;
        ArgMethod.hello(name, );
        ArgMethod.hello(name, 37);
        ArgMethod.hello("Tanja", 88);
        ArgMethod.hello("gena", 40);
    }
    public static void hello(String name,int age){

        System.out.println("hello, " + name + ", age = " + age );
    }
    public static  void hello2(String name,int age) {

    }
}
