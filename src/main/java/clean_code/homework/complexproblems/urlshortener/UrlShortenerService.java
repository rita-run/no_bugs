package clean_code.homework.complexproblems.urlshortener;

public class UrlShortenerService {
    private ShorteningStrategy strategy;

    public UrlShortenerService(ShortenerFactory factory) {
        this.strategy = factory.createStrategy();
    }

    public String shortenURL(String longURL) {
        return strategy.shortenURL(longURL);
    }

    public String expandURL(String shortURL) {
        return strategy.expandURL(shortURL);
    }
}