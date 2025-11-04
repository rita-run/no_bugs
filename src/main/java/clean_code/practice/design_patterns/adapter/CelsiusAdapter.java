package clean_code.practice.design_patterns.adapter;

public class CelsiusAdapter {
    FahrenheitThermometer fahrenheitThermometer;
    public CelsiusAdapter(FahrenheitThermometer fahrenheitThermometer) {
        this.fahrenheitThermometer = fahrenheitThermometer;
    }

    public double getCelsius() {
        double fTemp = fahrenheitThermometer.getFahrenheitTemperature();
        double cTemp = (fTemp - 32) * 5.0 / 9.0; // Преобразование в Цельсий
        return cTemp;
    }
}