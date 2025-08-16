import services.NotifcationServices;

public class Main {
    public static void main(String[] args) {
        NotifcationServices notifcationServices = new NotifcationServices();
        notifcationServices.sendNotification("mail");
        notifcationServices.sendNotification("text");
    }
}