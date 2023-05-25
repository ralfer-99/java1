class Book {
    private String title;
    private String author;
    private int publicationYear;

    public Book(String title, String author, int publicationYear) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPublicationYear() {
        return publicationYear;
    }
}

public class Library {
    private Book[] books;
    private int numberOfBooks;

    public Library(int capacity) {
        books = new Book[capacity];
        numberOfBooks = 0;
    }

    public void addBook(Book book) {
        if (numberOfBooks < books.length) {
            books[numberOfBooks] = book;
            numberOfBooks++;
            System.out.println("Book added successfully.");
        } else {
            System.out.println("Library is full. Cannot add more books.");
        }
    }

    public void displayBooks() {
        System.out.println("Library Collection:");
        // for (int i = 0; i < numberOfBooks; i++) { // We can use for each loop instend
        // of this

        for (Book book : books) {

            Book books = Book[i];
            System.out.println("Title: " + book.getTitle());
            System.out.println("Author: " + book.getAuthor());
            System.out.println("Publication Year: " + book.getPublicationYear());
            System.out.println("------------------------");
        }
    }

    public static void main(String[] args) {
        Library library = new Library(5);

        Book book = new Book("Java Programming", "John Smith", 2020);
        library.addBook(book);

        // library.addBook(new Book("Java Programming", "John Smith", 2020));
        library.addBook(new Book("Python Basics", "Jane Doe", 2019));
        library.addBook(new Book("Data Structures", "David Johnson", 2018));

        library.displayBooks();
    }
}