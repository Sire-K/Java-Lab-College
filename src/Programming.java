public class Programming extends FirstYearCourse {
    @Override
    void printName() {
        System.out.println("Course Name: Programming");
    }

    @Override
    void printCode() {
        System.out.println("Course Code: PRG101");
    }

    public static void main(String[] args) {
        Programming prog = new Programming();
        prog.printName();
        prog.printCode();
        prog.printTotalWeeks();
        prog.showSemesterDetails();
    }

    public static void showSemesterDetails() {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Enter 1 for Semester I details or 2 for Semester II details: ");
        int choice = scanner.nextInt();
        Programming prog = new Programming();
        if (choice == 1) {
            prog.printSemesterICourses();
        } else if (choice == 2) {
            prog.printSemesterIICourses();
        } else {
            System.out.println("Invalid choice.");
        }
        scanner.close();
    }
}
