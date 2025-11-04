package clean_code.homework.design_patterns.adapter.docadapter;

public class DocumentAdapter implements DocumentProcessor {
    private PDFProcessor pdfProcessor;

    public DocumentAdapter(PDFProcessor pdfProcessor) {
        this.pdfProcessor = pdfProcessor;
    }

    @Override
    public void process() {
        System.out.println("Converting PDF to DOC...");
        pdfProcessor.showPDF();
        System.out.println("PDF document processed as DOC");
    }
}