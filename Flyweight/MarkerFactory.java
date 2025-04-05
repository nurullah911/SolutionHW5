package Flyweight;

import java.util.HashMap;
import java.util.Map;

public class MarkerFactory {
private static final Map<String, Marker> markers = new HashMap<>();

public static Marker getMarker(String key) {
    if (!markers.containsKey(key)) {
        if (key.equalsIgnoreCase("hospital"))
            markers.put(key, new ConcreteMarker("Hospital Icon", "Red", "Monospace"));
        else if (key.equalsIgnoreCase("restaurant"))
            markers.put(key, new ConcreteMarker( "Restaurant Icon", "Green", "Vintage"));
        else if (key.equalsIgnoreCase("gas station"))
            markers.put(key, new ConcreteMarker("Gas Station Icon", "Blue", "Basic"));
    }
    return markers.get(key);
}

public static int getUniqueStyleCount() {
    return markers.size();
}
}