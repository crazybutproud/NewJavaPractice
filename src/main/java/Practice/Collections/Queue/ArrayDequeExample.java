package Practice.Collections.Queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeExample {
    public static void main(String[] args) {
        Deque<Integer> integerDeque = new ArrayDeque<>();
        integerDeque.add(4);
        integerDeque.add(8);
        integerDeque.add(0);
        integerDeque.add(-11);

        System.out.println(integerDeque);

        integerDeque.addFirst(100);
        integerDeque.addFirst(120);
        integerDeque.addLast(22);

        System.out.println(integerDeque);

        integerDeque.offerFirst(11);
        integerDeque.offerLast(33);

        System.out.println(integerDeque);

        integerDeque.removeFirst();
        integerDeque.removeLast();

        System.out.println(integerDeque);

        System.out.println(integerDeque.peekFirst()); // no exeption
        System.out.println(integerDeque.getLast()); //exeption
    }
}
