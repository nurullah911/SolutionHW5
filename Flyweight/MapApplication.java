package Flyweight;

import java.util.Random;

public class MapApplication {
    public static void main(String[] args) {
        int totalMarkers = 5;
        String[] types = {"hospital", "restaurant", "gas station"};
        Random random = new Random();

        for (int i = 0; i < totalMarkers; i++) {

            String type = types[random.nextInt(types.length)];
            Marker marker = MarkerFactory.getMarker(type);
            int x = random.nextInt(1000);
            int y = random.nextInt(1000);
            marker.draw(x, y);
        }

        System.out.println("Total markers created: " + totalMarkers);
        System.out.println("Unique MarkerStyle objects created: " + MarkerFactory.getUniqueStyleCount());
    }
}