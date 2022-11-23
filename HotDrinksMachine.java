import java.util.*;

public class HotDrinksMachine extends VendingMachine {

    public HotDrinksMachine(List<Product> list) {
        super(list);
    }

    public Product getProductByParametrs(String name, Double cost, Integer temperature) {

        for (Product item : getList()) {
            if (name.equals(item.getName())) {
                if (cost.equals(item.getCost())) {
                    if (temperature.equals(item.getTemperature())) {
                        return item;
                    }
                }
            }
        }
        throw 
        new IllegalStateException("Product not found");

    }

}
