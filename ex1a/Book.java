public class Book {
    private String title, author;
    private double price;
    public Book(String a, String t) {
        author = a;
        title = t;
    }
    public String getAuthor() {
        return author;
    }
    public void affiche() {
        System.out.println("Book[title=" + title + ", author=" +author+"]");
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {

        this.price = price;
    }
}
