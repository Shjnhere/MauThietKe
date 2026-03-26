package AbstractFactory;

public abstract class BikeStore {
	public Bike orderBike() {
        Bike bike = createBike();
        bike.assemble();
        return bike;
    }

    protected abstract Bike createBike();
}