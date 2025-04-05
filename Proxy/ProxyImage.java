package Proxy;

public class ProxyImage implements Image {
    private String fileName;
    private RealImage realImage;

    public ProxyImage(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void showThumbnail() {
        System.out.println("Displaying thumbnail for " + fileName);
    }

    @Override
    public void displayFullImage() {

        if (realImage == null) {
            realImage = new RealImage(fileName);
        }

        realImage.displayFullImage();
    }
}