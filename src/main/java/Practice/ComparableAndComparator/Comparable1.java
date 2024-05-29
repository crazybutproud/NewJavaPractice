package Practice.ComparableAndComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Comparable1 {
    public static void main(String[] args) {
        List <String> list = new ArrayList<String>();
        list.add("Anna");
        list.add("Hanna");
        list.add("Elena");
        list.add("Vladimir");
        list.add("Alexander");
        list.add("Licha");
        list.add("Ivan");
        System.out.println("Перед сортировкой: ");
        System.out.println(list);
        Collections.sort(list);
        //сортировка произойдет в натуральном порядке. лексиграфическое сравнение
        System.out.println("После сортировки: ");
        System.out.println(list);


    }
}
