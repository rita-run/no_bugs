package clean_code.homework.complexproblems.urlshortener;

import java.util.HashMap;
import java.util.Map;

public class InMemoryUrlStorage implements UrlStorage {
    private Map<String, String> storage = new HashMap<>();

    @Override
    public void save(String shortUrl, String originalUrl) {
        storage.put(shortUrl, originalUrl);
    }

    @Override
    public String get(String shortUrl) {
        return storage.get(shortUrl);
    }
}