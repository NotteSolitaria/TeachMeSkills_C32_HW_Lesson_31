package priceCalculation.service;

public class PercentageStrategy implements DiscountStrategy {
    private final double percentage;

    public PercentageStrategy(double percentage) {
        this.percentage = percentage;
    }

    @Override
    public double discount(double price) {
        return price * (1 - percentage / 100);
    }
}
