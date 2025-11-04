package clean_code.homework.design_patterns.adapter.docadapter;

public class DOCProcessor implements DocumentProcessor {
    @Override
    public void process() {
        System.out.println("Printing .doc document");
    }
}