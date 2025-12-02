package Exercise02;

public class Book {
    private String title;
    private String author;
    private double price;
    public Book() {
        this.title = title;
        this.author = author;
        this.price = price;
    }
    public String getTitle() {
        return title;
    }
    public String getAuthor() {
        return author;
    }
    public double getPrice() {
        return price;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public void setPrice(double price) {
        if (price < 0) {
            System.out.println("Gia khong duoc am");
        }else  {
            this.price = price;
        }
    }
}
