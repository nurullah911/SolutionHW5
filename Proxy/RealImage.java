package Proxy;

public class RealImage implements Image {
    private String fileName;

    public RealImage(String fileName) {
        this.fileName = fileName;
        loadHighResImage();
    }

    private void loadHighResImage() {
        System.out.println("Loading high resolution image from disk: " + fileName);

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void showThumbnail() {
        System.out.println("Displaying thumbnail for " + fileName);
    }

    @Override
    public void displayFullImage() {
        System.out.println("Displaying full resolution image for " + fileName);
    }
}