package Builder;

public interface RoomBuilder {
    RoomBuilder setName(String name);
    Room build();
}
