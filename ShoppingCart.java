import java.util.*;
class Product {
    int productId;
    String productName;
    double price;
    int quantity;

    // Constructor
    Product(int productId, String productName, double price, int quantity) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    // Calculate total cost of this product
    double calculateTotal() {
        return price * quantity;
    }

    // Display product details
    void displayProduct() {
        System.out.println("Product ID: " + productId);
        System.out.println("Product Name: " + productName);
        System.out.println("Price: ₹" + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Cost: ₹" + calculateTotal());
        System.out.println();
    }
}

public class ShoppingCart {
    public static void main(String[] args) {

        Product p1 = new Product(101, "Laptop", 4000, 1);
        Product p2 = new Product(102, "Mouse", 600, 2);
        Product p3 = new Product(103, "Keyboard", 800, 1);

        p1.displayProduct();
        p2.displayProduct();
        p3.displayProduct();

        // Calculate total bill
        double totalBill = p1.calculateTotal()
                         + p2.calculateTotal()
                         + p3.calculateTotal();

        System.out.println("Total Bill: ₹" + totalBill);

        // Calculate discount
        double discount = 0;

        if (totalBill > 5000) {
            discount = totalBill * 0.10;
        }

        double finalBill = totalBill - discount;

        System.out.println("Discount: ₹" + discount);
        System.out.println("Final Bill: ₹" + finalBill);
    }
}


