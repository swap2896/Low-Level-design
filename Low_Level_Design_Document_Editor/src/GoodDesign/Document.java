package GoodDesign;

import GoodDesign.DocumentElement.DocumentElement;

import java.util.ArrayList;
import java.util.List;

public class Document {
    List<DocumentElement> documentElementList = new ArrayList<>();

    public void addElement(DocumentElement documentElement){
        documentElementList.add(documentElement);
    }

    public String render() {
        String result = "";
        for(DocumentElement documentElement : documentElementList){
            result = result + documentElement.render();
        }
        return result;
    }
}
