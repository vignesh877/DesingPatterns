public class Main {
    public static void main(String[] args) {
        CheckoutService checkoutService = new CheckoutService("PayU");
        checkoutService.checkOut("22" , 10);

        CheckoutService checkoutService_V1 = new CheckoutService("razorPay");
        checkoutService_V1.checkOut("2552" , 1000);

    }
}