package Collections.ComporableEx;

public class ProductCount implements Comparable<ProductCount> {
    private String name;
    private int count;

    public ProductCount(String name, int count) {
        this.name = name;
        this.count = count;
    }

    @Override
    public int compareTo(ProductCount o) {
        if (this.getCount() > o.getCount()) {
            return -1;
        }
        if (this.getCount() < o.getCount()) {
            return 1;
        }
        return 0;
    }

    public String getName() {
        return name;
    }

    public int getCount() {
        return count;
    }
}