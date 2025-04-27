import java.util.Scanner;

class lab {
    public static void main(String[] args) {
        System.err.println("Enter two numbers: ");
        Scanner scanner = new Scanner(System.in);

        if (scanner.hasNextInt()) {
            int a = scanner.nextInt();
            if (scanner.hasNextInt()) {
                int b = scanner.nextInt();

                System.out.println("The addition is: " + (a + b));
                System.out.println("The subtraction is: " + (a - b));
                System.out.println("The multiplication is: " + (a * b));

                if (b != 0) {
                    System.out.println("The division is: " + (a / b));
                } else {
                    System.out.println("Division by zero is not allowed.");
                }
            } else {
                System.err.println("Invalid input. Please enter integers only.");
            }
        } else {
            System.err.println("Invalid input. Please enter integers only.");
        }
        scanner.close();
    }
}