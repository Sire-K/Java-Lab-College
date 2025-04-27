import java.util.Scanner;

class lab {
    public static void main(String[] args) {
        System.err.println("Enter two numbers: ");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println("The sum is: " + (a + b));
    }
}
