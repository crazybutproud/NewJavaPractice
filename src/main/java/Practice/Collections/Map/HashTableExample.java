package Practice.Collections.Map;

import java.util.Hashtable;

public class HashTableExample { // устаревший! работает так же, как и hashMap. синхронизирован
    // лучше использовать ConcurrentHashMap
    public static void main(String[] args) {
        Hashtable<Double,String> hashtable = new Hashtable<>(); // не может быть null
        hashtable.put(6.94,"Anna");
        hashtable.put(2.75,"Hanna");
        hashtable.put(7.51,"Alex");
        System.out.println(hashtable);
    }
}
