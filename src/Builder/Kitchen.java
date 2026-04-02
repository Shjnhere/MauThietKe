package Builder;

public class Kitchen extends Room {
    private boolean hasFridge;

    public Kitchen(String name, boolean hasFridge) {
        this.name = name;
        this.hasFridge = hasFridge;
    }

    @Override
    public String toString() {
        return "Kitchen{name='" + name + "', hasFridge=" + hasFridge + "}";
    }
}
