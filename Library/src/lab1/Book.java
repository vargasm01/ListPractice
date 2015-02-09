package lab1;

/**
 * Represents a book.
 *
 * @author Mauricio Vargas
 */
public class Book {

    private String title;

    private boolean borrowed;

    /**
     * Creates a new Book
     */
    public Book(String bookTitle) {
        this.title = bookTitle;
    }

    /**
     * Marks the book as rented
     */
    public void borrowed() {
        this.borrowed = true;
    }

    /**
     * Marks the book as not rented
     */
    public void returned() {
        this.borrowed = false;
    }

    /**
     * Returns true if the book is rented, false otherwise
     */
    public boolean isBorrowed() {
        return borrowed;
    }

    /**
     * Returns the title of the book
     */
    public String getTitle() {
        // Implement this method
        return title;
    }

    public static void main(String[] arguments) {
        // Small test of the Book class
        Book example = new Book("The Da Vinci Code");
        System.out.println("Title (should be The Da Vinci Code): " + example.getTitle());
        System.out.println("Borrowed? (should be false): " + example.isBorrowed());
        example.borrowed();
        System.out.println("Borrowed? (should be true): " + example.isBorrowed());
        example.returned();
        System.out.println("Borrowed? (should be false): " + example.isBorrowed());
    }

    private void rented() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
