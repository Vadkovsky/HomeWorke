package Collections.ComporableEx;

import java.util.Arrays;

public class SortProduct {
    public static void main(String[] args) {
        Product[] products = new Product[4];

        products[0] = new Product("Кресло", 35);
        products[1] = new Product("Стул", 129);
        products[2] = new Product("Кровать", 78);
        products[3] = new Product("Шкаф", 16);

        System.out.println("Без сортировки");
        for (Product product : products)
            System.out.println(product.toString());

        Arrays.sort(products, new ProductCount());
        System.out.println("\nСортировка по количеству");

        for (Product s : products)
            System.out.println(s.toString());

        Arrays.sort(products, new ProductName());
        System.out.println("\nСортировка по названию");

        for (Product s : products)
            System.out.println(s.toString());
    }


}