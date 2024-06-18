package Practice.Collections.Map;

import java.util.TreeMap;

public class TreeMapExample1 { //сортировка по ключу в порядке возрастания, в основе красно-черное дерево
    public static void main(String[] args) {
        TreeMap<Double,String> treeMap = new TreeMap<>();

        treeMap.put(8.14,"Anna");
        treeMap.put(3.25,"Hanna");
        treeMap.put(9.21,"Alex");
        treeMap.put(2.15,"Licha");
        treeMap.put(6.87,"Chicha");

        System.out.println(treeMap);

        System.out.println(treeMap.get(9.21));

        treeMap.remove(3.25);
        System.out.println(treeMap);

        System.out.println(treeMap.descendingMap()); // вывод по убыванию

        System.out.println(treeMap.tailMap(6.87)); // вывод отрезка, значения которого больше указанного значения(включая значения)
        System.out.println(treeMap.headMap(8.14)); // вывод отрезка, значения которого меньше указанного значения(включая значения)

        System.out.println(treeMap.lastEntry());

    }
}
