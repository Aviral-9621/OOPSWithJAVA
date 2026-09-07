interface Payment {
    void pay();
}

class CreditCard implements Payment {
    public void pay() {
        System.out.println("Payment made using Credit Card");
    }
}

class UPI implements Payment {
    public void pay() {
        System.out.println("Payment made using UPI");
    }
}

class NetBanking implements Payment {
    public void pay() {
        System.out.println("Payment made using Net Banking");
    }
}

class PaymentDemo {
    public static void main(String[] args) {

        Payment p1 = new CreditCard();
        p1.pay();

        Payment p2 = new UPI();
        p2.pay();

        Payment p3 = new NetBanking();
        p3.pay();
    }
}
