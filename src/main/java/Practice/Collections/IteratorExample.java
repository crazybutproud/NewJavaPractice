package Practice.Collections;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorExample {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        al.add("А");
        al.add("Б");
        al.add("В");

        Iterator<String> iterator = al.iterator();
        while (iterator.hasNext() ) {
            System.out.println(iterator.next());
        }

        Iterator<String> iterator2 = al.iterator();
        while (iterator2.hasNext() ) {
            iterator2.next();
            iterator2.remove();
        }
        System.out.println(al);

    }
}
