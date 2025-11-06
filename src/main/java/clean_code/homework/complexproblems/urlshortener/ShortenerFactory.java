package clean_code.homework.complexproblems.urlshortener;

public class ShortenerFactory {
    private ShorteningStrategy strategy;

    public ShortenerFactory(ShorteningStrategy strategy) {
        this.strategy = strategy;
    }

    public ShorteningStrategy createStrategy() {
        return strategy;
    }
}