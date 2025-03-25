package priceCalculation.service;

public class CustomerStrategy implements DiscountStrategy{
    private static final double customerPercentage = 30;

    @Override
    public double discount(double price) {
        return price * (1 - customerPercentage / 100);
    }
}
