
import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Product> list = new ArrayList<Product>(Arrays.asList(new Product("Mars", 2.2), new Product("Nuts", 3.2)));

        VendingMachine vendingMachine = new VendingMachine(list);
        String key = "Mars";
        System.out.println(vendingMachine.getProductByName(key));

        List<Product> listBottle = new ArrayList<Product>(
                Arrays.asList(new Bottle("Cola", 2.2, 0.5), new Bottle("Sprite", 3.2, 0.5)));

        VendingMachine bottleMachine = new BottleMachine(listBottle);
        String keyBottle = "Cola";
        System.out.println(bottleMachine.getProductByName(keyBottle));

        List<Product> listHotDrinks = new ArrayList<Product>(
                Arrays.asList(new HotDrinks("Tea", 4.3, 80), new HotDrinks("Coffee", 5.2, 75), new HotDrinks("lemonTea", 2.3, 87) ));
        String keyHotDrinks = "Coffee";

        VendingMachine hotDrinksMachine = new HotDrinksMachine(listHotDrinks);

        System.out.println(hotDrinksMachine.getProductByName(keyHotDrinks));
        


    }

}
