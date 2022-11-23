import java.util.*;

public class VendingMachine {

    private final List<Product> list; // = new ArrayList<>();

    public VendingMachine(List<Product> list) {
        this.list = list;
    }

    public Product getProductByName(String name) {

        for (Product item : this.list) {
            if (name.equals(item.getName())) {
                return item;
            }
        }
        throw new IllegalStateException("Product not found");
    }


    public List<Product> getList() {
        return this.list;
    }
}
