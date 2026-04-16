package Proxy;

import java.util.List;

public class WarehouseProxy implements Warehouse {

    private RealWarehouse realWarehouse;

    @Override
    public List<String> getItems() {

        if (realWarehouse == null) {
            System.out.println("Initializing real warehouse...");
            realWarehouse = new RealWarehouse(); // chỉ tạo khi cần
        }

        return realWarehouse.getItems();
    }
}