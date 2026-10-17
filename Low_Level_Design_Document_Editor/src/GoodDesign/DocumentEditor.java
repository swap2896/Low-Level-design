package GoodDesign;

import GoodDesign.DocumentElement.*;
import GoodDesign.Persistance.Persistance;

import java.io.IOException;

public class DocumentEditor {
    private Document document;
    private Persistance persistance;
    private String renderDocument= "";

    public DocumentEditor(Document document, Persistance persistance) {
        this.document = document;
        this.persistance = persistance;
    }


    public void addText(String text){
        document.addElement(new TextElement(text));
    }

    public void addImage(String imagePath) {
        document.addElement(new ImageElement(imagePath));
    }

    public void addTab(){
        document.addElement(new TabSpaceElement());
    }

    public void addNewLine(){
        document.addElement(new NewLineElement());
    }

    public String renderDocument(){
        this.renderDocument =document.render();
        return this.renderDocument;
    }

    public void saveDocument() throws IOException {
        persistance.save(this.renderDocument);
    }

}
