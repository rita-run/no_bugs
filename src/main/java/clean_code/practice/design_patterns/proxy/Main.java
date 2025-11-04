package clean_code.practice.design_patterns.proxy;

public class Main {
    public static void main(String[] args) {
        // в момент создания proxy the image is not being downloaded
        ImageProxy imageProxy = new ImageProxy("path/to/high/res/image");

        // отображения изображение
        imageProxy.show();

        imageProxy.show();
    }
}