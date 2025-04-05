package Flyweight;

public class ConcreteMarker implements Marker {
    private final String icon;
    private final String color;
    private final String labelStyle;

    public ConcreteMarker(String icon, String color, String labelStyle) {
        this.icon = icon;
        this.color = color;
        this.labelStyle = labelStyle;
    }

    @Override
    public void draw(int x, int y) {
        System.out.println("Drawing " + " marker at (" + x + ", " + y + ") " +
                "[Icon: " + icon + ", Color: " + color + ", Label Style: " + labelStyle + "]");
    }
}