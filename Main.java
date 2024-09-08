public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        // Create some books
        Book book1 = new Book("1234567890", "Effective Java", "Joshua Bloch");
        Book book2 = new Book("0987654321", "Clean Code", "Robert C. Martin");

        // Add books to the library
        library.addBook(book1);
        library.addBook(book2);

        // Create a member
        Member member = new Member(1, "John Doe");

        // Add member to the library
        library.addMember(member);

        // Issue books to the member
        library.issueBook("1234567890", 1);
        library.issueBook("0987654321", 1);

        // Display member details
        System.out.println(member);

        // Return one book
        library.returnBook("1234567890", 1);

        // Display member details again
        System.out.println(member);
    }
}
