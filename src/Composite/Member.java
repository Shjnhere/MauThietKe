package Composite;

import java.util.ArrayList;
import java.util.List;

public class Member implements Borrowable {
    private String name;
    private List<Borrowable> borrowedItems = new ArrayList<>();

    public Member(String name) {
        this.name = name;
    }

    public void addItem(Borrowable item) {
        borrowedItems.add(item);
    }

    @Override
    public void borrowBook() {
        System.out.println("Member " + name + " borrows:");
        for (Borrowable item : borrowedItems) {
            item.borrowBook();
        }
    }

    @Override
    public void returnBook() {
        System.out.println("Member " + name + " returns:");
        for (Borrowable item : borrowedItems) {
            item.returnBook();
        }
    }
}