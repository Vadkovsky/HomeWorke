package Collections.ComporableEx;

import java.util.Comparator;

public class ProductCount implements Comparator<ProductCount> {

    public int compare(ProductCount obj1, ProductCount obj2)
    {
        float count1 = obj1.getCount();
        float count2 = obj2.getCount();

        if (count1 > count2) {
            return 1;
        } else if (count1 < count2) {
            return -1;
        } else {
            return 0;
        }
    }

    public int getCount() {
        return count;
    }
}