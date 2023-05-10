package UniversityOfKelaniyaLibrary;
import java.util.ArrayList;
import java.util.Scanner;

public class LibraryManagementSystem {
    private ArrayList<Book> books = new ArrayList<>();
    private ArrayList<Student> students = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);
    private int bookId = 1;

    public void addBook() {
        System.out.print("Enter book ID    : ");
        String bookId = scanner.nextLine();
        System.out.print("Enter book title : ");
        String title = scanner.nextLine();
        System.out.print("Enter book author: ");
        String author = scanner.nextLine();
        Book book = new Book(bookId, title, author, true);
        books.add(book);
        System.out.println("\n\tBook added successfully!\n\n\n");
    }

    public void deleteBook() {
        System.out.print("Enter book ID to delete  : ");
        String bookId = scanner.nextLine();
        boolean found = false;
        for (Book book : books) {
            if (book.getId().equals(bookId)) {
                books.remove(book);
                System.out.println("\n\tBook deleted successfully!\n\n\n");
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("\tBook not found!\n\n\n");
        }
    }

    public void checkoutBook() {
        System.out.print("Enter student ID          : ");
        String studentId = scanner.nextLine();
        System.out.print("Enter book ID to checkout : ");
        String bookId = scanner.nextLine();
        boolean studentFound = false;
        boolean bookFound = false;
        for (Student student : students) {
            if (student.getId().equals(studentId)) {
                studentFound = true;
                for (Book book : books) {
                    if (book.getId().equals(bookId)) {
                        bookFound = true;
                        if (book.isAvailable()) {
                            book.setAvailable(false);
                            student.borrowBook(book);
                        } else {
                            System.out.println("\tBook not available!\n\n\n");
                        }
                        break;
                    }
                }
                break;
            }
        }
        if (!studentFound) {
            System.out.println("\tStudent not found!");
        }
        if (!bookFound) {
            System.out.println("\tBook not found!\n\n\n");
        }
    }

    public void returnBook() {
        System.out.println("Enter student ID        : ");
        String studentId = scanner.nextLine();
        System.out.println("Enter book ID to return : ");
        String bookId = scanner.nextLine();
        boolean studentFound = false;
        boolean bookFound = false;
        for (Student student : students) {
            if (student.getId().equals(studentId)) {
                studentFound = true;
                for (Book book : student.getBorrowedBooks()) {
                    if (book.getId().equals(bookId)) {
                        bookFound = true;
                        book.setAvailable(true);
                        student.returnBook(book);
                        break;
                    }
                }
                break;
            }
        }
        if (!studentFound) {
            System.out.println("\tStudent not found!");
        }
        if (!bookFound) {
            System.out.println("\tBook not found!\n\n\n");
        }
    }

    public void addStudent() {
        System.out.print("Enter student id    : ");
        String studentId = scanner.nextLine();
        System.out.print("Enter student name  : ");
        String name = scanner.nextLine();
        Student student = new Student(studentId,name);
        students.add(student);
        System.out.println("\n\tStudent added successfully!\n\n\n");
    }

    public void displayBooks() {
        System.out.println("Books>>>>.....  ");
        for (Book book : books) {
            System.out.println(book);
        }
    }

    public void displayStudents() {
        System.out.println("Students>>>..... ");
        for (Student student : students) {
            System.out.println(student);
        }
    }
}