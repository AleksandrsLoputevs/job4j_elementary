package ru.job4j_old.converter;

public class Converter2 {
    public static float rubleToEuro(float value) {
        float rsl = value / 80;
        return rsl;
    }

    

    public static float rubleToDollar(float value) {
        float rsl = value / 70;
        return rsl;

    }


    public static void main(String[] args) {
        float euro = Converter2.rubleToEuro(150);
        System.out.println("150 rubles are " + euro + " euro ");
        float dollar = Converter2.rubleToDollar(150);
        System.out.println("150 rubles are" + dollar + " dollar ");

    }


}
