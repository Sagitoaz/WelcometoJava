package Items;

public class SchoolSupplies {
    private String name;
    private int price;
    private String brand;

    public void setName(String name) {
        this.name = name;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }
    public String getBrand() {
        return brand;
    }
    public int getPrice() {
        return price;
    }
}
