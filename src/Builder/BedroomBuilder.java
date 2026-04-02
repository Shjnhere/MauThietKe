package Builder;

public class BedroomBuilder implements RoomBuilder {
    private String name;
    private String bedType;
    private boolean hasAC;

    public BedroomBuilder setBedType(String bedType) {
        this.bedType = bedType;
        return this;
    }

    public BedroomBuilder setHasAC(boolean hasAC) {
        this.hasAC = hasAC;
        return this;
    }

    @Override
    public BedroomBuilder setName(String name) {
        this.name = name;
        return this;
    }

    @Override
    public Bedroom build() {
        return new Bedroom(name, bedType, hasAC);
    }
}
