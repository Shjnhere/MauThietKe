package AbstractFactory;

public class RoadBikeFactory implements BikePartsFactory {
    public BikeFrame createFrame() {
        return new RoadFrame();
    }

    public BikeWheel createWheel() {
        return new RoadWheel();
    }
}
