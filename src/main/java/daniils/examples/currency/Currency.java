package daniils.examples.currency;

import java.util.Map;

public class Currency {
    String sign;
    Map<String, Double> rates;

    public Currency(String sign, Map<String, Double> rates) {
        this.sign = sign;
        this.rates = rates;
    }
}
