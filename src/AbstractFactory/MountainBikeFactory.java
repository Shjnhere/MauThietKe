package AbstractFactory;

public class MountainBikeFactory implements BikePartsFactory {
    public BikeFrame createFrame() {
        return new MountainFrame();
    }

    public BikeWheel createWheel() {
        return new MountainWheel();
    }
}