package Collections.Queue;

import java.util.Iterator;
import java.util.PriorityQueue;

public class Mail {
    public static void main(String[] args) {
        PriorityQueue<Humans> queue = new PriorityQueue<Humans>();
        Humans oleg = new Humans("Oleg", 55);
        Humans georg = new Humans("Georg", 42);
        Humans alex = new Humans("Alex", 68);
        Humans nikita = new Humans("Nikita", 23);
        Humans vera = new Humans("Vera", 70);

        queue.add(oleg);
        queue.add(georg);
        queue.add(alex);
        queue.add(nikita);
        queue.add(vera);

        Iterator<Humans> iterator = queue.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next().getName());
        }
    }

}

