package src1;

import java.util.Scanner;

public class Email implements Messaging {
    @Override
    public String getMessage() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Email message: ");
        String msg = sc.nextLine();
        return msg;
    }

    @Override
    public String getRecipient() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter email address: ");
        String email = sc.nextLine();
        return email;
    }

    @Override
    public void print() {
        String msg = getMessage();
        String recipient = getRecipient();
        System.out.println("Email sent to " + recipient + ": " + msg);
    }
}
