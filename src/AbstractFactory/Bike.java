package AbstractFactory;

public class Bike {
	BikeFrame frame;
    BikeWheel wheel;

    public Bike(BikePartsFactory factory) {
        frame = factory.createFrame();
        wheel = factory.createWheel();
    }

    public void assemble() {
        frame.createFrame();
        wheel.createWheel();
        System.out.println("Assembled Bike");
    }
}