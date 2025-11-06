package clean_code.homework.complexproblems.urlshortener;

public interface UrlStorage {
    void save(String shortUrl, String longUrl);
    String get(String shortUrl);
}