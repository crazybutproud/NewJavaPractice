package Practice.Collections.Map;

import java.util.LinkedHashMap;
import java.util.TreeMap;

public class LinkedHashMapExample1 { // хранит инфо о порядке добавления элементов, из-за этого производительность чуть ниже
    public static void main(String[] args) {
        LinkedHashMap<Double,String> linkedHashMap
                = new LinkedHashMap<>(16,0.75f,false);
        // false - порядок после использования такой же, как и при изначальном добавлении,
        // true - порядок меняется в зависимости от того, какие элементы были использованы(get,put)
        // последним будет элемент, который использовали последним

        linkedHashMap.put(8.14,"Anna");
        linkedHashMap.put(3.25,"Hanna");
        linkedHashMap.put(9.21,"Alex");
        linkedHashMap.put(2.15,"Licha");
        linkedHashMap.put(6.87,"Chicha");
    }
}

