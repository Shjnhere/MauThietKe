package Proxy;

import java.util.ArrayList;
import java.util.List;

public class RealWarehouse implements Warehouse {

    private List<String> items;

    public RealWarehouse() {
        loadFromDatabase();
    }

    private void loadFromDatabase() {
        System.out.println("Loading warehouse data from database...");
        items = new ArrayList<>();

        // Giả lập dữ liệu lớn
        items.add("Milk");
        items.add("Bread");
        items.add("Eggs");
        items.add("Meat");
    }

    @Override
    public List<String> getItems() {
        return items;
    }
}
