package UniversityOfKelaniyaLibrary;
import java.util.ArrayList;

class Student extends Person {
    private String StudentId;

    public Student(String studentId, String name) {
        super(name);
        this.StudentId = studentId;
    }

    private ArrayList<Book> borrowedBooks = new ArrayList<>();


    public String getId() {
        return StudentId;
    }

    public ArrayList<Book> getBorrowedBooks() {
        return borrowedBooks;
    }

    public void borrowBook(Book book) {
        borrowedBooks.add(book);
        System.out.println("\n\tBook borrowed successfully!\n\n");
    }

    public void returnBook(Book book) {
        borrowedBooks.remove(book);
        System.out.println("\n\tBook returned successfully!\n\n");
    }

    @Override
    public String toString() {
        return "Student \tId = " + getId() + " \tname = " + getName() + " \tborrowedBooks = " + borrowedBooks + "\n";
    }
}