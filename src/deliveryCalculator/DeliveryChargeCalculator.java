package deliveryCalculator;

import java.math.BigDecimal;

public interface DeliveryChargeCalculator {
    default BigDecimal getDeliveryCharge(double weight, BigDecimal price) {

        BigDecimal originPrice = price;

        BigDecimal small = new BigDecimal("1000.0");
        BigDecimal middle = new BigDecimal("5000.0");
        BigDecimal big = new BigDecimal("10000.0");

        if (weight < 3) {
            System.out.println("1천원");
            price = price.add(small);
        } else if (weight < 10) {
            System.out.println("5천원");
            price = price.add(middle);
        } else if (weight >= 10) {
            System.out.println("1만원");
            price = price.add(big);
        }

        BigDecimal normal = new BigDecimal("30000.0");
        BigDecimal discount = new BigDecimal("100000.0");

        if(price.compareTo(normal) < 0){
            System.out.println("무게 단위 배송비 적용");
            return price;
        }
        else if (price.compareTo(discount) < 0) {
            System.out.println("배송비 천원 할인");
            return price = price.subtract(small);
        }

        System.out.println("배송비 무료");
        return originPrice;
    }
}
