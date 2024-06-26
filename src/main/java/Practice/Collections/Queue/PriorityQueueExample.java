package Practice.Collections.Queue;

import java.util.PriorityQueue;

public class PriorityQueueExample {//сортировка по приоритету. первым вызывается элемент с наивысшим приоритетом(натуральная сортировка или реализовать компарабл)
    public static void main(String[] args) {
        PriorityQueue<Integer> integerPriorityQueue = new PriorityQueue<>();
        integerPriorityQueue.add(4);
        integerPriorityQueue.add(8);
        integerPriorityQueue.add(0);
        integerPriorityQueue.add(-11);
        integerPriorityQueue.add(23);
        integerPriorityQueue.add(1);
        integerPriorityQueue.add(12);

        System.out.println(integerPriorityQueue); //когда выводим на экран,моет быть несоответсвие сортировке. при использовании все соблюдается
        System.out.println(integerPriorityQueue.peek());

        System.out.println(integerPriorityQueue.remove()); //удаляется элемент с наивысшим приоритетом
        System.out.println(integerPriorityQueue);
    }
}
