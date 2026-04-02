package Adapter;

public class Main {
    public static void main(String[] args) {
        TemperatureService celsiusService = new CelsiusService();

        FahrenheitService fahrenheitService = new FahrenheitService();
        TemperatureService adapter = new TemperatureAdapter(fahrenheitService);

        System.out.println("Hanoi: " + celsiusService.getTemperatureCelsius("Hanoi") + " °C");
        System.out.println("Tokyo: " + celsiusService.getTemperatureCelsius("Tokyo") + " °C");

        System.out.println("London: " + adapter.getTemperatureCelsius("London") + " °C");
        System.out.println("New York: " + adapter.getTemperatureCelsius("New York") + " °C");
    }
}
