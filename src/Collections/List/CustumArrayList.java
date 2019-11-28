package Collections.List;

import java.util.Iterator;

public class CustumArrayList<T> implements Iterable<T> {
    private T[] array;

    @Override
    public Iterator<T> iterator() {
        Iterator<T> it = new Iterator<T>() {
            private int currentIndex = 0;

            @Override
            public boolean hasNext() {
                return currentIndex < array.length && array[currentIndex] != null;
            }

            @Override
            public T next() {
                return array[currentIndex++];
            }
        };
        return it;
    }

    public boolean add(T t) {
        try {
            T[] tempArray = array;
            array = (T[]) new Object[tempArray.length + 1];
            System.arraycopy(tempArray, 0, array, 0, tempArray.length);
            array[array.length - 1] = t;
            return true;
        } catch (ClassCastException e) {
            e.printStackTrace();
        }
        return false;
    }

    public T get(int index) {
        return array[index];
    }

    public int size() {
        return array.length;
    }

    public void remove(int index) {
        try {
            T[] tempArray = array;
            array = (T[]) new Object[tempArray.length - 1];
            System.arraycopy(tempArray, 0, array, 0, index);
            int residue = tempArray.length - (index + 1);
            System.arraycopy(tempArray, index + 1, array, index, residue);
        } catch (ClassCastException e) {
            e.printStackTrace();
        }
    }

    public CustumArrayList() {
        array = (T[]) new Object[0];
    }
}