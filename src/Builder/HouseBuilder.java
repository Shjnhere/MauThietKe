package Builder;

import java.util.*;

public class HouseBuilder {
    private List<Room> rooms = new ArrayList<>();
    private int floors;

    public HouseBuilder addRoom(Room room) {
        rooms.add(room);
        return this;
    }

    public HouseBuilder setFloors(int floors) {
        this.floors = floors;
        return this;
    }

    public House build() {
        return new House(rooms, floors);
    }
}
