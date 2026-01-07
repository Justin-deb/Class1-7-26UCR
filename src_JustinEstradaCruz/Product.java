public abstract class Product {
    private String name;
    private double price;
    private ProductStatus status;

    public Product(String name, double price, ProductStatus status) {
        this.name = name;
        this.price = price;
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public ProductStatus getStatus() {
        return status;
    }

    public void setStatus(ProductStatus status) {
        this.status = status;
    }

    public boolean isAvailable() {
        return this.status == ProductStatus.AVAILABLE;
    }

    public static double calculateTax(double price) {
        return price * 0.13;
    }

    public abstract double calculateDiscount();

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Product{name='" + name + "', price=" + price + "}";
    }
}