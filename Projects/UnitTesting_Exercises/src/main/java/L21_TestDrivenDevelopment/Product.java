package L21_TestDrivenDevelopment;

public class Product implements Comparable<Product> {

    public String label;

    public double price;

    public int quantity;

    public Product(String label, double price, int quantity) {
        this.setLabel(label);
        this.setPrice(price);
        this.setQuantity(quantity);
    }

    public String getLabel() {
        return this.label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public int compareTo(Product o) {
        throw new UnsupportedOperationException();
    }
}
