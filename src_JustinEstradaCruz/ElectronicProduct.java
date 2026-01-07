public class ElectronicProduct extends Product implements Returnable {

    public ElectronicProduct(String name, double price, ProductStatus status) {
        super(name, price, status);
    }

    @Override
    public double calculateDiscount() {
        return getPrice() * 0.02;
    }

    @Override
    public boolean canBeReturned(int daysSincePurchase) {
        return daysSincePurchase <= 15;
    }

}
