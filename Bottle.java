public class Bottle extends Product {
    
    private double volume;
    
    public Bottle(String name, Double cost, Double volume) {
        super(name, cost);
        this.volume = volume;
    }
    
    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }


    @Override
    public String toString() {
        return "{name=" + super.getName() + ",  cost=" + super.getCost()    + ",  volume=" + volume + "}";
    }
}
