package ru.job4j_old.converter;

public class Converter {
    public static float rubleToEuro(float value) {
        float rsl = value / 70;
        return rsl;
    }

    public static float rubleToDollar(float value) {
        float rsl = value / 60; /* формула перевода рублей в доллары. */
        return rsl;
    }

    public static void main(String[] args) {

//        float euro = Converter.rubleToEuro(140);
//        System.out.println("140 rubles are " + euro + " euro.");
//        float dollar = Converter.rubleToDollar(180);
//        System.out.println("180 rubles are " + dollar + " dollar ");
        float in = 140;
        float expected = 2;
        float out = Converter.rubleToEuro(in);
        boolean passed = expected == out;
        System.out.println("140 rubles are 2. Test result : " + passed);
        in = 180;
        expected = 3;
        out = Converter.rubleToDollar(in);
        passed = expected == out;
        System.out.println("160 rubles are 3. Test result : " + passed);
    }
}
