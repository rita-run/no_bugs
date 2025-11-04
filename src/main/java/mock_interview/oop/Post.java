package mock_interview.oop;

public class Post implements NewsFeed {
    private String text;
    private String author;

    public Post(String text, String author) {
        this.text = text;
        this.author = author;
    }

    @Override
    public void renderNews() {
        System.out.println("Post: " + text + " Author: " + author);
    }
}
