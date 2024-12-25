
import java.util.HashMap;
import java.util.Map;

class Book{

    private String title;
    private String author;

    public Book(String author, String title) {
        this.author = author;
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public String toString() {
        return "Book{" + "title='" + title + '\'' + ", author='" + author + '\'' + '}';
    }

}

class Library{

    private Map<Integer,Book> bookCollection;
    public Library(){
        this.bookCollection = new HashMap<>();
    }

    public void addBook(int id, Book book){

        bookCollection.put(id, book);
    }

    public void removeBook(int id) {
        bookCollection.remove(id);
    }

    public Book getBookById(int id) {
        return bookCollection.get(id);
    }

    public void showBooks() {
        if (bookCollection.isEmpty()) {
            System.out.println("No books in the library.");
        } else {
            for (Map.Entry<Integer, Book> entry : bookCollection.entrySet()) {
                System.out.println("ID: " + entry.getKey() + ", " + entry.getValue());
            }
        }
    }
}

public class HashMapEx {
    public static void main(String[] args) {
        Library library = new Library();


        Book book1 = new Book("1984", "George Orwell");
        Book book2 = new Book("Brave New World", "Aldous Huxley");
        Book book3 = new Book("The Catcher in the Rye", "J.D. Salinger");

        library.addBook(101, book1);
        library.addBook(102, book2);
        library.addBook(103, book3);

         // Show all books in the library
         System.out.println("Books in the library:");
         library.showBooks();
 
         // Get a specific book by its ID
         System.out.println("\nDetails of book with ID 102:");
         System.out.println(library.getBookById(102));
 
         // Remove a book by its ID
         library.removeBook(101);
 
         // Show books after removal
         System.out.println("\nBooks after removing one:");
         library.showBooks();
     
    }
}
