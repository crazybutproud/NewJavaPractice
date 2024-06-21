package Practice.Collections.Set;

import java.util.HashSet;
import java.util.Set;


public class HashSetExample { // не хранит порядок. только уникальные элементы. под капотом hashMap
    public static void main(String[] args) {
        HashSet<Integer> integerSet1 = new HashSet<>();
        integerSet1.add(1);
        integerSet1.add(5);
        integerSet1.add(-23);
        integerSet1.add(0);
        integerSet1.add(1345);
        integerSet1.add(-87);

        HashSet<Integer> integerSet2 = new HashSet<>();
        integerSet2.add(0);
        integerSet2.add(596);
        integerSet2.add(32);
        integerSet2.add(-14);
        integerSet2.add(5);
        integerSet2.add(143);

        HashSet<Integer> hashSetUnion = new HashSet<>(integerSet1); // union - объединение
        hashSetUnion.addAll(integerSet2);
        System.out.println(hashSetUnion);

        HashSet<Integer> hashSetIntersect = new HashSet<>(integerSet1); // intersect - пересечение
        hashSetIntersect.retainAll(integerSet2);
        System.out.println(hashSetIntersect);

        HashSet<Integer> hashSetSubtract = new HashSet<>(integerSet1); // subtract - разность
        hashSetSubtract.removeAll(integerSet2);
        System.out.println(hashSetSubtract); // значения, которые есть в первом, но нет во втором

    }
}
