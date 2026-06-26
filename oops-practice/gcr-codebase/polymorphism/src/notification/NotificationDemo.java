package notification;

public class NotificationDemo {
    public static void main(String[] args) {
        Notification[] notifications = {
            new EmailNotification("Alice", "Your package has shipped"),
            new SMSNotification("Bob", "Meeting reminder at 3 PM"),
            new PushNotification("Charlie", "You have a new friend request"),
            new EmailNotification("Diana", "Your invoice is ready"),
            new SMSNotification("Eve", "OTP for login is 7843")
        };

        System.out.println("=== Sending All Notifications ===");
        for (Notification n : notifications) {
            n.sendNotification();
        }
    }
}
