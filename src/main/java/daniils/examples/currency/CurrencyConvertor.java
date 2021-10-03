package daniils.examples.currency;

// USD GBP EUR

// USD - GBP - 0.72
// USD - EUR - 0.85
// USD - RUB - 73,19

// GBP - USD - 1,38
// GBP - EUR - 1,17
// GBP - RUB - 101,25

// EUR - USD - 1,18
// EUR - GBP - 0,85
// EUR - RUB - 86,47

// RUB - USD - 0,014
// RUB - GBP - 0,0099
// RUB - EUR - 0,012

// Formula : from amount to
// Example : USD 10 GBP

import java.util.ArrayList;
import java.util.Map;

// Answer : amount to
// Example : 99 GBP
public class CurrencyConvertor {
    public static void main(String[] args) {
//        String example = "USD 10 GBP";
        String example = "RUB 1700 USD";
        String[] incomeSplit = example.split(" ");
        Income income = new Income(incomeSplit[0], Double.parseDouble(incomeSplit[1]), incomeSplit[2]);


        ArrayList<Currency> currencies = new ArrayList<>();
        currencies.add(new Currency("USD", Map.of(
                "GBP", 0.72,
                "EUR", 0.85,
                "RUB", 73.19
        )));
        currencies.add(new Currency("GBP", Map.of(
                "USD", 1.38,
                "EUR", 1.17,
                "RUB", 101.25
        )));
        currencies.add(new Currency("EUR", Map.of(
                "USD", 1.18,
                "GBP", 0.85,
                "RUB", 86.47
        )));
        currencies.add(new Currency("RUB", Map.of(
                "USD", 0.014,
                "GBP", 0.0099,
                "EUR", 0.012
        )));

        for (Currency each : currencies) {
            if (each.sign.equals(income.from)) {
                Double rate = each.rates.get(income.to);
                if (rate != null) {
                    System.out.println((rate * income.amount) + " " + income.to);
                }
            }
        }


//        if (currency[0].equals("USD") && currency[2].equals("GBP")) {
//            System.out.println("GBP " + (Integer.parseInt(currency[1]) * 0.72));
//        } else if (currency[0].equals("USD") && currency[2].equals("EUR")) {
//            System.out.println("EUR " + (Integer.parseInt(currency[1]) * 0.85));
//        } else if (currency[0].equals("GPB") && currency[2].equals("USD")) {
//            System.out.println("USD " + (Integer.parseInt(currency[1]) * 1.38));
//        } else if (currency[0].equals("GPB") && currency[2].equals("EUR")) {
//            System.out.println("EUR " + (Integer.parseInt(currency[1]) * 1.17));
//        } else if (currency[0].equals("EUR") && currency[2].equals("USD")) {
//            System.out.println("USD " + (Integer.parseInt(currency[1]) * 1.18));
//        } else if (currency[0].equals("EUR") && currency[2].equals("GBP")) {
//            System.out.println("GBP " + (Integer.parseInt(currency[1]) * 0.85));
//        }

    }
}

