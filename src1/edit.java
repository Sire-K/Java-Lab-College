package src1;

public class MessagingService {
    public static void main(String[] args) {
        Messaging sms = new SMS();
        sms.printConnection();
        sms.print();

        Messaging email = new Email();
        email.printConnection();
        email.print();
    }
}