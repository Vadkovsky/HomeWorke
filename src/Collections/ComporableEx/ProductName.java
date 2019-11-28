package Collections.ComporableEx;

import java.util.Comparator;

public class ProductName implements Comparator<ProductName> {

        public int compare(ProductName obj1, ProductName obj2)
        {
            String str1 = obj1.getName();
            String str2 = obj2.getName();

            return str1.compareTo(str2);
        }
    public String getName() {
        return name;
    }
    }

}