package mock_interview.oop;

public class Advertisment implements NewsFeed {
    private String promo;

    public Advertisment(String promo) {
        this.promo = promo;
    }

    @Override
    public void renderNews() {
        System.out.println("Advertisment: " + promo);
    }
}
