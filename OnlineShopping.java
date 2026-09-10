
import java.util.Scanner;

class OnlineShopping {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter product price: ");
            double price = sc.nextDouble();

            if (price <= 0) {
                throw new Exception("Invalid product price!");
            }

            System.out.print("Enter quantity: ");
            int quantity = sc.nextInt();

            if (quantity <= 0) {
                throw new Exception("Invalid quantity!");
            }

            System.out.print("Enter discount percentage: ");
            double discount = sc.nextDouble();

            if (discount < 0 || discount > 100) {
                throw new Exception("Invalid discount percentage!");
            }

            double bill = price * quantity;

            double discountAmount = bill * discount / 100;

            double finalAmount = bill - discountAmount;

            System.out.println("Total Bill: " + bill);
            System.out.println("Discount: " + discountAmount);
            System.out.println("Final Amount: " + finalAmount);

            System.out.print("Enter payment amount: ");
            double payment = sc.nextDouble();

            if (payment < finalAmount) {
                throw new Exception("Payment amount is less than the bill!");
            }

            double remaining = payment - finalAmount;

            System.out.println("Payment Successful!");
            System.out.println("Remaining Amount: " + remaining);

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}


