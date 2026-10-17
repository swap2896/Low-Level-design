package GoodDesign.DocumentElement;

public class ImageElement extends DocumentElement{
    String imagePath;
    public ImageElement(String imagePath){
        this.imagePath = imagePath;
    }
    @Override
    public String render() {
        return "Image path "+ imagePath;
    }
}
