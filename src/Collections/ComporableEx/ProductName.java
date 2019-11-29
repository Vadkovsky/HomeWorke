package Collections.ComporableEx;

import java.util.Comparator;

public class ProductName implements Comparator<Product> {

    @Override
    public int compare(Product o1, Product o2) {
        String str1 = o1.getName();
        String str2 = o2.getName();

        return str1.compareTo(str2);
    }
}