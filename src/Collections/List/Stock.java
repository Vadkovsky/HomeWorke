package Collections.List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

public class Stock implements Iterable {
    public static void main(String[] args) {
        ArrayList<String> stocks = new ArrayList<String>();
        stocks.add("Кабачек");
        stocks.add("Трактор");
        stocks.add("Сапог");
        stocks.add("Сторож");
        stocks.add("Бутылка");
        for (String s : stocks) {
            System.out.print(s + ", ");
        }
    }


    @Override
    public Iterator iterator() {
        return null;
    }

    @Override
    public void forEach(Consumer action) {
    }


    @Override
    public Spliterator spliterator() {
        return null;
    }
}
