import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<HotDrinks> hotDrinksList = new ArrayList<>();
        hotDrinksList.add(new HotDrinks("Coffee", 350, 150, 80));
        hotDrinksList.add(new HotDrinks("Coffee", 400, 250, 85));
        hotDrinksList.add(new HotDrinks("GreenTea", 250, 200, 65));
        hotDrinksList.add(new HotDrinks("GreenTea", 300, 400, 65));
        hotDrinksList.add(new HotDrinks("BlackTea", 300, 250, 95));
        hotDrinksList.add(new HotDrinks("Cappuccino", 350, 350, 75));

        VendingMachineOfHotDrinks vendingMachine = new VendingMachineOfHotDrinks(hotDrinksList);
        vendingMachine.getProduct("Cappuccino");
        vendingMachine.getProduct("GreenTea");
        System.out.println(vendingMachine.getProduct("Coffee", 250));
    }
}
