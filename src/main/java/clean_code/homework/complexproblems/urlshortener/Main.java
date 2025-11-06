package clean_code.homework.complexproblems.urlshortener;

public class Main {
    public static void main(String[] args) {
        String longURl = "https://nobugs.com/homework/designpatterns";
        UrlShortenerService shortenerService = new UrlShortenerService(new ShortenerFactory(new Base62Strategy()));
        String shortURL = shortenerService.shortenURL(longURl);
        System.out.println(shortURL);

        String longURL = shortenerService.expandURL(shortURL);
        System.out.println(longURL);
    }
}