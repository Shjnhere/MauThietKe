package Composite;

public class Book implements Borrowable {
    private String title;

    public Book(String title) {
        this.title = title;
    }

    @Override
    public void borrowBook() {
        System.out.println("Book \"" + title + "\" has been borrowed.");
    }

    @Override
    public void returnBook() {
        System.out.println("Book \"" + title + "\" has been returned.");
    }
}