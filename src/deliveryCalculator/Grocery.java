package deliveryCalculator;

import java.math.BigDecimal;

public class Grocery extends Product implements DeliveryChargeCalculator{

    public Grocery(String name, BigDecimal price, double weight) {
        super(name, price, weight);
    }

    @Override
    public void print() {
        System.out.println(name + "의 가격은 : " + price + "입니다. 배송비 포함 금액은 : " + getDeliveryCharge(weight,price) +"입니다.");
    }
}
