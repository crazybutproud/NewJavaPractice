package Practice.Collections.Map;

import java.util.HashMap;

public class HashMapExample1 {
    public static void main(String[] args) { //не запоминает порядок, методы работают быстро
        HashMap<Integer,String> hashMap = new HashMap<>();
        hashMap.put(12345,"Licha Chicha");
        hashMap.put(15345,"Micha Chicha");
        hashMap.put(12745,"Picha Chicha");
        hashMap.put(12223,"Hicha Chicha");
        hashMap.put(12002,"Wicha Chicha");
        hashMap.putIfAbsent(12345,"Mouse Licha");
        System.out.println(hashMap);
        System.out.println(hashMap.get(12345));
        hashMap.remove(12745);
        System.out.println(hashMap);
        System.out.println(hashMap.containsValue("Licha Chicha"));
        System.out.println(hashMap.containsKey(12223));
        System.out.println(hashMap.keySet());
        System.out.println(hashMap.values());

    }
}
