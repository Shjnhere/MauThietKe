package AbstractFactory;

public class RoadBikeStore extends BikeStore {
	protected Bike createBike() {
        return new Bike(new RoadBikeFactory());
    }
}