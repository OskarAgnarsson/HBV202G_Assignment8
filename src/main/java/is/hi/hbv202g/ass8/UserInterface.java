package is.hi.hbv202g.ass8;

import java.util.List;
import java.util.Scanner;

public class UserInterface {

    private LibrarySystem librarySystem;

    public UserInterface() {
        librarySystem = new LibrarySystem();
    }
    public void start() {
        while (true) {
            System.out.println("What would you like to do?");
            System.out.println("1. Faculty Member");
            System.out.println("2. Student");
            System.out.println("3. Administrator");
            System.out.println("4. Exit");

            Scanner scanner = new Scanner(System.in);
            System.out.print(": ");
            int input = scanner.nextInt();

            if (input == 1) {
                facultyInterface();
            }
            else if (input == 2) {
                studentInterface();
            }
            else if (input == 3) {
                adminInterface();
            }
            else if (input == 4) {
                break;
            }
            else {
                System.out.println("Idiot");
            }
        }
    }

    private void facultyInterface() {
        List<FacultyMember> facultyMembers;

        while (true) {
            System.out.println("");
        }
    }

    private void studentInterface() {
        return;
    }

    private void adminInterface() {
        while (true) {
            System.out.println("What would you like to do?");
            System.out.println("1. Add Faculty Member");
            System.out.println("2. Add Student");
            System.out.println("3. Exit");

            Scanner scanner = new Scanner(System.in);
            System.out.print(": ");
            int input = scanner.nextInt();

            if (input == 1) {
                System.out.print("Input name of faculty member: ");
                String input1 = scanner.nextLine();
                System.out.print("Input department of faculty member: ");
                String input2 = scanner.nextLine();

                librarySystem.addFacultyMemberUser(input1,input2);
                System.out.println("Faculty Member Created");
            }
            else if (input == 2) {
                System.out.print("Input name of student: ");
                String input1 = scanner.nextLine();
                System.out.print("Input whether student has paid fee (y/n): ");
                String input2 = scanner.nextLine();

                boolean feePaid;
                if (input2.equals("y")) {
                    feePaid = true;
                }
                else if (input2.equals("n")) {
                    feePaid = false;
                }
                else {
                    System.out.println("Invalid input, defaulting to not paid fee...");
                    feePaid = false;
                }

                librarySystem.addStudentUser(input1,feePaid);
                System.out.println("Student created");
            }
            else if (input == 3) {
                break;
            }
            else {
                System.out.println("Invalid input");
            }
        }
    }
}
