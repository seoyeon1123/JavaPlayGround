package deliveryCalculator;

import java.math.BigDecimal;

public class ProductMain {
    public static void main(String[] args) {
        Beauty mac = new Beauty("MAC",new BigDecimal("40000.0"), 1);
        Grocery noodle = new Grocery("NOODLE",new BigDecimal("5000.0"),3);
        LargeAppliance tv = new LargeAppliance("TV",new BigDecimal("2000000.0"),40);

        System.out.println("MAC : " + mac.getDeliveryCharge(mac.weight,mac.price));
        System.out.println("NOODLE : " + noodle.getDeliveryCharge(noodle.weight,noodle.price));
        System.out.println("TV : " + tv.getDeliveryCharge(tv.weight,tv.price));

    }
}
