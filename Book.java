public class Book {
    String title;
    String author;
    int yearPublished;
    double price;

    public Book(String title, String author, int yearPublished, double price) {
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
        this.price = price;
    }


    public static void main(String[] args) {
        Book book1 = new Book("Java Programming", "John Smith", 2021, 39.99);
        Book book2 = new Book("Python Basics", "Jane Doe", 2020, 29.99);
        Book book3 = new Book("C++ Essentials", "Michael Johnson", 2019, 49.99);

        printBookDetails("Book 1", book1);
        printBookDetails("Book 2", book2);
        printBookDetails("Book 3", book3);
    }

    public static void printBookDetails(String bookName, Book book) {
        System.out.println(bookName + ":");
        System.out.println("Title: \"" + book.title + "\"");
        System.out.println("Author: \"" + book.author + "\"");
        System.out.println("Year Published: " + book.yearPublished);
        System.out.println("Price: $" + book.price);
        System.out.println();
    }
}
