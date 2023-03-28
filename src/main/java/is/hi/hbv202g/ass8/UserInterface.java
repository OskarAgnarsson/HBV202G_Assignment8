package is.hi.hbv202g.ass8;

import java.util.Scanner;

public class UserInterface {
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
        return;
    }

    private void studentInterface() {
        return;
    }

    private void adminInterface() {
        return;
    }
}
