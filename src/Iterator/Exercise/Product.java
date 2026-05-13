package Iterator.Exercise;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class Product {

    private String name;
    private int quantity;

    public Product(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }
}