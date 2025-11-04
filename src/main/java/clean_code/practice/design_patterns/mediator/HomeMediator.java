package clean_code.practice.design_patterns.mediator;

public class HomeMediator implements Mediator {
    private Light light;
    private Alarm alarm;
    private Thermostat thermostat;

    public HomeMediator(Light light, Alarm alarm, Thermostat thermostat) {
        this.light = light;
        this.alarm = alarm;
        this.thermostat = thermostat;
    }

    @Override
    public void notify(Object sender, String event) {
        //if event is morning
        if (event.equals("morning")) {
            //if sender is not Light, then turn off the light
            if (!(sender instanceof Light)) {
                light.turnOn();
                alarm.deactivate();
            }
            thermostat.setTemperature(22);

            //if event is evening
        } else {
            //if sender is not alarm, then activate the alarm and turn the lights off
            if (!(sender instanceof Alarm)) {
                alarm.activate();
                light.turnOff();
            }
        }
    }
}
