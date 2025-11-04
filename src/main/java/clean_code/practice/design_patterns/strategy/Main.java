package clean_code.practice.design_patterns.strategy;

public class Main {
    public static void main(String[] args) {
        Navigator navigator = new Navigator(new EconomicalRouteStrategy());
        navigator.buildRoute();

        navigator.setStrategy(new LeastTurnsRouteStrategy());
        navigator.buildRoute();

        navigator.setStrategy(new FastestRouteStrategy());
        navigator.buildRoute();
    }
}