
//Lab 1
import java.util.Scanner;

class lab {
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

//Lab 2
import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter marks obtained (0-100): ");
        int marks = scanner.nextInt();

        if (marks < 0 || marks > 100) {
            System.out.println("Invalid input. Marks should be between 0 and 100.");
            return;
        }

        String grade;
        switch (marks / 10) {
            case 10: // 100
                grade = "A+";
                break;
            case 9:  // 90-99
                grade = "A+";
                break;
            case 8:  // 80-89
                grade = "A";
                break;
            case 7:  // 70-79
                grade = "B+";
                break;
            case 6:  // 60-69
                grade = "B";
                break;
            case 5:  // 50-59
                grade = "C+";
                break;
            case 4:  // 40-49
                grade = "C";
                break;
            default: // 0-39
                grade = "F (Fail)";
        }

        System.out.println("Grade: " + grade);
    }
}

