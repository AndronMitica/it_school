package session11.practice.dataTransformationSystem;

import javax.naming.spi.ResolveResult;
import java.util.List;

interface PDFExportable {
    void exportPdf();
}

interface CSVExportable {
    void exportCsv();
}

public abstract class Report {
    protected String title;
    protected List<String> data;

    Report(String title, List<String> data) {
        this.title = title;
        this.data = data;
    }

    public abstract void showPreview();

    public void displayMetada() {
        System.out.println("Title: " + title);
    }

}

class PDFReport extends Report implements PDFExportable {

    PDFReport(String title, List<String> data) {
        super(title, data);
    }

    @Override
    public void showPreview() {

    }

    @Override
    public void exportPdf() {

    }
}

class CSVReport extends Report implements CSVExportable {

    CSVReport(String title, List<String> data) {
        super(title, data);
    }

    @Override
    public void showPreview() {

    }

    @Override
    public void exportCsv() {

    }
}