import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books = new ArrayList<>();

    public void addBook(Book book) throws InvalidBookException {
        if (book == null)
            throw new InvalidBookException("Books should not be null.");
        else
            books.add(book);
    }

    private Book findBook(String title) {
        for (Book book : books) {
            if (book.getTitle() == title)
                return book;
        }
        return null;
    }

    public void borrowBook(String title) throws BookNotFoundException, EmptyLibraryException {
        if (books.isEmpty())
            throw new EmptyLibraryException("Library is empty, no books to borrow.");
        else if (findBook(title) == null)
            throw new BookNotFoundException("Book with title " + title + " not found");
        else
            System.out.println(findBook(title).toString() + " successfully borrowed");
    }

    public void returnBook(String title) throws BookNotFoundException{
        if (findBook(title) == null)
            throw new BookNotFoundException("Cannot return. Book with title " + title + " not found");
        else
            System.out.println(findBook(title).toString() + " successfully returned");
    }

    public void listBooks() throws EmptyLibraryException{
        if (books.isEmpty())
            throw new EmptyLibraryException("Library is empty.");
        else{
            System.out.println("Books in the library:");
            for (Book book : books) {
                System.out.println(book.toString());
            }
        }
    }

    public ArrayList<Book> getBooks(ArrayList<Book> books){
        return books;
    }
}
