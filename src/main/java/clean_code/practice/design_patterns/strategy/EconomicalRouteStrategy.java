package clean_code.practice.design_patterns.strategy;

public class EconomicalRouteStrategy implements RouteStrategy {
    @Override
    public void buildRoute() {
        System.out.println("Building the most economical route.");
    }
}
