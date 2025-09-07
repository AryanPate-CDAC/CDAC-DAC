class Product {
    private int productId;
    private String name;
    private double price;

    Product(int productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }

    public int getProductId() {
        return productId;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}

abstract class CartItem {
    abstract double calculateTotalPrice();
}

interface Discountable {
    void applyDiscount(double percentage);
}

class Cart extends CartItem {
    java.util.List<Product> products = new java.util.ArrayList<>();

    void addProduct(Product p) {
        products.add(p);
    }

    double calculateTotalPrice() {
        double total = 0;
        for(Product p : products) {
            total += p.getPrice();
        }
        return total;
    }
}

class DiscountProduct extends Product implements Discountable {
    DiscountProduct(int productId, String name, double price) {
        super(productId, name, price);
    }

    public void applyDiscount(double percentage) {
        setPrice(getPrice() - (getPrice() * percentage / 100));
    }
}

public class ShopCart {
    public static void main(String[] args) {
        DiscountProduct p1 = new DiscountProduct(1, "Laptop", 50000);
        Product p2 = new Product(2, "Mouse", 500);
        Product p3 = new Product(3, "Keyboard", 1200);

        Cart cart = new Cart();
        p1.applyDiscount(10);
        cart.addProduct(p1);
        cart.addProduct(p2);
        cart.addProduct(p3);

        System.out.println("Applying 10% discount to " + p1.getName());
        System.out.println("Total Cart Price = " + cart.calculateTotalPrice());
    }
}
