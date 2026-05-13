package Iterator.Exercise;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Product> products = new ArrayList<>();

        products.add(new Product("Laptop", 5));
        products.add(new Product("Mouse", 0));
        products.add(new Product("Keyboard", 3));
        products.add(new Product("Monitor", 0));

        InStockIterator iterator = new InStockIterator(products);

        System.out.println("Các sản phẩm còn hàng:");

        while (iterator.hasNext()) {
            Product p = iterator.next();
            System.out.println(p.getName());
        }
    }
}
