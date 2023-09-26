import java.util.List;

public class VendingMachineOfHotDrinks implements VendingMachine {
    List<HotDrinks> productList;

    public VendingMachineOfHotDrinks(List<HotDrinks> productList) {
        this.productList = productList;
    }

    public List<HotDrinks> getProductList() {
        return productList;
    }

    public void setProductList(List<HotDrinks> productList) {
        this.productList = productList;
    }

    @Override
    public HotDrinks getProduct(String name) {
        for (HotDrinks product : productList) {
            if (product.getName().equals(name)) {
                System.out.println(product);
            }
        }
        return null;
    }


    @Override
    public Product getProduct(String name, int volume) {
        for (HotDrinks product : productList) {
            if (product.getName().equals(name) && product.getVolume() == volume) {
                return product;
            }
        }
        return null;
    }

    @Override
    public Product getProduct(String name, int volume, int temperature) {
        for (HotDrinks product : productList) {
            if (product.getName().equals(name)) {
                return product;
            }
            if (product.getVolume() == volume) {
                return product;
            }
            if (product.getTemperature() == temperature) {
                return product;
            }
        }
        return null;
    }
}

