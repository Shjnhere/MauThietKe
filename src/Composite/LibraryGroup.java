package Composite;

import java.util.ArrayList;
import java.util.List;

public class LibraryGroup implements Borrowable {
    private String groupName;
    private List<Borrowable> members = new ArrayList<>();

    public LibraryGroup(String groupName) {
        this.groupName = groupName;
    }

    public void add(Borrowable member) {
        members.add(member);
    }

    @Override
    public void borrowBook() {
        System.out.println("Group " + groupName + " borrows:");
        for (Borrowable member : members) {
            member.borrowBook();
        }
    }

    @Override
    public void returnBook() {
        System.out.println("Group " + groupName + " returns:");
        for (Borrowable member : members) {
            member.returnBook();
        }
    }
}
