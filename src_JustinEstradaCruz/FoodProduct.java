public class FoodProduct extends Product {

    private String expirationDate;
    private boolean organic;

    public FoodProduct(String name, double price, String expirationDate, boolean organic, ProductStatus status) {
        super(name, price, status);
        this.expirationDate = expirationDate;
        this.organic = organic;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public boolean isOrganic() {
        return organic;
    }

    @Override
    public double calculateDiscount() {
        return getPrice() * 0.1;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", FoodProduct{expirationDate='" + expirationDate +
                "', organic=" + organic + "}";
    }
}
