package Builder;

public class KitchenBuilder implements RoomBuilder {
    private String name;
    private boolean hasFridge;

    public KitchenBuilder setHasFridge(boolean hasFridge) {
        this.hasFridge = hasFridge;
        return this;
    }

    @Override
    public KitchenBuilder setName(String name) {
        this.name = name;
        return this;
    }

    @Override
    public Kitchen build() {
        return new Kitchen(name, hasFridge);
    }
}
