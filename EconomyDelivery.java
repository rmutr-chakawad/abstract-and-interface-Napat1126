class EconomyDelivery extends LogisticsService implements Deliverable {

    EconomyDelivery(String serviceName) {
        super(serviceName);
    }

    @Override
    public double calculateShippingCost(double weight) {
        return 20 + (weight * 5);
    }

    @Override
    String getServiceType() {
        return "Economy Delivery";
    }
}

