package estructural.Flyweight.ejemplo_teorico;

import java.util.HashMap;
import java.util.Map;

public class FlyweightFactory {

    private Map<String, Flyweight> flyweightCache = new HashMap<>();

    Flyweight obtenerFlyweight(String key) {
        if (!flyweightCache.containsKey(key)) {
            flyweightCache.put(key, new Flyweight(key));
        }
        return flyweightCache.get(key);
    }

}
