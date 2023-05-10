package UniversityOfKelaniyaLibrary;

import java.util.Scanner;

public class LibraryMain {
    int choice;
    void libraryLobby() {
        LibraryManagementSystem lms = new LibraryManagementSystem();
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("\n\t1. Add book");
            System.out.println("\t2. Delete book");
            System.out.println("\t3. Checkout book");
            System.out.println("\t4. Return book");
            System.out.println("\t5. Add student");
            System.out.println("\t6. Display books");
            System.out.println("\t7. Display students");
            System.out.println("\t8. Exit");
            System.out.print("\n\tEnter choice :  ");
            try {
                choice = Integer.parseInt(scanner.nextLine());
                System.out.println();
                switch (choice) {
                    case 1:
                        lms.addBook();
                        break;
                    case 2:
                        lms.deleteBook();
                        break;
                    case 3:
                        lms.checkoutBook();
                        break;
                    case 4:
                        lms.returnBook();
                        break;
                    case 5:
                        lms.addStudent();
                        break;
                    case 6:
                        lms.displayBooks();
                        break;
                    case 7:
                        lms.displayStudents();
                        break;
                    case 8:
                        System.out.println("\tExiting...\n\n");
                        break;
                    default:
                        System.out.println("\tInvalid choice!\n\n");
                        break;
                }
            } catch (NumberFormatException e) {
               System.out.println("\t" + "Please Input Integer Value" + "\n");
           }
        } while (choice != 8);
    }
}