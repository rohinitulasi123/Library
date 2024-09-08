import java.util.HashMap;
import java.util.Map;

public class Library {
    private final Map<String, Book> books = new HashMap<>();
    private final Map<Integer, Member> members = new HashMap<>();

    public void addBook(Book book) {
        books.put(book.getIsbn(), book);
    }

    public void addMember(Member member) {
        members.put(member.getId(), member);
    }

    public void issueBook(String isbn, int memberId) {
        Book book = books.get(isbn);
        Member member = members.get(memberId);
        if (book != null && member != null) {
            member.issueBook(book);
        }
    }

    public void returnBook(String isbn, int memberId) {
        Book book = books.get(isbn);
        Member member = members.get(memberId);
        if (book != null && member != null) {
            member.returnBook(book);
        }
    }
}
