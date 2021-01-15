package org.campus02.documents;

public abstract class Document {
    protected String filename;

    public Document(String filename) {
        this.filename = filename;
    }

    public abstract void printDocument();

    public String getFilename() {
        return filename;
    }
}
