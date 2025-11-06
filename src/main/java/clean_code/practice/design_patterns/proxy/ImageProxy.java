package clean_code.practice.design_patterns.proxy;

public class ImageProxy implements Showable {
    private HighResolutionImage image;
    private String imageFilePath;

    public ImageProxy(String imageFilePath) {
        this.imageFilePath = imageFilePath;

    }

    //lazy getContent
    @Override
    public void show() {
        //we wan to getContent image only once
        if (this.image == null) {
            this.image = new HighResolutionImage(imageFilePath);
        }

        image.showImage();
    }
}