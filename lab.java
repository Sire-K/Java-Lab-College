
// Lab Report 1
import java.util.Scanner;

class lab {
    public static void main(String[] args) {
        System.err.println("Enter two numbers: ");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println("The addition is: " + (a + b));
        System.out.println("The subtraction is: " + (a - b));
        System.out.println("The multiplication is: " + (a * b));
        System.out.println("The division is: " + (a / b));
        scanner.close();
    }
}