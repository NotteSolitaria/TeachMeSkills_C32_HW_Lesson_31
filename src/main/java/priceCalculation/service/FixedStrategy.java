package priceCalculation.service;

public class FixedStrategy implements DiscountStrategy {
    private final double discount;

    public FixedStrategy(double discount) {
        this.discount = discount;
    }

    @Override
    public double discount(double price) {
        return price - discount;
    }
}
