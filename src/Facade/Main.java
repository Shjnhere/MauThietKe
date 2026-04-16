package Facade;

public class Main {
    public static void main(String[] args) {

        CarFacade car = new CarFacade();

        // Chỉ 1 lệnh duy nhất
        car.drive();
    }
}
