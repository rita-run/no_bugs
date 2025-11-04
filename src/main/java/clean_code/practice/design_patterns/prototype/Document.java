package clean_code.practice.design_patterns.prototype;

public class Document implements Clonable {
    String text;
    String[] images;

    public Document(String text, String[] images) {
        this.text = text;
        this.images = images;  // Поверхностное копирование ссылки на массив
    }

    @Override
    public Document clone() {
        // deep copying
        String[] imagesCopy = new String[this.images.length];
        System.arraycopy(this.images, 0, imagesCopy, 0, this.images.length);
        return new Document(this.text, imagesCopy); // Проблемы с глубоким копированием
    }
}