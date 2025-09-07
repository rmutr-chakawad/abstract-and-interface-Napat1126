public class EconomyDelivery extends LogisticsService implements Deliverable {

    public EconomyDelivery() {
        super("Economy Delivery");
    }

    @Override
    public String getServiceType() {
        return "ประหยัด";
    }

    @Override
    public double calculateShippingCost(double weight) {
        return 20 + (weight * 5);
    }
}
