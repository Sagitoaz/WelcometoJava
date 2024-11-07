package Items;

public class Pencil extends SchoolSupplies {
    private String color;
    private String material;
    private String hardness;

    public Pencil(String name, int price, String brand, String color, String material, String hardness) {
        this.setName(name);
        this.setPrice(price);
        this.setBrand(brand);
        this.color = color;
        this.material = material;
        this.hardness = hardness;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public void setMaterial(String material) {
        this.material = material;
    }
    public void setHardness(String hardness) {
        this.hardness = hardness;
    }

    public String getColor() {
        return color;
    }
    public String getMaterial() {
        return material;
    }
    public String getHardness() {
        return hardness;
    }
}
