package Iterator.Exercise;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class InStockIterator implements Iterator<Product>{

    private List<Product> products;
    private int position = 0;

    public InStockIterator(List<Product> products) {
        this.products = products;
    }

    @Override
    public boolean hasNext() {

        while (position < products.size()) {
            if (products.get(position).getQuantity() > 0) {
                return true;
            }
            position++;
        }

        return false;
    }

    @Override
    public Product next() {
        return products.get(position++);
    }
}
