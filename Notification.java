import java.time.LocalDateTime;

public class Notification {
    private String notificationID;
    private String message;
    private LocalDateTime sendTime;

    public Notification(String message) {
        this.notificationID = "NOTIF-" + System.currentTimeMillis();
        this.message = message;
        this.sendTime = LocalDateTime.now();
    }

    public void sendNotification() {
        System.out.println("Notification Sent: " + message + " at " + sendTime);
    }

    public void markAsRead() {
        System.out.println("Notification Marked as Read");
    }
}
