
import java.util.ArrayList;
import java.util.List;

class Book{
    private final String title;
    private final String author;

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

    private final List<Book> books;
    public Library(){
        this.books = new ArrayList<>();
    }

    public void addBook(Book book){
        books.add(book);
    }

    public void removeBook(Book book){

        books.remove(book);
    }

    public void showBooks(){

        if(books.isEmpty()){

             System.out.println("No book in the library");
        }
        else{
            for (Book book : books) {
                System.out.println(book);
            }
        }
    }
}

public class ListExample {
    public static void main(String[] args) {
        Library library = new Library();
        Book book1 = new Book("1984", "George Orwell");
        Book book2 = new Book("Brave New World", "Aldous Huxley");
        Book book3 = new Book("The Catcher in the Rye", "J.D. Salinger");

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        System.out.println("Books in the library:");
        library.showBooks();

        library.removeBook(book2);


        System.out.println("\nBooks after removing one:");
        library.showBooks();

    }
}
