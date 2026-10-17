//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

        Folder root = new Folder("root");
        root.add(new File("file1.txt",1));
        root.add(new File("file2.txt",1));


        Folder docs = new Folder("docs");
        docs.add(new File("resume.pdf",2));
        docs.add(new File("notes.pdf",2));
        root.add(docs);

        Folder images = new Folder("images");
        images.add(new File("photo.jpg",2));
        root.add(images);

        root.openAll();

        root.ls();

        docs.ls();

        System.out.println(root.getSize());
        System.out.println(docs.getSize());
    }
}