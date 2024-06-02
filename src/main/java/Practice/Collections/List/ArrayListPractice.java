package Practice.Collections.List;

import java.util.ArrayList;

public class ArrayListPractice {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        al.add("А");
        al.add("Б");
        al.add("В");
        System.out.println(al);

        ArrayList<Integer> al2 = new ArrayList<>(200); //лучше прописывать начальную длину листа
    }
}
