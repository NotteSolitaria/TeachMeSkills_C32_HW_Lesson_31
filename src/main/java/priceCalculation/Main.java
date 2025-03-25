package priceCalculation;

import priceCalculation.service.Calculator;
import priceCalculation.service.CustomerStrategy;
import priceCalculation.service.FixedStrategy;
import priceCalculation.service.PercentageStrategy;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        double price = 200.0;

        calculator.setStrategy(new FixedStrategy(20));
        System.out.println("The price with fixed discount is: " + calculator.calculatePrice(price));

        calculator.setStrategy(new PercentageStrategy(40));
        System.out.println("The price with percentage discount is: " + calculator.calculatePrice(price));

        calculator.setStrategy(new CustomerStrategy());
        System.out.println("The price with customer discount is: " + calculator.calculatePrice(price));
    }
}
