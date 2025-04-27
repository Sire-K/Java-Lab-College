
//Lab 1
import java.util.Scanner;

class lab {
    public static void main(String[] args) {
        System.err.println("Enter two numbers: ");
        Scanner scanner = new Scanner(System.in);

        int a = 0;
        int b = 0;

        while (true) {
            System.out.print("Enter your age: ");
            String input = scanner.nextLine();

            if (isInteger(input)) {
                a = Integer.parseInt(input);
                break;
            } else {
                System.out.println("Invalid input. Please enter a valid integer.");
            }
        }

        while (true) {
            System.out.print("Enter your age: ");
            String input = scanner.nextLine();

            if (isInteger(input)) {
                b = Integer.parseInt(input);
                break;
            } else {
                System.out.println("Invalid input. Please enter a valid integer.");
            }
        }

        System.out.println("The addition is: " + (a + b));
        System.out.println("The subtraction is: " + (a - b));
        System.out.println("The multiplication is: " + (a * b));

        if (b != 0 && a != 0) {
            System.out.println("The division is: " + (a / b));
        } else {
            System.out.println("Division by zero is not allowed.");
        }

        scanner.close();
    }
}