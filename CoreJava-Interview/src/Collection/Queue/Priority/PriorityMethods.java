package Collection.Queue.Priority;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityMethods {

    public static void main(String[] args) {

        Queue<Integer> q = new PriorityQueue<>();

        q.add(10);
        q.add(20);
        q.add(30);

        System.out.println(q);

        Integer e = q.element();
        System.out.println("Element: " + e);

        e = q.remove();
        System.out.println("Remove: " + e);

        Iterator<Integer> it = q.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}