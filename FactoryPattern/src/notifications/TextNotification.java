package notifications;

import interfaces.Notifications;

public class TextNotification implements Notifications {
    public  void sendNotifications(){
        System.out.println("Text Notification sended");
    }
}
