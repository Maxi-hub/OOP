public class HotDrinks extends Product {
    private int temperature;

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public HotDrinks(String name, double price, int volume, int temperature) {
        super(name, price, volume);
        this.temperature = temperature;
    }

    @Override
    public String toString() {
        return "HotDrinks{" +
                "name: " + super.getName() +
                ", volume: " + super.getVolume() +
                ", temperature: " + temperature +
                '}';
    }
}
