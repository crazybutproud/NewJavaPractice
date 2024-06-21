package Practice.Collections.Set;

import java.util.HashSet;
import java.util.Set;

public class SetExample1 {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("Lichi");
        set.add("Chichi");
        set.add("Baka");
        set.add("Kasip");
        set.add("Masynua");

        System.out.println(set);
        System.out.println(set.size());
        System.out.println(set.isEmpty());
        System.out.println(set.contains("Misha"));
    }
}
