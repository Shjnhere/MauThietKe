package Proxy;

public class Main {
    public static void main(String[] args) {

        Warehouse warehouse = new WarehouseProxy();

        System.out.println("Program started...");

        // Chưa load DB
        System.out.println("Do something else...");

        // Khi cần mới load
        System.out.println("Access warehouse:");
        System.out.println(warehouse.getItems());
    }
}
