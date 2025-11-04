package mock_interview.oop;

public class Main {
    /*
    news feed
    dif types:
    1) post -> text author
    2) stat news -> statistics number
    3) advertisement -> promo

    system -> show all news
    post: "we don't need QAs", Nick
    stat: 100 open QA positions
    promo: buy my mentorship
     */
    public static void main(String[] args) {
        NewsSystem system = new NewsSystem();
        NewsFeed post = new Post("we don't need QAs", "Nick");
        NewsFeed stats = new StatNews("open QA positions", 100);
        NewsFeed ad = new Advertisment("Buy my mentorship");

        system.addNews(post);
        system.addNews(stats);
        system.addNews(ad);

        system.showNews();
    }
}