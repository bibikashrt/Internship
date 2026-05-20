
interface Payment {

    void pay();

    void refund();
}

abstract class BankPayment implements Payment {

    String BankName;

    public BankPayment(String BankName) {
        this.BankName = BankName;
    }

    void displayBank() {
        System.out.println("Bank: " + BankName);
    }

}

class KhaltiPayment implements Payment {

    public void pay() {
        System.out.println("Paid " + " using Khalti");
    }

    public void refund() {
        System.out.println("Refund" + " using Khalti");
    }
}

class EsewaPayment extends BankPayment {

    EsewaPayment(String bankName) {
        super(bankName);
    }

    public void pay() {
        displayBank();
        System.out.println("Paid " + " using Esewa");
    }

    public void refund() {
        System.out.println("Refund" + " using Esewa");
    }

}

public class Abstract_Interface {

    public static void main(String[] args) {
        Payment p = new EsewaPayment("Nabil Bank");
        Payment p1 = new KhaltiPayment();
        p.pay();
        p.refund();
        p1.pay();
        p1.refund();

    }
}
