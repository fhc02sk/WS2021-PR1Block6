package org.campus02.documents;

public class Document {
    protected String filename;

    public Document(String filename) {
        this.filename = filename;
    }

    public void printDocument(){

    }

    public String getFilename() {
        return filename;
    }
}
