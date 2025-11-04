package clean_code.practice.design_patterns.proxy;

public class ImageProxy implements Showable {
    private HighResolutionImage image;
    private String imageFilePath;

    public ImageProxy(String imageFilePath) {
        this.imageFilePath = imageFilePath;

    }

    //lazy download
    @Override
    public void show() {
        //we wan to download image only once
        if (this.image == null) {
            this.image = new HighResolutionImage(imageFilePath);
        }

        image.showImage();
    }
}