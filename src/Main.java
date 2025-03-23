public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        try {
            library.listBooks();
        } catch (EmptyLibraryException e) {
            System.out.println(e.getMessage());
        }

        Book book1 = null;
        Book book2 = null;
        Book book3 = null;
        Book book4 = null;

        book1 = new Book("Java Programming", 300);
        book2 = new Book("Design Patterns", -3);
        book3 = new Book(null, 100);
        book4 = new Book("", 400);

        try {
            library.addBook(book1);
        } catch (InvalidBookException e) {
            System.out.println(e.getMessage());
        }
        try {
            library.addBook(book2);
        } catch (InvalidBookException e) {
            System.out.println(e.getMessage());
        }
        try {
            library.addBook(book3);
        } catch (InvalidBookException e) {
            System.out.println(e.getMessage());
        }
        try {
            library.addBook(book4);
        } catch (InvalidBookException e) {
            System.out.println(e.getMessage());
        }

        try {
            library.listBooks();
        } catch (EmptyLibraryException e) {
            System.out.println(e.getMessage());
        }

        library.borrowBook("Java Programming");
        library.returnBook("Clean Code");
        library.returnBook("Java Programming");
    }
}