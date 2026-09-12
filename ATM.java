import java.util.Stack;

public class ATM {
    public static void main(String[] args) {

        int balance = 20000;

        Stack<Integer> transactions = new Stack<>();

        int[] withdrawals = {5000, 3000, 8000, 6000};

        for (int amount : withdrawals) {

            if (amount <= balance) {
                balance = balance - amount;
                transactions.push(amount);

                System.out.println("Withdrawal successful: ₹" + amount);
            } else {
                System.out.println("Insufficient balance for: ₹" + amount);
            }
        }

        System.out.println("Remaining Balance: ₹" + balance);

        if (!transactions.empty()) {
            System.out.println("Latest Transaction: ₹" + transactions.peek());
        }
    }
}