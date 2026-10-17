import GoodDesign.Document;
import GoodDesign.DocumentEditor;
import GoodDesign.Persistance.Persistance;
import GoodDesign.Persistance.SaveToFile;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        // Bad design

        BadDesignDocumentEditor badDesignDocumentEditor = new BadDesignDocumentEditor();
        badDesignDocumentEditor.addText("Dummy text");
        badDesignDocumentEditor.addImage("abcd.jpg");
        badDesignDocumentEditor.getRenderDocument();
        badDesignDocumentEditor.saveToFile();

        // Good Design
        Persistance persistance = new SaveToFile();
        Document document = new Document();
        DocumentEditor documentEditor = new DocumentEditor(document,persistance);

        documentEditor.addText("Hello world");
        documentEditor.addText("abc.jpg");
        documentEditor.addNewLine();
        documentEditor.addTab();
        documentEditor.addText("Who are you?");
        documentEditor.renderDocument();
        documentEditor.saveDocument();


    }
}