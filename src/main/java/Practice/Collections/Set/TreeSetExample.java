package Practice.Collections.Set;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample { // хранит элементы отсортированные по возрастанию
    public static void main(String[] args) {
        Set<Integer> treeSet = new TreeSet<>();
        treeSet.add(0);
        treeSet.add(-56);
        treeSet.add(33);
        treeSet.add(275);
        treeSet.add(-73);
        treeSet.add(8);
        System.out.println(treeSet);

        System.out.println(treeSet.contains(33));
    }
}
