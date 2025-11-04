package clean_code.homework.design_patterns.facade.smarthome;

public class SmartHomeFacade {
    private Light light;
    private AirConditioner airConditioner;
    private SecuritySystem securitySystem;

    public SmartHomeFacade(Light light, AirConditioner airConditioner, SecuritySystem securitySystem) {
        this.light = light;
        this.airConditioner = airConditioner;
        this.securitySystem = securitySystem;
    }

    public void atHome() {
        light.turnOn();
        airConditioner.turnOn();
        securitySystem.turnOff();
    }

    public void away() {
        light.turnOff();
        airConditioner.turnOff();
        securitySystem.turnOn();
    }
}