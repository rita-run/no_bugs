package clean_code.homework.programming_principles.task8;

public class Main {
    public static void main(String[] args) {
        Sendable email = new EmailSender();
        NotificationService notificationService = new NotificationService();
        notificationService.sendNotification(email, "Hello");
    }
}