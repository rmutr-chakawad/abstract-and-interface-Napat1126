public  class CreditCardPayment implements Playment{
        @Override
        public void play(double amount){
            System.out.println("จ่ายผ่านเครดิต จำนวน"+amount+"บาท");
        }


}
