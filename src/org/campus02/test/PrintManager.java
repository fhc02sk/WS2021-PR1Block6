package org.campus02.test;

import org.campus02.documents.Document;

import java.util.ArrayList;

public class PrintManager {
    private ArrayList<Document> documents;

    public PrintManager() {
        documents = new ArrayList<>();
    }

    public void addDocument(Document d){
        documents.add(d);
    }

    public void printAll(){
        /*for (int i = 0; i < documents.size(); i++) {
            Document d = documents.get(i);
            //...
        }   */

        for (Document d : documents) {
            d.printDocument();
            System.out.println("-----------------------\n");
        }
    }

    public Document findDocument(String filename) {
        for (Document d : documents) {
            if (d.getFilename().equals(filename))
                return d;
        }
        return null;
    }
}
