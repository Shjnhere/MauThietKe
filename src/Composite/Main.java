package Composite;

public class Main {
    public static void main(String[] args) {
        Book b1 = new Book("Java Basics");
        Book b2 = new Book("Design Patterns");

        Member m1 = new Member("Alice");
        m1.addItem(b1);

        Member m2 = new Member("Bob");
        m2.addItem(b2);

        LibraryGroup group = new LibraryGroup("Team A");
        group.add(m1);
        group.add(m2);

        // Borrow
        group.borrowBook();

        System.out.println("-----");

        // Return
        group.returnBook();
    }
}
