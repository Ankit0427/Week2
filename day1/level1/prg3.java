// Book class
class Book {
    private String title;
    private String author;
    private double price;

    // Constructor
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Method to display book details
    public void displayDetails() {
        System.out.println("Book Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: $" + String.format("%.2f", price));
    }
}

// Main class
public class prg3 {
    public static void main(String[] args) {
        // Create book objects
        Book book1 = new Book("To Kill a Mockingbird", "Harper Lee", 18.99);
        Book book2 = new Book("1984", "George Orwell", 14.99);

        // Display details of each book
        System.out.println("Book 1 Details:");
        book1.displayDetails();
        System.out.println();

        System.out.println("Book 2 Details:");
        book2.displayDetails();
    }
}