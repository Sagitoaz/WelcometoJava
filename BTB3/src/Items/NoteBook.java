package Items;

public class NoteBook extends SchoolSupplies {
    private String numberOfPage;
    private String type;
    private String color;
    private String material;
    private String size;

    public NoteBook(String name, int price, String brand, String numberOfPage, String type, String color, String material, String size) {
        this.setName(name);
        this.setPrice(price);
        this.setBrand(brand);
        this.numberOfPage =numberOfPage;
        this.type = type;
        this.color = color;
        this.material = material;
        this.size = size;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public void setMaterial(String material) {
        this.material = material;
    }
    public void setNumberOfPage(String numberOfPage) {
        this.numberOfPage = numberOfPage;
    }
    public void setSize(String size) {
        this.size = size;
    }
    public void setType(String type) {
        this.type = type;
    }

    public String getNumberOfPage() {
        return numberOfPage;
    }
    public String getColor() {
        return color;
    }
    public String getMaterial() {
        return material;
    }
    public String getSize() {
        return size;
    }
    public String getType() {
        return type;
    }

}
