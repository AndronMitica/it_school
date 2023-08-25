package session9.bookManagementSystem;

public class Book {

    private String title;

    private float price;

//    private List<Author> authors;
//    private int shelfLocation;
//    private String genre;
//    private String ISBN;
//    private int numberPages;
//    private int stock;
//    private float discount;
//    private String bookPublisher;
//    private LocalDate publishedDate;

    public Book(){

    }

    public Book(String title, float price) {
        this.title = title;
        this.price = price;
    }
    void printBookInfo() {
        System.out.println("Book title: " + title);
        System.out.println("Book price: " + price + " RON ");
    }

    public float getPrice() {
        return price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}