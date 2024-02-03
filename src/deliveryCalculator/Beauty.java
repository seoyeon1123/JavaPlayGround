package deliveryCalculator;

import java.math.BigDecimal;

public class Beauty extends Product implements DeliveryChargeCalculator {

    public Beauty(String name, BigDecimal price, double weight) {
        super(name, price, weight);
    }

}
