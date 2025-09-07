public class TestDelivery {
    public static void main(String[] args) {
        double weight = 10;

        Deliverable express = new ExpressDelivery("FastExpress");
        Deliverable economy = new EconomyDelivery("SaveMore");

        System.out.println("Weight: " + weight + " kg");
        System.out.println(express.getClass().getSimpleName() + " ("
                + ((LogisticsService)express).getServiceType() + "): "
                + express.calculateShippingCost(weight));
        System.out.println(economy.getClass().getSimpleName() + " ("
                + ((LogisticsService)economy).getServiceType() + "): "
                + economy.calculateShippingCost(weight));

        if (express.calculateShippingCost(weight) < economy.calculateShippingCost(weight)) {
            System.out.println("Express is cheaper.");
        } else {
            System.out.println("Economy is cheaper.");
        }
    }
}

