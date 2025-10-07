package live_coding_oop.library;

import java.util.ArrayList;
import java.util.List;

public class Manager {
    private List<Document> docsList = new ArrayList<>();

    public void addDoc(Document document) {
        docsList.add(document);
    }

    public String printInfo(Document document) {
        return document.getInfo();
    }
}