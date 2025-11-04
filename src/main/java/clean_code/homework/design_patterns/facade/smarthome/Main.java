package clean_code.homework.design_patterns.facade.smarthome;

public class Main {
    public static void main(String[] args) {
        Light light = new Light();
        AirConditioner airConditioner = new AirConditioner();
        SecuritySystem securitySystem = new SecuritySystem();

        SmartHomeFacade smartHomeFacade = new SmartHomeFacade(light, airConditioner, securitySystem);

        smartHomeFacade.atHome();
        System.out.println();
        smartHomeFacade.away();
    }
}