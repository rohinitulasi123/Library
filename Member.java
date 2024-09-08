import java.util.HashSet;
import java.util.Set;

public class Member {
    private final int id;
    private String name;
    private final Set<Book> issuedBooks = new HashSet<>();

    public Member(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Book> getIssuedBooks() {
        return issuedBooks;
    }

    public void issueBook(Book book) {
        issuedBooks.add(book);
    }

    public void returnBook(Book book) {
        issuedBooks.remove(book);
    }

    @Override
    public String toString() {
        return "Member ID: " + id + ", Name: " + name + ", Issued Books: " + issuedBooks;
    }
}
