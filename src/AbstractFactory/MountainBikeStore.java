package AbstractFactory;

public class MountainBikeStore extends BikeStore {
	protected Bike createBike() {
        return new Bike(new MountainBikeFactory());
    }
}
