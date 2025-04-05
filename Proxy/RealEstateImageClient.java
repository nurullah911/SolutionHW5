package Proxy;

public class RealEstateImageClient {
    public static void main(String[] args) {
        Image image = new ProxyImage("picture1.jpg");

        image.showThumbnail();

        System.out.println("\nUser clicks to zoom...");
        image.displayFullImage();
    }
}
