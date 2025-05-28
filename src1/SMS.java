package src1;

import java.util.Scanner;

public class SMS implements Messaging {
    @Override
    public String getMessage() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter SMS message: ");
        String msg = sc.nextLine();
        return msg;
    }

    @Override
    public String getRecipient() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter mobile number: ");
        String mobile = sc.nextLine();
        if (mobile.matches("\\d{10}")) {
            return mobile;
        } else {
            return "Invalid mobile number";
        }
    }

    @Override
    public void print() {
        String msg = getMessage();
        String recipient = getRecipient();
        if (recipient.equals("Invalid mobile number")) {
            System.out.println("Failed to send SMS: " + recipient);
        } else {
            System.out.println("SMS sent to " + recipient + ": " + msg);
        }
    }
}
