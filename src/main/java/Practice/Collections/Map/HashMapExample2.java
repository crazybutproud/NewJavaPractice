package Practice.Collections.Map;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample2 { //ключ должен быть неизменяемым(поля и класс final,getter,инкапсуляция)
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>(16,0.75f);
        map.put(1234,"Саша");
        map.put(2353,"Катя");
        map.put(2467,"Аня");
        map.put(7432,"Мария");

        for (Map.Entry<Integer,String> entry: map.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }

    }
}
