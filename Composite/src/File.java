public class File extends FileSystem{
    String name;
    int size;

    File(String name, int size){
        this.name = name;
        this.size = size;
    }
    @Override
    public void ls() {
        System.out.println(name);
    }

    @Override
    public void openAll() {
        System.out.println(name);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public FileSystem cd(String name) {
        return null;
    }

    @Override
    public boolean isFolder() {
        return false;
    }
}
