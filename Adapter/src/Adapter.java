public class Adapter implements JsonClass {

    XMLClass xmlClass;

    Adapter(XMLClass xmlClass){
        this.xmlClass = xmlClass;
    }
    public String convertToJson(String xmldata){
        System.out.println("Xml data received: " +xmldata);
        System.out.println("Converting to JSON");
        return "json data";
    }

    @Override
    public String getData() {
        return convertToJson(this.xmlClass.getXmlData());
    }
}
