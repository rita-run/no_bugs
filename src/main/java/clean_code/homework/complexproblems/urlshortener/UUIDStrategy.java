package clean_code.homework.complexproblems.urlshortener;

import java.util.UUID;

public class UUIDStrategy implements ShorteningStrategy {
    private UrlStorage storage;

    public UUIDStrategy(UrlStorage storage) {
        this.storage = storage;
    }

    @Override
    public String shortenURL(String initialURL) {
        return UUID.randomUUID().toString().substring(0,5);
    }

    @Override
    public String expandURL(String shortURL) {
        return storage.get(shortURL);
    }
}