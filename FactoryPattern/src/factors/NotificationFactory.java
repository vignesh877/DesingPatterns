package factors;

import notifications.MailNotification;
import interfaces.Notifications;
import notifications.TextNotification;

public class NotificationFactory {
    public static Notifications getNotification(String NOTIFICATION_TYPE){
        if(NOTIFICATION_TYPE.toLowerCase().equals("mail")){
            return new MailNotification();
        }
        return new TextNotification();
    }
}
