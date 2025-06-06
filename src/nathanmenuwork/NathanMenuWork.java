package nathanmenuwork;

import java.util.Scanner;

/**
 *
 * @author 344_13
 */
public class NathanMenuWork {

    public static void main(String[] args) {
        int choice = 0;
        Scanner scan = new Scanner(System.in);

        do {
            System.out.println("#############################");
            System.out.println("#########   Menu   ##########");
            System.out.println("#############################");
            System.out.println("#### 1) Plus");
            System.out.println("#### 2) Minus");
            System.out.println("#### 3) Exit");
            System.out.print("Enter your menu : ");
            choice = scan.nextInt();

            switch (choice) {
                case 1:
                    plus(scan);
                    break;
                case 2:
                    minus(scan);
                    break;
                case 3:
                    System.out.println("Exiting program...");
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }

            System.out.println(); // Line spacing
        } while (choice != 3);
    }

    public static void plus(Scanner scan) {
        int num1, num2, result;
        System.out.print("Enter first number: ");
        num1 = scan.nextInt();
        System.out.print("Enter second number: ");
        num2 = scan.nextInt();
        result = num1 + num2;
        System.out.println("Result: " + result);
    }

    public static void minus(Scanner scan) {
        int num1, num2, result;
        System.out.print("Enter first number: ");
        num1 = scan.nextInt();
        System.out.print("Enter second number: ");
        num2 = scan.nextInt();
        result = num1 - num2;
        System.out.println("Result: " + result);
    }
}
