package org.campus02.documents;

import java.util.ArrayList;

public class DemoApp {
    public static void main(String[] args) {


        CsvDocument csvFile1 = new CsvDocument("zahlen.csv", new ArrayList<>());
        csvFile1.addLine("column1;column2;column3;");
        csvFile1.addLine("223;123;456;");
        csvFile1.addLine("987;564;321;");

        csvFile1.printDocument();

        ImageDocument bild = new ImageDocument("bild.png", 640, 480, "blue");
        bild.printDocument();

        TextDocument textDocument = new TextDocument("demo.txt", "inhalt unserer Textdatei");
        textDocument.printDocument();

    }
}
