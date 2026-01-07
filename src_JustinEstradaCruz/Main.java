public class Main {
    public static void main(String[] args) {
        // Product product = new Product("Laptop", 999.99);
        Product p2 = new FoodProduct("Leche", 1200, "2024-12-31", true, ProductStatus.DISCONTINUED);
        ElectronicProduct p3 = new ElectronicProduct("Mouse", 1200, ProductStatus.AVAILABLE);

        System.out.println(p2);
        System.out.println(p3.getName());
        System.out.println("p2.isAvailable(): " + p2.isAvailable());
        System.out.println("p3.isAvailable(): " + p3.isAvailable());

        System.out.println(p3.canBeReturned(10));

        // System.out.println(product);
        // System.out.println("Product Name: " + product.getName());
        // System.out.println("Product Price: " + product.getPrice());

        // System.out.println("Tax: " + Product.calculateTax(product.getPrice()));

        System.out.println("Discount: " + p2.calculateDiscount());
        System.out.println("Discount: " + p3.calculateDiscount());

    }

}
