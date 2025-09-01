public  class BankTransferPayment extends CreditCardPayment{
    @Override
    public void play(double amount){
        System.out.println("โอนผ่านธนาคาร จำนวน"+amount+"บาท");
    }

}
