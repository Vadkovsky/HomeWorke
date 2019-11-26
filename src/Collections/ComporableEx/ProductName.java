package Collections.ComporableEx;

public class ProductName implements Comparable<ProductName> {
    private String name;
    private int count;

    public ProductName(String name, int count) {
        this.name = name;
        this.count = count;
    }

    @Override
    public int compareTo(ProductName a) {
        return name.compareTo(a.getName());
    }

    public String getName() {
        return name;
    }

    public int getCount() {
        return count;
    }
}