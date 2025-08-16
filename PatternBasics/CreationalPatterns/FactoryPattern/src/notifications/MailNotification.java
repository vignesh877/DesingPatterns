package notifications;

import interfaces.Notifications;

public class MailNotification implements Notifications {

    @Override
    public void sendNotifications() {
        System.out.println("Mail Notification sended");
    }
}
