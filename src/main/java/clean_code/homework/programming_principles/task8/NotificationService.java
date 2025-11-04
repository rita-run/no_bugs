package clean_code.homework.programming_principles.task8;

public class NotificationService {
    public void sendNotification(Sendable sendable, String message) {
        System.out.println(sendable.send() + message);
    }
}