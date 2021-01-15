package org.campus02.documents;

import org.campus02.test.PrintManager;

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

        Document d = new TextDocument("demo2.txt", "inhalt 2 unserer Textdatei 2");

        System.out.println("\nPrintmanager:");
        PrintManager pm = new PrintManager();
        pm.addDocument(textDocument);
        pm.addDocument(bild);
        pm.addDocument(csvFile1);
        pm.addDocument(d);
        pm.printAll();


        Document dSearch = pm.findDocument("demo.txt");
        dSearch.printDocument();

    }
}
