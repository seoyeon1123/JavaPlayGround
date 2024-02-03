package deliveryCalculator;

import java.math.BigDecimal;

public class LargeAppliance extends Product implements DeliveryChargeCalculator{

    public LargeAppliance(String name, BigDecimal price, double weight) {
        super(name, price, weight);
    }
}
