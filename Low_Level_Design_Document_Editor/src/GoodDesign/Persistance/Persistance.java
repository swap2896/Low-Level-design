package GoodDesign.Persistance;

import java.io.IOException;

public abstract class Persistance {
    public abstract void save(String data) throws IOException;
}
