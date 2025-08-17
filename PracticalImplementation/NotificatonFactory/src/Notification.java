import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public interface Notification {
    void createNotification(String message);
}

class EmailNotification implements Notification{
    @Override
    public void createNotification(String message) {
        System.out.println(message+". Email notification sended");
    }
}

class SMSNotiication implements Notification{
    @Override
    public void createNotification(String message) {
        System.out.println(message+". SMS notification sended");
    }
}

class PushNotification implements Notification{
    @Override
    public void createNotification(String message) {
        System.out.println(message+". Push notification send");
    }
}


class NotificationFactory {
   private static Map<String , Supplier<Notification>> notificationRegistery = new HashMap<>();


/*
* EmailNotification::new -> shorthand to create object for supplier
 * */
    NotificationFactory(){
        notificationRegistery.put("User_service" , EmailNotification::new);
        notificationRegistery.put("OTP_service" ,  SMSNotiication::new);
        notificationRegistery.put("rewards_service" , PushNotification::new);
    }

    public void register(String key, Supplier<Notification> creator) {
        notificationRegistery.put(key, creator);
    }
    public void sendNotification(String message , String type){
        Supplier<Notification> supplier = notificationRegistery.get(type);
        if(supplier == null) {
            System.out.println("No such type available");
            return;
        }

        Notification notification = supplier.get();
        notification.createNotification(message);
    }
}