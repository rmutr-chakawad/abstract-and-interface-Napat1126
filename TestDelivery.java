public class TestDelivery {
    public static void main(String[] args) {
        double weight = 10.0; // น้ำหนักสินค้า 10 กก.

        Deliverable express = new ExpressDelivery();
        Deliverable economy = new EconomyDelivery();

        System.out.println("ทดสอบส่งสินค้าน้ำหนัก " + weight + " กก.");
        System.out.println(express.getClass().getSimpleName()
                + " (" + ((ExpressDelivery)express).getServiceType() + "): "
                + express.calculateShippingCost(weight) + " บาท");

        System.out.println(economy.getClass().getSimpleName()
                + " (" + ((EconomyDelivery)economy).getServiceType() + "): "
                + economy.calculateShippingCost(weight) + " บาท");
    }
}
