package Collections.ComporableEx;

import java.util.Set;
import java.util.TreeSet;

public class SortProduct {
    public static void main(String[] args) {
        Set<ProductName> strings = new TreeSet<>();
        strings.add(new ProductName("Ноутбук", 12));
        strings.add(new ProductName("Телефон", 43));
        strings.add(new ProductName("Телевизор", 1));
        strings.add(new ProductName("Наушники", 22));
        for (ProductName s : strings) {
            System.out.print(s.getName() + ", ");
        }
        Set<ProductCount> strings2 = new TreeSet<>();
        strings2.add(new ProductCount("Ноутбук", 12));
        strings2.add(new ProductCount("Телефон", 43));
        strings2.add(new ProductCount("Телевизор", 1));
        strings2.add(new ProductCount("Наушники", 22));
        for (ProductCount s : strings2) {
            System.out.print(s.getName() + ", ");
        }

    }

}
