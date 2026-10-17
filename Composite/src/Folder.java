import java.util.ArrayList;
import java.util.List;

public class Folder extends FileSystem {
    List<FileSystem> fsList = new ArrayList<>();
    String name;

    Folder(String name) {
        this.name = name;
    }

    public void add(FileSystem fs){
        this.fsList.add(fs);
    }
    @Override
    public void ls() {
        for(FileSystem f : fsList){
            System.out.println(f.getName());
        }
    }

    @Override
    public void openAll() {
        for(FileSystem f: fsList){
            if(f.isFolder()){
                System.out.println(f.getName());
                f.openAll();
            }else {
                f.openAll();
            }
        }
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getSize() {
        int total = 0;
        for(FileSystem f: fsList){
            total = total + f.getSize();
        }
        return total;
    }

    @Override
    public FileSystem cd(String target) {
        for(FileSystem f: fsList){
            if(f.isFolder() && f.getName().equals(target))
                return f;
        }
        return null;
    }

    @Override
    public boolean isFolder() {
        return true;
    }
}
