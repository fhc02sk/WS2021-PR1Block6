package org.campus02.documents;

import java.util.ArrayList;

public class CsvDocument extends Document {
    private ArrayList<String> lines;

    public CsvDocument(String filename, ArrayList<String> lines) {
        super(filename);
        this.lines = lines;
    }

    public void addLine(String line) {
        lines.add(line);
    }

    @Override
    public void printDocument() {
        System.out.println("CsvDocument: " + filename);
        for (int i = 0; i < lines.size(); i++) {
            System.out.println(lines.get(i));
        }
    }
}
