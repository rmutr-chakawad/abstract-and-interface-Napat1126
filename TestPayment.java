public class TestPayment {
    public static void main(String[] args) {
        BankTransferPayment Bank = new BankTransferPayment();
        CreditCardPayment Cash = new CreditCardPayment();

        Cash.play(3000);
        Bank.play(5000);
    }
}
