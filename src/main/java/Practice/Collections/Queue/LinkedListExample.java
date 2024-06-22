package Practice.Collections.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedListExample { //использование как очередь
    public static void main(String[] args) {
        Queue<String> stringQueue = new LinkedList<>();
        stringQueue.add("Anna"); //добавялет элемент в конец очереди
        stringQueue.add("Ivan");
        stringQueue.add("Alex");
        stringQueue.add("Masha");
        stringQueue.add("Dmitriy"); //если очередь ограничена, то с таким методом выпадет исключение
        stringQueue.offer("Misha"); // если очередь ограничена, то с таким методом НЕ выпадет ошибка. но элемент все равно не будет добавлен

        System.out.println(stringQueue);
        System.out.println(stringQueue.remove()); //выбросит ошибку, если элемента нет
        System.out.println(stringQueue);
        System.out.println(stringQueue.poll()); //не выбросит ошибку, если элемента нет

        System.out.println(stringQueue.element()); //вывод элемента с первого места в очереди(выбрасывает ошибку)
        System.out.println(stringQueue.peek()); //вывод элемента с первого места в очереди(не выбрасывает ошибку)

    }
}
