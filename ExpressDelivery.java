class ExpressDelivery extends LogisticsService implements Deliverable {

    ExpressDelivery(String serviceName) {
        super(serviceName);
    }

    @Override
    public double calculateShippingCost(double weight) {
        return 50 + (weight * 10);
    }

    @Override
    String getServiceType() {
        return "Express Delivery";
    }
}

