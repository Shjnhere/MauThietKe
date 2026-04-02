package Builder;

public class Bedroom extends Room {
    private String bedType;
    private boolean hasAC;

    public Bedroom(String name, String bedType, boolean hasAC) {
        this.name = name;
        this.bedType = bedType;
        this.hasAC = hasAC;
    }

    @Override
    public String toString() {
        return "Bedroom{name='" + name + "', bedType='" + bedType + "', hasAC=" + hasAC + "}";
    }
}
