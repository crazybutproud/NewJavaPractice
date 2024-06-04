package Practice.Collections.List;

import java.util.ArrayList;

public class ArrayListPractice {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        al.add("А");
        al.add("Б");
        al.add("В");
        al.add(1,"Two");
        System.out.println(al);
        System.out.println(al.get(0));
        al.set(2,"replaced element"); // set = replace
        al.remove(0);
        System.out.println(al.contains("A"));

        ArrayList<String> al2 = new ArrayList<>(200); //лучше прописывать начальную длину листа
        al2.addAll(al);
        System.out.println(al2.indexOf("Б"));
        System.out.println(al);
        System.out.println(al.size());
    }
}
