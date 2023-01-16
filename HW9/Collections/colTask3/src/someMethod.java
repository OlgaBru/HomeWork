import java.util.HashMap;
import java.util.Map;

public class someMethod {
    public static <K> Map<K, Integer> arrayToMap(K[] ks) {
        Map<K, Integer> map = new HashMap<>();
        for (K k : ks) {
            if (!map.containsKey(k)) {//если кол-я не сод. ключ k
                map.put(k, 1);
            } else {
                map.put(k, map.get(k) + 1);
            }
        }
        return map;
    }
}

