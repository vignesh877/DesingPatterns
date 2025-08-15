public class Main {
    public static void main(String[] args) {
        PaymentService paymentService = new PaymentService(new IndianFactory() , "");
        paymentService.checkOut();
    }
}