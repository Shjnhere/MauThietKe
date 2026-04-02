package Builder;

public class Architect {
    public static void main(String[] args) {

        // Tạo phòng bằng builder
        Room bedroom = new BedroomBuilder()
                .setName("Master Bedroom")
                .setBedType("King")
                .setHasAC(true)
                .build();

        Room kitchen = new KitchenBuilder()
                .setName("Main Kitchen")
                .setHasFridge(true)
                .build();

        // Tạo nhà
        House house = new HouseBuilder()
                .addRoom(bedroom)
                .addRoom(kitchen)
                .setFloors(2)
                .build();

        System.out.println(house);
    }
}
