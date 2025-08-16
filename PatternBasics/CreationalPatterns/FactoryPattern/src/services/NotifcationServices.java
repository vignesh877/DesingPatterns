package services;

import factors.NotificationFactory;
import interfaces.Notifications;
public class NotifcationServices {
    public void sendNotification(String NOTIFICATION_TYPE){
        Notifications notification = NotificationFactory.getNotification(NOTIFICATION_TYPE);
        notification.sendNotifications();

    }
}
