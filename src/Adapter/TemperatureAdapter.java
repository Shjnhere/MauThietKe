package Adapter;

public class TemperatureAdapter implements TemperatureService {
    private FahrenheitService fahrenheitService;

    public TemperatureAdapter(FahrenheitService fahrenheitService) {
        this.fahrenheitService = fahrenheitService;
    }

    @Override
    public double getTemperatureCelsius(String city) {
        double f = fahrenheitService.getTemperatureFahrenheit(city);
        return (f - 32) * 5 / 9; // chuyển sang Celsius
    }
}
