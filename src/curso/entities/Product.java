package curso.entities;

public class Product {
    private String name;
    private double price;
    private int quantity;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return this.price;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public double totalValueInStock() {
        return this.quantity * this.price;
    }

    public void addProducts(int quantity) {
        this.quantity += quantity;
    }

    public void removeProducts(int quantity) {
        this.quantity -= quantity;
    }

    @Override
    public String toString() {
        return "Product data: " + name + ", $ " + String.format("%.2f", price) + ", " + quantity + ", units" + ", Total" +
                ": $" + String.format("%.2f", totalValueInStock()) + "\n";
    }
}
