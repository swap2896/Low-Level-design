package GoodDesign.Persistance;

import java.io.FileWriter;
import java.io.IOException;

public class SaveToFile extends Persistance {
    @Override
    public void save(String data) throws IOException {
        System.out.println("Printing data:" + data);
        try (FileWriter fileWriter = new FileWriter("GoodDesign.txt", true)) {
            fileWriter.write(data);
            System.out.println("Document saved in GoodDesign.txt");
        } catch (Exception e) {
            System.out.println("Exception thrown");
        }
    }
}
