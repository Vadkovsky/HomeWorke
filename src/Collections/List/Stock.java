package Collections.List;

public class Stock {
    public static void main(String[] args) {
        CustumArrayList<String> products = new CustumArrayList<>();
        products.add("Холодильник");
        products.add("Телевизор");
        products.add("Стиральная машина");
        products.add("Хлебопечка");
        products.add("Утюг");
        products.add("Чайник");

        for (String s : products) {
            System.out.println("Товар на складе: " + s);
        }

        System.out.println("\nРазмер CustomArrayList: " + products.size());
        System.out.println("\nЭлемент с индексом 2: " + products.get(2));
    }
}