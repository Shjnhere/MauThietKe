package Adapter;

public class CelsiusService implements TemperatureService {
    @Override
    public double getTemperatureCelsius(String city) {
        if (city.equalsIgnoreCase("Hanoi")) return 30;
        if (city.equalsIgnoreCase("Tokyo")) return 25;
        return 28;
    }
}
