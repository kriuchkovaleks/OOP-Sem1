

public class HotDrinks extends Product {
    private int temperature;

    public HotDrinks(String name, Double cost, int temperature) {
        super(name, cost);
        this.temperature = temperature;
    }

    

      public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    


@Override
public String toString() {

    return "{name=" + super.getName() + ",  cost=" + super.getCost()    + ",  temperature=" + temperature + "}";
}

}
