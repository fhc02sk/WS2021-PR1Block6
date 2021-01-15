package org.campus02.documents;

public class TextDocument extends Document {

    private String content;

    public TextDocument(String filename, String content) {
        super(filename);
        this.content = content;
    }

    @Override
    public void printDocument() {
        System.out.println("TextDocument: " + filename + " => " + content);
    }
}
