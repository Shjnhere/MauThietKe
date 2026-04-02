package Builder;

import java.util.*;

public class House {
    private List<Room> rooms;
    private int floors;

    public House(List<Room> rooms, int floors) {
        this.rooms = rooms;
        this.floors = floors;
    }

    @Override
    public String toString() {
        return "House{floors=" + floors + ", rooms=" + rooms + "}";
    }
}
