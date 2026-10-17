import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
// Bad design (Initial approach)
public class BadDesignDocumentEditor {

    List<String> elements = new ArrayList<>();
    String renderDocument;

    public void addText(String text){
        elements.add(text);
    }

    public void addImage(String path){
        elements.add(path);
    }

    public String getRenderDocument(){
        StringBuffer result = new StringBuffer();
        for(String text: elements){
            if(text.length()>4 && (text.endsWith(".png") || text.endsWith(".jpg"))){
                result.append("image Path:").append(text);
            }else{
                result.append(text).append("\n");
            }
        }
        this.renderDocument = result.toString();
        System.out.println(renderDocument);
        return renderDocument;
    }

    public void saveToFile() throws IOException {
        String filePath ="document.txt";

        try (FileWriter fileWriter =new FileWriter(filePath, true)){
            fileWriter.write(this.renderDocument);
        } catch (IOException e){
            System.out.println("Exception: "+e);
        }
    }

}
