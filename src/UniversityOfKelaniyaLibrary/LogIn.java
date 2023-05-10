package UniversityOfKelaniyaLibrary;

import java.util.Scanner;

public abstract class LogIn implements User{
    public static void main(String[] args) {
        boolean answer = true;
        int count = 0;
        do {
            System.out.println("--------------------------------------------");
            System.out.println("---------LIBRARY MANAGEMENT SYSTEM----------");
            System.out.println("-----------University Of Kelaniya-----------");
            System.out.println("--------------------------------------------");
            Scanner scanner = new Scanner(System.in);
            System.out.print("\nEnter User name   : ");
            String userName = scanner.nextLine();
            System.out.print("Enter Password    : ");
            String password = scanner.nextLine();
            User user = new User() {
                @Override
                public Object usename() {
                    return username;
                }

                @Override
                public Object password() {
                    return password;
                }
            };
            if (userName.equals(user.usename()) && password.equals(user.password())) {
                count = 0;
                System.out.println("\n\tLogin Succesfully!!!!\n\n");

                //Library Management System lobby is run now this main object run
                LibraryMain main = new LibraryMain();
                main.libraryLobby();

            } else if (count == 2) {
                System.out.println("\n\tWrong!!!\n\tWARNING!!! \tYour Last time, Again you enter wrong, Application is lock \n\tType username and password again!!!\n\n\n");
                count++;

            } else if (count == 3) {
                System.out.println("\n\tWrong password!!!\n\n\tBlock Entry!!!\n\n\n");
                answer = false;

            } else {
                System.out.println("\n\tWrong!!!\n\tType username and password again!!!\n\n\n");
                count++;
            }
            System.out.println("\tThank you for your time, Bye!!!");
        }while (answer);
    }

}
