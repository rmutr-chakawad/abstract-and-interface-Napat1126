public abstract class LogisticsService {
    protected String serviceName;

    public LogisticsService(String serviceName) {
        this.serviceName = serviceName;
    }

    public String getServiceName() {
        return serviceName;
    }

    public abstract String getServiceType();
}
