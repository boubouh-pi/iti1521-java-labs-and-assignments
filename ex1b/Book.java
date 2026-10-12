public class Book {
    private String title, author;

    public Book(String a, String t) {
        author = a;
        title = t;
    }
    public String getAuthor() {
        return author;
    }
    public void affiche() {
        System.out.println(toString());
    }
    public String toString(){
        return ("Book[title=" + title+ ", author=" +author+"]");
    }

}