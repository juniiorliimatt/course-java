package curso.entities;

public class CurrencyConverter {
    private static final double IOF = 0.06;
    private CurrencyConverter(){}

    public static double calculate(double priceDollar, double dollars){
        return valueInReals(priceDollar, dollars) + calculeIOF(priceDollar, dollars);
    }

    private static double valueInReals(double priceDollar, double dollars){
        return dollars * priceDollar;
    }

    private static double calculeIOF(double priceDollar, double dollars){
        return valueInReals(priceDollar, dollars) * IOF;
    }
}
