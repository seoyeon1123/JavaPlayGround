package deliveryCalculator;
import java.math.BigDecimal;

public class Product {
    protected String name;
    protected BigDecimal price;
    protected double weight;

    public Product(String name, BigDecimal price, double weight){
        this.name = name;
        this.price = price;
        this.weight = weight;
    }




}
