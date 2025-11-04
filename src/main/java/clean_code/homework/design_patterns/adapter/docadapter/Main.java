package clean_code.homework.design_patterns.adapter.docadapter;

public class Main {
    public static void main(String[] args) {
        DocumentProcessor documentProcessor = new DOCProcessor();
        documentProcessor.process();

        PDFProcessor pdfProcessor = new PDFProcessor();
        DocumentProcessor pdfAdapter = new DocumentAdapter(pdfProcessor);
        pdfAdapter.process();
    }
}