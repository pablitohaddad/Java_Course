package util;

public class CurrencyConverter {

    public static final double IOF = 0.06;

    public static double valueReais(double valueDolar, double boughtDollar){

        return ((boughtDollar * IOF) + boughtDollar) * valueDolar;

    }



}
