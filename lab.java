import java.util.Scanner;

class Lab {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = 0;
        int b = 0;

        while (true) {
            System.out.print("Enter the first number: ");
            String input_a = scanner.nextLine();
            System.out.print("Enter the second number: ");
            String input_b = scanner.nextLine();

            if (isInteger(input_a) && isInteger(input_b)) {
                a = Integer.parseInt(input_a);
                b = Integer.parseInt(input_b);
                break;
            } else {
                System.out.println("Invalid input. Please enter valid integers.");
            }
        }

        System.out.println("The addition is: " + (a + b));
        System.out.println("The subtraction is: " + (a - b));
        System.out.println("The multiplication is: " + (a * b));

        if (b != 0) {
            System.out.println("The division is: " + (a / b));
        } else {
            System.out.println("Division by zero is not allowed.");
        }

        scanner.close();
    }

    public static boolean isInteger(String str) {
        if (str == null || str.isEmpty()) {
            return false;
        }
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
