package Collections.ComporableEx;

public class Product {
    private String name;
    private int count;

    public Product(String name, int count) {
        this.name = name;
        this.count = count;
    }

    public String toString() {
        return "Наименование: " + name + ", цена - "
                + count;
    }

}
