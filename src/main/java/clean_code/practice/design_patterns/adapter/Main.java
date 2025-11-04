package clean_code.practice.design_patterns.adapter;

public class Main {
    public static void main(String[] args) {
        FahrenheitThermometer fThermometer = new FahrenheitThermometer();
        WeatherApp app = new WeatherApp();
        CelsiusAdapter celsiusAdapter = new CelsiusAdapter(fThermometer);

        app.printTemperature(celsiusAdapter.getCelsius()); // Неудобно и повторяющееся преобразование
    }
}