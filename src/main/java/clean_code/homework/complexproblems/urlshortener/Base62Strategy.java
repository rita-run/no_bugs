package clean_code.homework.complexproblems.urlshortener;

import java.util.Random;

public class Base62Strategy implements ShorteningStrategy {
    private Random random = new Random();
    private UrlStorage storage = new InMemoryUrlStorage();

    @Override
    public String shortenURL(String initialURL) {
        String shortUrl = String.valueOf(random.nextInt(1_000_000));
        storage.save(shortUrl, initialURL);
        return shortUrl;
    }

    @Override
    public String expandURL(String shortURL) {
        return storage.get(shortURL);
    }
}