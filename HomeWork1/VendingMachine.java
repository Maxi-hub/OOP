public interface VendingMachine {

    public HotDrinks getProduct(String name);

    public Product getProduct(String name, int volume);

    public Product getProduct(String name, int volume, int temperature);


}

