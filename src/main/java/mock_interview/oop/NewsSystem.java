package mock_interview.oop;

import java.util.ArrayList;
import java.util.List;

public class NewsSystem {
    private List<NewsFeed> newsFeedList = new ArrayList<>();

    public void addNews(NewsFeed newsFeed) {
        newsFeedList.add(newsFeed);
    }

    public void showNews() {
        for (NewsFeed newsFeed : newsFeedList) {
            newsFeed.renderNews();
        }
    }
}