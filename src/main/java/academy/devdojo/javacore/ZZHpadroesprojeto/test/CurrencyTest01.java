package academy.devdojo.javacore.ZZHpadroesprojeto.test;

import academy.devdojo.javacore.ZZHpadroesprojeto.dominio.Country;
import academy.devdojo.javacore.ZZHpadroesprojeto.dominio.Currency;
import academy.devdojo.javacore.ZZHpadroesprojeto.dominio.CurrencyFactory;


public class CurrencyTest01 {
    public static void main(String[] args) {
        Currency currency = CurrencyFactory.newCurrency(Country.BRAZIL);
        System.out.println(currency.getSymbol());
    }
}
