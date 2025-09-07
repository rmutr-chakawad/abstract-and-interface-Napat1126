public class ExpressDelivery extends LogisticsService implements Deliverable {

    public ExpressDelivery() {
        super("Express Delivery");
    }

    @Override
    public String getServiceType() {
        return "ด่วนพิเศษ";
    }

    @Override
    public double calculateShippingCost(double weight) {
        return 50 + (weight * 10);
    }
}



