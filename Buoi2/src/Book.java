public class Book {

    private String title;
    private String author;
    private String type;
    private String publicationDate;

    public Book(String title, String author, String type, String publicationDate) {
        this.title = title;
        this.author = author;
        this.type = type;
        this.publicationDate = publicationDate;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setType(String type) {
        this.type = type;
    }

    public  void setPublicationDate(String publicationDate) {
        this.publicationDate = publicationDate;
    }

    public String getTitle() {
        return this.title;
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

}
