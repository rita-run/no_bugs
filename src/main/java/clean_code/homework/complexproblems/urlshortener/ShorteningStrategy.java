package clean_code.homework.complexproblems.urlshortener;

public interface ShorteningStrategy {
    public String shortenURL(String initialURL);
    public String expandURL(String shortURL);
}