package clean_code.practice.design_patterns.mediator;

public class Main {
    public static void main(String[] args) {
        Light light = new Light();
        Alarm alarm = new Alarm();
        Thermostat thermostat = new Thermostat();

        HomeMediator homeMediator = new HomeMediator(light, alarm, thermostat);

        homeMediator.notify(thermostat, "morning");
    }
}