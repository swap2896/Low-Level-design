public abstract class FileSystem {
    public abstract void ls();
    public abstract void openAll();
    public abstract String getName();
    public abstract int getSize();
    public abstract FileSystem cd(String name);
    public abstract boolean isFolder();
}
