package mock_interview.oop;

public class StatNews implements NewsFeed {
    private String text;
    private int statsNumber;

    public StatNews(String text, int statsNumber) {
        this.text = text;
        this.statsNumber = statsNumber;
    }

    @Override
    public void renderNews() {
        System.out.println("Statistics: " + statsNumber + " " + text);
    }
}
