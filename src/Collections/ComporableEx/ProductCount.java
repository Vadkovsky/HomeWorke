package Collections.ComporableEx;

import java.util.Comparator;

public class ProductCount implements Comparator<Product> {

    @Override
    public int compare(Product o1, Product o2) {
        int count1 = o1.getCount();
        int count2 = o2.getCount();

        if (count2 > count1) {
            return 1;
        } else if (count2 < count1) {
            return -1;
        } else {
            return 0;
        }
    }

    public int getCount() {
        return getCount();
    }
}