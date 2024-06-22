package Practice.Collections.Set;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

public class LinkedHashSetExample { // в основе лежит hashMap, хранит инфо в порядке добавления элементов.
    // Используем когда нужен HashSet который запоминает последовательность
    public static void main(String[] args) {
        LinkedHashSet<Integer> integerLinkedHashSet = new LinkedHashSet<>();
        integerLinkedHashSet.add(2);
        integerLinkedHashSet.add(-6);
        integerLinkedHashSet.add(0);
        integerLinkedHashSet.add(26);
        integerLinkedHashSet.add(82);

        System.out.println(integerLinkedHashSet);

        integerLinkedHashSet.remove(-6);
        System.out.println(integerLinkedHashSet);

        System.out.println(integerLinkedHashSet.contains(34));

    }
}
