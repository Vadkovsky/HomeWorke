package Collections.ComporableEx;

import java.util.Set;
import java.util.TreeSet;

public class SortProduct {
    public static void main(String[] args) {
        Set<Product> strings = new TreeSet<>();
        strings.add(new Product("Ноутбук", 12));
        strings.add(new Product("Телефон", 43));
        strings.add(new Product("Телевизор", 1));
        strings.add(new Product("Наушники", 22));
        for (Product s : strings) {
            System.out.print(s.getName() + ", ");
        }
    }

}