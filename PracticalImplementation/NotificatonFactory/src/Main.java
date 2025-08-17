public class Main {
    public static void main(String[] args) {
        NotificationFactory notificationFactory = new NotificationFactory();

        notificationFactory.sendNotification("User created Sucessfully" , "User_service");
        notificationFactory.register("Delete_user" , EmailNotification::new);

        notificationFactory.sendNotification("User Deleted" , "Delete_user");

    }
}