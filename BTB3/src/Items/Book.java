package Items;

public class Book extends SchoolSupplies {

    private String author;
    private String type;
    private String publicationDate;
    private String language;

    public Book(String name, String author, String type, String publicationDate, int price, String language, String publisher) {
        this.setName(name);
        this.author = author;
        this.type = type;
        this.publicationDate = publicationDate;
        this.setPrice(price);
        this.language = language;
        this.setBrand(publisher);
    }

    public void setAuthor(String author) {
        this.author = author;
    }
    public void setType(String type) {
        this.type = type;
    }
    public void setPublicationDate(String publicationDate) {
        this.publicationDate = publicationDate;
    }
    public void setLanguage(String language) {
        this.language = language;
    }

    public String getAuthor() {
        return this.author;
    }
    public String getType() {
        return this.type;
    }
    public String getPublicationDate() {
        return this.publicationDate;
    }
    public String getLanguage() {
        return this.language;
    }
}
