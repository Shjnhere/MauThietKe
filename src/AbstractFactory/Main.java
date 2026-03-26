package AbstractFactory;

public class Main {

	public static void main(String[] args) {
        BikeStore road = new RoadBikeStore();
        BikeStore mountain = new MountainBikeStore();

        System.out.println("---- Road Bike ----");
        road.orderBike();

        System.out.println("---- Mountain Bike ----");
        mountain.orderBike();
    }

}