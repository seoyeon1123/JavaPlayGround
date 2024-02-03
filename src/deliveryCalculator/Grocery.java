package deliveryCalculator;

import java.math.BigDecimal;

public class Grocery extends Product implements DeliveryChargeCalculator{

    public Grocery(String name, BigDecimal price, double weight) {
        super(name, price, weight);
    }
}
