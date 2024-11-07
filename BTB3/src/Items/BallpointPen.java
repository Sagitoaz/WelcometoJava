package Items;

public class BallpointPen extends SchoolSupplies {
    private String color;
    private String material;
    private String inkType;
    private String smoothness;

    public BallpointPen(String name, int price, String brand, String color, String material, String inkType, String smoothness) {
        this.setName(name);
        this.setPrice(price);
        this.setBrand(brand);
        this.color = color;
        this.material = material;
        this.inkType = inkType;
        this.smoothness = smoothness;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public void setMaterial(String material) {
        this.material = material;
    }
    public void setInkType(String inkType) {
        this.inkType = inkType;
    }
    public void setSmoothness(String smoothness) {
        this.smoothness = smoothness;
    }

    public String getColor() {
        return color;
    }
    public String getMaterial() {
        return material;
    }
    public String getInkType() {
        return inkType;
    }
    public String getSmoothness() {
        return smoothness;
    }
}
