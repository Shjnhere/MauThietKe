package Adapter;

public class FahrenheitService {
    public double getTemperatureFahrenheit(String city) {
        // giả lập dữ liệu
        if (city.equalsIgnoreCase("London")) return 68;
        if (city.equalsIgnoreCase("New York")) return 77;
        return 86;
    }
}
